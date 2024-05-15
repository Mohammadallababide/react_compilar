// Generated from C:/Users/moha lebo/Desktop/Reactjs/src/Grammar/ParserReact.g4 by ANTLR 4.13.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ParserReact}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserReactVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ParserReact#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(ParserReact.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#export}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExport(ParserReact.ExportContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#importR}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportR(ParserReact.ImportRContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#destination_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestination_name(ParserReact.Destination_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#react_libraries}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReact_libraries(ParserReact.React_librariesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#syntax}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSyntax(ParserReact.SyntaxContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#attributes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributes(ParserReact.AttributesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ParserReact.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#attributeValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeValue(ParserReact.AttributeValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ParserReact.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#useState}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseState(ParserReact.UseStateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ParserReact.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ParserReact.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#arrayy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayy(ParserReact.ArrayyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(ParserReact.ParContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#map}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMap(ParserReact.MapContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#onClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClick(ParserReact.OnClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#mapMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMapMethod(ParserReact.MapMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#jsxElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxElement(ParserReact.JsxElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#jsxChild2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxChild2(ParserReact.JsxChild2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#jsxOpenTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxOpenTag(ParserReact.JsxOpenTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#jsxChild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxChild(ParserReact.JsxChildContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ParserReact.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#jsxCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsxCode(ParserReact.JsxCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(ParserReact.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(ParserReact.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(ParserReact.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(ParserReact.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(ParserReact.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(ParserReact.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#arrow_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrow_function(ParserReact.Arrow_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#normal_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNormal_function(ParserReact.Normal_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#function_header}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_header(ParserReact.Function_headerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(ParserReact.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#sub_function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub_function_body(ParserReact.Sub_function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#instructions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructions(ParserReact.InstructionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#functional_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional_instruction(ParserReact.Functional_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#nonfunctional_instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonfunctional_instruction(ParserReact.Nonfunctional_instructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#call_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall_function(ParserReact.Call_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#callback_func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallback_func(ParserReact.Callback_funcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(ParserReact.ArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#prameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrameters(ParserReact.PrametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#return_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_rule(ParserReact.Return_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#exiting_loops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExiting_loops(ParserReact.Exiting_loopsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_type(ParserReact.Return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#print_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statment(ParserReact.Print_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#indisde_the_print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndisde_the_print(ParserReact.Indisde_the_printContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#if_else_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else_rule(ParserReact.If_else_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_rule(ParserReact.If_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#else_if_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_rule(ParserReact.Else_if_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#else_rulse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_rulse(ParserReact.Else_rulseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#while_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_rule(ParserReact.While_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo_while(ParserReact.Do_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#for_loop_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop_rule(ParserReact.For_loop_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#inside_for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside_for_loop(ParserReact.Inside_for_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(ParserReact.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#switch_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_rule(ParserReact.Switch_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#defult}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefult(ParserReact.DefultContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#case_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_rule(ParserReact.Case_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#defination_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefination_type(ParserReact.Defination_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#general_creating}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneral_creating(ParserReact.General_creatingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#creating_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreating_with_assign(ParserReact.Creating_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_without_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_without_assign(ParserReact.Create_without_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#genral_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenral_assign(ParserReact.Genral_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#varible_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarible_name(ParserReact.Varible_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#assign_varible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_varible(ParserReact.Assign_varibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_varible_without_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_varible_without_assign(ParserReact.Create_varible_without_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_varible_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_varible_with_assign(ParserReact.Create_varible_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_name(ParserReact.Array_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#assign_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_array(ParserReact.Assign_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_array_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_array_form(ParserReact.Create_array_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_Array_without_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_Array_without_assign(ParserReact.Create_Array_without_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_Array_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_Array_with_assign(ParserReact.Create_Array_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_base_form_without_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_base_form_without_index(ParserReact.Array_base_form_without_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_base_form_with_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_base_form_with_index(ParserReact.Array_base_form_with_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_identifier_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_identifier_form(ParserReact.Array_identifier_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_boolean_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_boolean_form(ParserReact.Array_boolean_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_integer_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_integer_form(ParserReact.Array_integer_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_charecter_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_charecter_form(ParserReact.Array_charecter_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_objects_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_objects_form(ParserReact.Array_objects_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_objects_form2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_objects_form2(ParserReact.Array_objects_form2Context ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_varible_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_varible_form(ParserReact.Array_varible_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_anyType_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_anyType_form(ParserReact.Array_anyType_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#array_arrayes_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_arrayes_form(ParserReact.Array_arrayes_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#value_left_side}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_left_side(ParserReact.Value_left_sideContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#left_side_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_side_array(ParserReact.Left_side_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#json_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_name(ParserReact.Json_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#assign_json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_json(ParserReact.Assign_jsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_json_form}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_json_form(ParserReact.Create_json_formContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_json_object_without_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_json_object_without_assign(ParserReact.Create_json_object_without_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#create_json_with_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_json_with_assign(ParserReact.Create_json_with_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#inside_json_statmnet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInside_json_statmnet(ParserReact.Inside_json_statmnetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#json_statment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_statment(ParserReact.Json_statmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#value_json_statmnet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_json_statmnet(ParserReact.Value_json_statmnetContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#varible_from_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarible_from_object(ParserReact.Varible_from_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#shortcut_statments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortcut_statments(ParserReact.Shortcut_statmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#any_arithmetic_oprator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_arithmetic_oprator(ParserReact.Any_arithmetic_opratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ParserReact.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#bool_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_expression(ParserReact.Bool_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#intral_expression_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntral_expression_value(ParserReact.Intral_expression_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ParserReact#use_random_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_random_name(ParserReact.Use_random_nameContext ctx);
}