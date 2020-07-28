package dev.matthewwarren.kube.ast.simple

import dev.matthewwarren.kube.antlr.KubeBaseVisitor
import dev.matthewwarren.kube.antlr.KubeParser.*

class KubeVisitor: KubeBaseVisitor<ASTNode>() {
    override fun visitFile(ctx: FileContext): ASTFile {
        return ASTFile(ctx.module().map {visitModule(it)})
	}
    
    override fun visitModule(ctx: ModuleContext): ASTModule {
        val name = ctx.Identifier().text!!
        val imports = ctx.importExpr().map {it.Identifier().text!!}
        val contents = ctx.moduleContent().map(this::visitModuleContent)
        
        return ASTModule(name, imports, contents)
	}
    
    override fun visitModuleContent(ctx: ModuleContentContext): ASTModuleContent {
        val annotations = ctx.annotation().map(this::visitAnnotation)
        val content = visit(ctx.children.last()) as ASTModuleContent
        
        if(content is Annotatable)
            content.annotations.addAll(annotations)
        
        return content
	}
    
    override fun visitTypeAlias(ctx: TypeAliasContext): ASTTypeAlias {
        val newName = ctx.Identifier().text
        val type = visitType(ctx.type())
        return ASTTypeAlias(newName, type)
    }
    
    override fun visitAlias(ctx: AliasContext): ASTAlias {
        val ids = ctx.Identifier()
        val newName = ids[0].text
        
        val oldName = ids.toStringPair(1)
        
        return ASTAlias(newName, oldName)
	}
    
    override fun visitInterface0(ctx: Interface0Context): ASTInterface {
        val name = ctx.Identifier().text
        val genericDeclaration = ctx.genericDeclaration()?.let(this::visitGenericDeclaration)
        val interfaces = ctx.type()?.let(this::visitType)
        val elements = ctx.interfaceElement().map(this::visitInterfaceElement)
        
        return ASTInterface(name, genericDeclaration, interfaces, elements)
	}
    
    override fun visitInterfaceElement(ctx: InterfaceElementContext): ASTInterfaceContent {
        val annotations = ctx.annotation().map(this::visitAnnotation)
        val content = visit(ctx.children.last()) as ASTInterfaceContent
        
        if(content is Annotatable)
            content.annotations.addAll(annotations)
    
        return content
	}
    
    override fun visitClass0(ctx: Class0Context): ASTClass {
        val name = ctx.Identifier().text
        val genericDeclaration = ctx.genericDeclaration()?.let(this::visitGenericDeclaration)
        val primaryConstructor = ctx.primaryConstructor()?.constructorParameter()?.map(this::visitConstructorParameter) ?: emptyList()
        val interfaces = ctx.type()?.let(this::visitType)
        val delegates = ctx.expression().map(this::visitExpression)
        val elements = ctx.classElement().map(this::visitClassElement)
        
        return ASTClass(name, genericDeclaration, primaryConstructor, interfaces, delegates, elements)
	}
    
    override fun visitClassElement(ctx: ClassElementContext): ASTClassContent {
        val annotations = ctx.annotation().map(this::visitAnnotation)
        val content = visit(ctx.children.last()) as ASTClassContent
    
        if(content is Annotatable)
            content.annotations.addAll(annotations)
    
        return content
	}
    
    override fun visitObject0(ctx: Object0Context): ASTObject {
        val name = ctx.Identifier().text
        val interfaces = ctx.type()?.let(this::visitType)
        val delegates = ctx.expression().map(this::visitExpression)
        val elements = ctx.objectElement().map(this::visitObjectElement)
    
        return ASTObject(name, interfaces, delegates, elements)
	}
    
    override fun visitObjectElement(ctx: ObjectElementContext): ASTObjectContent {
        val annotations = ctx.annotation().map(this::visitAnnotation)
        val content = visit(ctx.children.last()) as ASTObjectContent
    
        if(content is Annotatable)
            content.annotations.addAll(annotations)
    
        return content
	}
    
    override fun visitEnum0(ctx: Enum0Context): ASTEnum {
        val name = ctx.Identifier().text
        val primaryConstructor = ctx.primaryConstructor()?.constructorParameter()?.map(this::visitConstructorParameter) ?: emptyList()
        val interfaces = ctx.type()?.let(this::visitType)
        val enumValues = ctx.enumList().enumValue().map(this::visitEnumValue)
        val elements = ctx.enumElement().map(this::visitEnumElement)
        
        return ASTEnum(name, primaryConstructor, interfaces, enumValues, elements)
	}
    
    override fun visitAnnotation(ctx: AnnotationContext): ASTAnnotation {
        val (module, name) = ctx.Identifier().toStringPair()
        val parameters = ctx.parameterExpression().map {
            Pair(it.Identifier()?.text, visitExpression(it.expression()))
        }
        
        return ASTAnnotation(module, name, parameters)
	}
    
    override fun visitEnumList(ctx: EnumListContext): Nothing {
        throw IllegalStateException("Do not call this")
	}
    
    override fun visitEnumValue(ctx: EnumValueContext): ASTEnumValue {
        val name = ctx.Identifier().text
        val parameters = ctx.parameterExpression().map {Pair(it.Identifier()?.text, visitExpression(it.expression()))}
        
        return ASTEnumValue(name, parameters)
	}
    
    override fun visitParameterExpression(ctx: ParameterExpressionContext): Nothing {
        throw IllegalStateException("Do not call this")
	}
    
    override fun visitEnumElement(ctx: EnumElementContext): ASTEnumContent {
        val annotations = ctx.annotation().map(this::visitAnnotation)
        val content = visit(ctx.children.last()) as ASTEnumContent
    
        if(content is Annotatable)
            content.annotations.addAll(annotations)
    
        return content
	}
    
    override fun visitVariable(ctx: VariableContext): ASTVariable {
        val declaration = visitVariableDeclaration(ctx.variableDeclaration())
        if(ctx.By() != null) {
            val expression = visitExpression(ctx.expression())
            return ASTVariable(declaration.name, declaration.type, expression, true, null, null)
        }
        else {
            val expression = ctx.expression()?.let(this::visitExpression)
            val getter = ctx.getter()?.let(this::visitGetter)
            val setter = ctx.setter()?.let(this::visitSetter)
            return ASTVariable(declaration.name, declaration.type, expression, false, getter, setter)
        }
	}
    
    override fun visitVariableDeclaration(ctx: VariableDeclarationContext): ASTVariableDeclaration {
        val name = ctx.Identifier().text
        val type = ctx.type()?.let(this::visitType)
        
        return ASTVariableDeclaration(name, type)
	}
    
    override fun visitValue(ctx: ValueContext): ASTValue {
        val declaration = visitValueDeclaration(ctx.valueDeclaration())
        if(ctx.By() != null) {
            val expression = visitExpression(ctx.expression())
            return ASTValue(declaration.name, declaration.type, expression, true, null)
        }
        else {
            val expression = ctx.expression()?.let(this::visitExpression)
            val getter = ctx.getter()?.let(this::visitGetter)
            return ASTValue(declaration.name, declaration.type, expression, false, getter)
        }
	}
    
    override fun visitValueDeclaration(ctx: ValueDeclarationContext): ASTValueDeclaration {
        val name = ctx.Identifier().text
        val type = ctx.type()?.let(this::visitType)
    
        return ASTValueDeclaration(name, type)
	}
    
    override fun visitGetter(ctx: GetterContext): ASTGetter {
        val statements = ctx.statement().map(this::visitStatement)
        return ASTGetter(statements)
	}
    
    override fun visitSetter(ctx: SetterContext): ASTSetter {
        val parameter = ctx.Identifier().text
        val statements = ctx.statement().map(this::visitStatement)
        return ASTSetter(parameter, statements)
	}
    
    override fun visitFunction(ctx: FunctionContext): ASTFunction {
        val declaration = visitFunctionDeclaration(ctx.functionDeclaration())
        val statements = ctx.statement().map(this::visitStatement)
        
        return ASTFunction(declaration.name, declaration.genericDeclaration, declaration.parameters, declaration.returnType, statements)
	}
    
    override fun visitFunctionDeclaration(ctx: FunctionDeclarationContext): ASTFunctionDeclaration {
        val name = ctx.Identifier().text
        val genericDeclaration = ctx.genericDeclaration()?.let(this::visitGenericDeclaration)
        val parameters = ctx.parameter().map(this::visitParameter)
        val returnType = ctx.type()?.let(this::visitType)
        
        return ASTFunctionDeclaration(name, genericDeclaration, parameters, returnType)
	}
    
    override fun visitParameter(ctx: ParameterContext): ASTParameter {
        val name = ctx.Identifier().text
        val type = visitType(ctx.type())
        val expression = ctx.expression()?.let(this::visitExpression)
        
        return ASTParameter(name, type, expression)
	}
    
    override fun visitInitializer(ctx: InitializerContext): ASTInitializer {
        val statements = ctx.statement().map(this::visitStatement)
        return ASTInitializer(statements)
    }
    
    override fun visitFinalizer(ctx: FinalizerContext): ASTFinalizer {
        val statements = ctx.statement().map(this::visitStatement)
        return ASTFinalizer(statements)
	}
    
    override fun visitPrimaryConstructor(ctx: PrimaryConstructorContext): Nothing {
        throw IllegalStateException("Do not call this")
	}
    
    override fun visitConstructorParameter(ctx: ConstructorParameterContext): ASTConstructorParameter {
        val variableType = if(ctx.Val() != null)
            VariableType.VALUE
        else if(ctx.Var() != null)
            VariableType.VARIABLE
        else
            VariableType.CONSTRUCTOR_ONLY
        
        val parameter = visitParameter(ctx.parameter())
        
        return ASTConstructorParameter(variableType, parameter)
	}
    
    override fun visitConstructor(ctx: ConstructorContext): ASTConstructor {
        val parameters = ctx.parameter().map(this::visitParameter)
        val parentConstructorParameters = ctx.constructorCall()?.parameterExpression()?.map {Pair(it.Identifier()?.text, visitExpression(it.expression()))} ?: emptyList()
        val statements = ctx.statement().map(this::visitStatement)
        
        return ASTConstructor(parameters, parentConstructorParameters, statements)
	}
    
    override fun visitConstructorCall(ctx: ConstructorCallContext): Nothing {
        throw IllegalStateException("Do not call this")
	}
    
    override fun visitStatement(ctx: StatementContext): ASTStatement {
        return when {
            ctx.variable() != null -> ASTVariableStatement(visitVariable(ctx.variable()))
            ctx.value() != null -> ASTValueStatement(visitValue(ctx.value()))
            ctx.expression().size == 1 -> ASTExpressionStatement(visitExpression(ctx.expression(0)))
            ctx.expression().size == 2 -> {
                val leftExpression = visitExpression(ctx.expression(0))
                val rightExpression = visitExpression(ctx.expression(1))
                val assignmentOperator = when(ctx.assignmentOperator().text) {
                    "=" -> AssignmentOperator.ASSIGN
                    "*=" -> AssignmentOperator.MULTIPLY_ASSIGN
                    "/=" -> AssignmentOperator.DIVIDE_ASSIDE
                    "%=" -> AssignmentOperator.MODULUS_ASSIGN
                    "+=" -> AssignmentOperator.ADD_ASSIGN
                    "-=" -> AssignmentOperator.SUBTRACT_ASSIGN
                    "<<=" -> AssignmentOperator.LEFT_SHIFT_ASSIGN
                    ">>=" -> AssignmentOperator.ARITHMETIC_RIGHT_SHIFT_ASSIGN
                    ">>>=" -> AssignmentOperator.LOGICAL_RIGHT_SHIFT_ASSIGN
                    "&=" -> AssignmentOperator.BITWISE_AND_ASSIGN
                    "^=" -> AssignmentOperator.BITWISE_XOR_ASSIGN
                    "|=" -> AssignmentOperator.BITWISE_OR_ASSIGN
                    else -> throw IllegalStateException("Invalid Assignment Operator. Should never happen.")
                }
                
                ASTAssignmentStatement(assignmentOperator, leftExpression, rightExpression)
            }
            else -> visit(ctx.getChild(0)) as ASTStatement
        }
	}
    
    override fun visitIfStatement(ctx: IfStatementContext): ASTIfStatement {
        val condition = visitExpression(ctx.expression())
        val thenBlock = ctx.statement().map(this::visitStatement)
        val elseBlock = ctx.elseBlock()?.statement()?.map(this::visitStatement) ?: emptyList()
        
        return ASTIfStatement(condition, thenBlock, elseBlock)
	}
    
    override fun visitElseBlock(ctx: ElseBlockContext): ASTNode {
        throw IllegalStateException("Do not call this")
	}
    
    override fun visitWhenStatement(ctx: WhenStatementContext): ASTWhenStatement {

	}
    
    override fun visitWhenStatementEntry(ctx: WhenStatementEntryContext): ASTNode {

	}
    
    override fun visitWhenCondition(ctx: WhenConditionContext): ASTNode {

	}
    
    override fun visitRangeTest(ctx: RangeTestContext): ASTNode {

	}
    
    override fun visitTypeTest(ctx: TypeTestContext): ASTNode {

	}
    
    override fun visitMemberTest(ctx: MemberTestContext): ASTNode {

	}
    
    override fun visitForLoop(ctx: ForLoopContext): ASTForLoop {
        val variable = ctx.Identifier().text
        val expression = visitExpression(ctx.expression())
        val statements = ctx.statement().map(this::visitStatement)
        
        return ASTForLoop(variable, expression, statements)
	}
    
    override fun visitWhileLoop(ctx: WhileLoopContext): ASTWhileLoop {
        val condition = visitExpression(ctx.expression())
        val statements = ctx.statement().map(this::visitStatement)
        return ASTWhileLoop(condition, statements, false)
	}
    
    override fun visitDoWhileLoop(ctx: DoWhileLoopContext): ASTWhileLoop {
        val condition = visitExpression(ctx.expression())
        val statements = ctx.statement().map(this::visitStatement)
        return ASTWhileLoop(condition, statements, true)
	}
    
    override fun visitAssignmentOperator(ctx: AssignmentOperatorContext): Nothing {
        throw IllegalStateException("Do not call this")
	}
    
    override fun visitExpression(ctx: ExpressionContext): ASTExpression {

	}
    
    override fun visitLogicalOrExpression(ctx: LogicalOrExpressionContext): ASTNode {

	}
    
    override fun visitLogicalAndExpression(ctx: LogicalAndExpressionContext): ASTNode {

	}
    
    override fun visitEqualityExpression(ctx: EqualityExpressionContext): ASTNode {

	}
    
    override fun visitComparisonExpression(ctx: ComparisonExpressionContext): ASTNode {

	}
    
    override fun visitInfixOperation(ctx: InfixOperationContext): ASTNode {

	}
    
    override fun visitElvisExpression(ctx: ElvisExpressionContext): ASTNode {

	}
    
    override fun visitRangeExpression(ctx: RangeExpressionContext): ASTNode {

	}
    
    override fun visitBitwiseExpression(ctx: BitwiseExpressionContext): ASTNode {

	}
    
    override fun visitAdditiveExpression(ctx: AdditiveExpressionContext): ASTNode {

	}
    
    override fun visitMultiplicativeExpression(ctx: MultiplicativeExpressionContext): ASTNode {

	}
    
    override fun visitPrefixUnaryExpression(ctx: PrefixUnaryExpressionContext): ASTNode {

	}
    
    override fun visitPostfixUnaryExpression(ctx: PostfixUnaryExpressionContext): ASTNode {

	}
    
    override fun visitPostfixUnarySuffix(ctx: PostfixUnarySuffixContext): ASTNode {

	}
    
    override fun visitCallSuffix(ctx: CallSuffixContext): ASTNode {

	}
    
    override fun visitIndexingSuffix(ctx: IndexingSuffixContext): ASTNode {

	}
    
    override fun visitNavigationSuffix(ctx: NavigationSuffixContext): ASTNode {

	}
    
    override fun visitPrimaryExpression(ctx: PrimaryExpressionContext): ASTNode {

	}
    
    override fun visitThisExpression(ctx: ThisExpressionContext): ASTNode {

	}
    
    override fun visitLiteral(ctx: LiteralContext): ASTNode {

	}
    
    override fun visitArray(ctx: ArrayContext): ASTNode {

	}
    
    override fun visitMap(ctx: MapContext): ASTNode {

	}
    
    override fun visitSet(ctx: SetContext): ASTNode {

	}
    
    override fun visitTuple(ctx: TupleContext): ASTNode {

	}
    
    override fun visitLambdaLiteral(ctx: LambdaLiteralContext): ASTNode {

	}
    
    override fun visitLambdaParameter(ctx: LambdaParameterContext): ASTNode {

	}
    
    override fun visitObjectLiteral(ctx: ObjectLiteralContext): ASTNode {

	}
    
    override fun visitReturnExpression(ctx: ReturnExpressionContext): ASTNode {

	}
    
    override fun visitMemberAccess(ctx: MemberAccessContext): ASTNode {

	}
    
    override fun visitPostUnaryOperator(ctx: PostUnaryOperatorContext): ASTNode {

	}
    
    override fun visitPreUnaryOperator(ctx: PreUnaryOperatorContext): ASTNode {

	}
    
    override fun visitMultiplicativeOperator(ctx: MultiplicativeOperatorContext): ASTNode {

	}
    
    override fun visitAdditiveOperator(ctx: AdditiveOperatorContext): ASTNode {

	}
    
    override fun visitBitwiseOperator(ctx: BitwiseOperatorContext): ASTNode {

	}
    
    override fun visitRangeOperator(ctx: RangeOperatorContext): ASTNode {

	}
    
    override fun visitRelationalOperator(ctx: RelationalOperatorContext): ASTNode {

	}
    
    override fun visitIsOperator(ctx: IsOperatorContext): ASTNode {

	}
    
    override fun visitInOperator(ctx: InOperatorContext): ASTNode {

	}
    
    override fun visitHasOperator(ctx: HasOperatorContext): ASTNode {

	}
    
    override fun visitEqualityOperator(ctx: EqualityOperatorContext): ASTNode {

	}
    
    override fun visitIfExpression(ctx: IfExpressionContext): ASTNode {

	}
    
    override fun visitElseExpression(ctx: ElseExpressionContext): ASTNode {

	}
    
    override fun visitWhenExpression(ctx: WhenExpressionContext): ASTNode {

	}
    
    override fun visitWhenExpressionEntry(ctx: WhenExpressionEntryContext): ASTNode {

	}
    
    override fun visitGenericDeclaration(ctx: GenericDeclarationContext): ASTGenericDeclaration {
        val nameTypeMapping = ctx.genericTypeDeclaration().map {
            Pair(it.Identifier().text, it.type()?.let(this::visitType))
        }
        
        return ASTGenericDeclaration(nameTypeMapping)
	}
    
    override fun visitGeneric(ctx: GenericContext): ASTGeneric {
        val types = ctx.type().map(this::visitType)
        return ASTGeneric(types)
	}
    
    override fun visitType(ctx: TypeContext): ASTType {
        return visitUnionType(ctx.unionType())
	}
    
    override fun visitUnionType(ctx: UnionTypeContext): ASTUnionType {
        val types = ctx.intersectionType().map(this::visitIntersectionType)
        return ASTUnionType(types)
	}
    
    override fun visitIntersectionType(ctx: IntersectionTypeContext): ASTIntersectionType {
        val types = ctx.primaryType().map(this::visitPrimaryType)
        return ASTIntersectionType(types)
	}
    
    override fun visitPrimaryType(ctx: PrimaryTypeContext): ASTPrimaryType {
        return when {
            ctx.Identifier().isNotEmpty() -> {
                val (module, name) = ctx.Identifier().toStringPair()
                val generic = ctx.generic()?.let(this::visitGeneric)
                ASTSimpleType(module, name, generic)
            }
            ctx.functionType() != null -> {
                visitFunctionType(ctx.functionType())
            }
            else -> {
                ASTParenthesizedType(visitType(ctx.type()))
            }
        }
	}
    
    override fun visitFunctionType(ctx: FunctionTypeContext): ASTFunctionType {
        val parameterTypes = ctx.functionParameterTypes().type().map(this::visitType)
        val returnType = visitType(ctx.type())
        
        return ASTFunctionType(parameterTypes, returnType)
	}
}