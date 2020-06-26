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
    
    override fun visitInitializer(ctx: InitializerContext): ASTInitializer {
        val statements = ctx.statement().map(this::visitStatement)
        return ASTInitializer(statements)
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
        val superType = ctx.type()?.let(this::visitType)
        val elements = ctx.interfaceElement().map(this::visitInterfaceElement)
        
        return ASTInterface(name, genericDeclaration, superType, elements)
	}
    
    override fun visitInterfaceElement(ctx: InterfaceElementContext): ASTInterfaceContent {
        val annotations = ctx.annotation().map(this::visitAnnotation)
        val content = visit(ctx.children.last()) as ASTInterfaceContent
        
        if(content is Annotatable)
            content.annotations.addAll(annotations)
    
        return content
	}
    
    override fun visitClass0(ctx: Class0Context): ASTClass {

	}
    
    override fun visitClassElement(ctx: ClassElementContext): ASTNode {

	}
    
    override fun visitObject0(ctx: Object0Context): ASTObject {

	}
    
    override fun visitObjectElement(ctx: ObjectElementContext): ASTNode {

	}
    
    override fun visitEnum0(ctx: Enum0Context): ASTEnum {

	}
    
    override fun visitAnnotation(ctx: AnnotationContext): ASTAnnotation {
        val (module, name) = ctx.Identifier().toStringPair()
        val parameters = ctx.parameterExpression().map {
            Pair(it.Identifier()?.text, visitExpression(it.expression()))
        }
        
        return ASTAnnotation(module, name, parameters)
	}
    
    override fun visitEnumList(ctx: EnumListContext): ASTNode {

	}
    
    override fun visitEnumValue(ctx: EnumValueContext): ASTNode {

	}
    
    override fun visitParameterExpression(ctx: ParameterExpressionContext): ASTNode {

	}
    
    override fun visitEnumElement(ctx: EnumElementContext): ASTNode {

	}
    
    override fun visitVariable(ctx: VariableContext): ASTVariable {

	}
    
    override fun visitVariableDeclaration(ctx: VariableDeclarationContext): ASTNode {

	}
    
    override fun visitValue(ctx: ValueContext): ASTValue {

	}
    
    override fun visitValueDeclaration(ctx: ValueDeclarationContext): ASTNode {

	}
    
    override fun visitGetter(ctx: GetterContext): ASTNode {

	}
    
    override fun visitSetter(ctx: SetterContext): ASTNode {

	}
    
    override fun visitFunction(ctx: FunctionContext): ASTFunction {

	}
    
    override fun visitFunctionDeclaration(ctx: FunctionDeclarationContext): ASTNode {

	}
    
    override fun visitParameter(ctx: ParameterContext): ASTNode {

	}
    
    override fun visitFinalizer(ctx: FinalizerContext): ASTNode {

	}
    
    override fun visitPrimaryConstructor(ctx: PrimaryConstructorContext): ASTNode {

	}
    
    override fun visitConstructorParameter(ctx: ConstructorParameterContext): ASTNode {

	}
    
    override fun visitConstructor(ctx: ConstructorContext): ASTNode {

	}
    
    override fun visitConstructorCall(ctx: ConstructorCallContext): ASTNode {

	}
    
    override fun visitStatement(ctx: StatementContext): ASTStatement {

	}
    
    override fun visitIfStatement(ctx: IfStatementContext): ASTNode {

	}
    
    override fun visitElseBlock(ctx: ElseBlockContext): ASTNode {

	}
    
    override fun visitWhenStatement(ctx: WhenStatementContext): ASTNode {

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
    
    override fun visitForLoop(ctx: ForLoopContext): ASTNode {

	}
    
    override fun visitWhileLoop(ctx: WhileLoopContext): ASTNode {

	}
    
    override fun visitDoWhileLoop(ctx: DoWhileLoopContext): ASTNode {

	}
    
    override fun visitAssignmentOperator(ctx: AssignmentOperatorContext): ASTNode {

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