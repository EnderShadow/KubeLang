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
        val contents = ctx.moduleContent().map {visitModuleContent(it)}
        
        return ASTModule(name, imports, contents)
	}
    
    override fun visitModuleContent(ctx: ModuleContentContext): ASTModuleContentNode {
        val annotations = ctx.annotation1().map {
            val ids = it.Identifier()
            if(ids.size == 1)
                Pair(null, ids[0].text)
            else
                Pair(ids[0].text, ids[1].text)
        }
        val content = visit(ctx.children.last()) as ASTModuleContentNode
        
        if(content is Annotatable)
            content.annotations.addAll(annotations)
        
        return content
	}
    
    override fun visitInitializer(ctx: InitializerContext): ASTInitializer {
        val statements = ctx.statement().map {visitStatement(it)}
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
        
        val oldName = if(ids.size == 2)
            Pair(null, ids[1].text)
        else
            Pair(ids[1].text, ids[2].text)
        
        return ASTAlias(newName, oldName)
	}
    
    override fun visitInterface0(ctx: Interface0Context): ASTNode {

	}
    
    override fun visitInterfaceElement(ctx: InterfaceElementContext): ASTNode {

	}
    
    override fun visitClass0(ctx: Class0Context): ASTNode {

	}
    
    override fun visitClassElement(ctx: ClassElementContext): ASTNode {

	}
    
    override fun visitObject0(ctx: Object0Context): ASTNode {

	}
    
    override fun visitObjectElement(ctx: ObjectElementContext): ASTNode {

	}
    
    override fun visitEnum0(ctx: Enum0Context): ASTNode {

	}
    
    override fun visitAnnotation0(ctx: Annotation0Context): ASTNode {

	}
    
    override fun visitAnnotation1(ctx: Annotation1Context): ASTNode {

	}
    
    override fun visitEnumList(ctx: EnumListContext): ASTNode {

	}
    
    override fun visitEnumValue(ctx: EnumValueContext): ASTNode {

	}
    
    override fun visitParameterExpression(ctx: ParameterExpressionContext): ASTNode {

	}
    
    override fun visitEnumElement(ctx: EnumElementContext): ASTNode {

	}
    
    override fun visitVariable(ctx: VariableContext): ASTNode {

	}
    
    override fun visitVariableDeclaration(ctx: VariableDeclarationContext): ASTNode {

	}
    
    override fun visitValue(ctx: ValueContext): ASTNode {

	}
    
    override fun visitValueDeclaration(ctx: ValueDeclarationContext): ASTNode {

	}
    
    override fun visitGetter(ctx: GetterContext): ASTNode {

	}
    
    override fun visitSetter(ctx: SetterContext): ASTNode {

	}
    
    override fun visitFunction(ctx: FunctionContext): ASTNode {

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
    
    override fun visitExpression(ctx: ExpressionContext): ASTNode {

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
    
    override fun visitGenericDeclaration(ctx: GenericDeclarationContext): ASTNode {

	}
    
    override fun visitGenericTypeDeclaration(ctx: GenericTypeDeclarationContext): ASTNode {

	}
    
    override fun visitGeneric(ctx: GenericContext): ASTNode {

	}
    
    override fun visitType(ctx: TypeContext): ASTType {

	}
    
    override fun visitUnionType(ctx: UnionTypeContext): ASTNode {

	}
    
    override fun visitSumType(ctx: SumTypeContext): ASTNode {

	}
    
    override fun visitPrimaryType(ctx: PrimaryTypeContext): ASTNode {

	}
    
    override fun visitFunctionType(ctx: FunctionTypeContext): ASTNode {

	}
    
    override fun visitFunctionParameterTypes(ctx: FunctionParameterTypesContext): ASTNode {
    
    }
}