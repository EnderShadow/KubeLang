// Generated from /home/matthew/Desktop/Programming/Kotlin/Projects/KubeCompiler/grammar/Kube.g4 by ANTLR 4.8
package dev.matthewwarren.kube.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KubeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KubeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KubeParser#file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile(KubeParser.FileContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#module}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule(KubeParser.ModuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#importExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportExpr(KubeParser.ImportExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#moduleContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuleContent(KubeParser.ModuleContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(KubeParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#typeAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAlias(KubeParser.TypeAliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#interface0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterface0(KubeParser.Interface0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#interfaceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterfaceElement(KubeParser.InterfaceElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#class0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass0(KubeParser.Class0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#classElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassElement(KubeParser.ClassElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#object0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject0(KubeParser.Object0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#objectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectElement(KubeParser.ObjectElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#enum0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum0(KubeParser.Enum0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#annotation0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation0(KubeParser.Annotation0Context ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#annotation1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation1(KubeParser.Annotation1Context ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#enumList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumList(KubeParser.EnumListContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(KubeParser.EnumValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#parameterExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterExpression(KubeParser.ParameterExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#enumElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumElement(KubeParser.EnumElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(KubeParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(KubeParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(KubeParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#valueDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueDeclaration(KubeParser.ValueDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#getter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetter(KubeParser.GetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#setter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetter(KubeParser.SetterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(KubeParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(KubeParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(KubeParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#initializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitializer(KubeParser.InitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#finalizer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalizer(KubeParser.FinalizerContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#primaryConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryConstructor(KubeParser.PrimaryConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#constructorParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorParameter(KubeParser.ConstructorParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructor(KubeParser.ConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#constructorCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorCall(KubeParser.ConstructorCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(KubeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(KubeParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(KubeParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#whenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenStatement(KubeParser.WhenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#whenStatementEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenStatementEntry(KubeParser.WhenStatementEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#whenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenCondition(KubeParser.WhenConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#rangeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeTest(KubeParser.RangeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#typeTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTest(KubeParser.TypeTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#memberTest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberTest(KubeParser.MemberTestContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(KubeParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(KubeParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#doWhileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileLoop(KubeParser.DoWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(KubeParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(KubeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(KubeParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(KubeParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(KubeParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(KubeParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#infixOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixOperation(KubeParser.InfixOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#elvisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElvisExpression(KubeParser.ElvisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#rangeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeExpression(KubeParser.RangeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#bitwiseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseExpression(KubeParser.BitwiseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(KubeParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(KubeParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#prefixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixUnaryExpression(KubeParser.PrefixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#postfixUnaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnaryExpression(KubeParser.PostfixUnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#postfixUnarySuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostfixUnarySuffix(KubeParser.PostfixUnarySuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#callSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSuffix(KubeParser.CallSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#indexingSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexingSuffix(KubeParser.IndexingSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#navigationSuffix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNavigationSuffix(KubeParser.NavigationSuffixContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(KubeParser.PrimaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#thisExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThisExpression(KubeParser.ThisExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(KubeParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(KubeParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(KubeParser.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(KubeParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#tuple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuple(KubeParser.TupleContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#lambdaLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaLiteral(KubeParser.LambdaLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#lambdaParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaParameter(KubeParser.LambdaParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(KubeParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#returnExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnExpression(KubeParser.ReturnExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#memberAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberAccess(KubeParser.MemberAccessContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#postUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostUnaryOperator(KubeParser.PostUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#preUnaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreUnaryOperator(KubeParser.PreUnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#multiplicativeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeOperator(KubeParser.MultiplicativeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#additiveOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveOperator(KubeParser.AdditiveOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#bitwiseOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitwiseOperator(KubeParser.BitwiseOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#rangeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRangeOperator(KubeParser.RangeOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#relationalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOperator(KubeParser.RelationalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#isOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOperator(KubeParser.IsOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#inOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOperator(KubeParser.InOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#hasOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasOperator(KubeParser.HasOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#equalityOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityOperator(KubeParser.EqualityOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#ifExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpression(KubeParser.IfExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#elseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseExpression(KubeParser.ElseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#whenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExpression(KubeParser.WhenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#whenExpressionEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenExpressionEntry(KubeParser.WhenExpressionEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#genericDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericDeclaration(KubeParser.GenericDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#genericTypeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericTypeDeclaration(KubeParser.GenericTypeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#generic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneric(KubeParser.GenericContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(KubeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#unionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionType(KubeParser.UnionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#sumType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumType(KubeParser.SumTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#primaryType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryType(KubeParser.PrimaryTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(KubeParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link KubeParser#functionParameterTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameterTypes(KubeParser.FunctionParameterTypesContext ctx);
}