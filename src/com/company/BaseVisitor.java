package com.company;

import AST.App.App;
import AST.instruction.function.*;
import AST.Common.Variable_Name;
import AST.ImportAst.ImportR;
import AST.OldAst.*;
import AST.instruction.function.FunctionBody;
import AST.instruction.function.ParametesandArgs.Parameter;
import AST.instruction.function.ParametesandArgs.Args;
import AST.arrayandjson.*;
import AST.Common.VariableWithOperator;
import AST.assignmnet.AssignArray;
import AST.assignmnet.Assignment;
import AST.assignmnet.JsonAssign;
import AST.assignmnet.assign_variable;
import AST.creating.*;
import AST.creating.Array.ArrayOfArrayForm;
import AST.creating.Array.CreateArrayWithAssign;
import AST.creating.Array.CreateArrayWithoutAssign;
import AST.creating.Json.CreateJsonWithAssign;
import AST.creating.Json.CreateJsonWithoutAssign;
import AST.creating.Variable.CreateVariableWithAssign;
import AST.creating.Variable.CreateVariableWithoutAssign;
import AST.expr.*;
import AST.instruction.CallFunction;
import AST.instruction.IF_rule.ElseIfRule;
import AST.instruction.IF_rule.Else;
import AST.instruction.IF_rule.IFElse;
import AST.instruction.Print_rule.InsidePrintStatement;
import AST.instruction.Print_rule.PrintStatement;
import AST.instruction.Returning.Exiting_Loop;
import AST.instruction.Returning.ReturnType;
import AST.instruction.Returning.ReturnRule;
import AST.instruction.ShortcutStatements;
import AST.instruction.Switch_rule.Case;
import AST.instruction.Switch_rule.Deafult;
import AST.instruction.Switch_rule.Switch;
import AST.instruction.FunctionalIns;
import AST.instruction.Instruction;
import AST.instruction.loops.*;
import gen.*;
import org.antlr.v4.runtime.Token;
import symbolTable.Scope;
import symbolTable.Symbol;
import symbolTable.Type;

import java.util.ArrayList;
import java.util.Stack;

public class BaseVisitor extends ParserReactBaseVisitor {
    Stack<Scope> scopesStack = new Stack<>();
    int counterForArrowFunctions = 0;

    public App visitApp(ParserReact.AppContext ctx) {
        System.out.println("visit App");
        App app = new App();
        Scope globalScope = new Scope();
        globalScope.setId("global_scope");
        scopesStack.push(globalScope);
        Main.symbolTable.addScope(globalScope);
        for (int i = 0; i < ctx.importR().size(); i++) {
            if (ctx.importR(i) != null) {
                app.getImportlist().add(visitImportR(ctx.importR(i)));
            }
        }
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof ParserReact.InstructionsContext) {
                visitInstructions((ParserReact.InstructionsContext) ctx.children.get(i));
            }
            if (ctx.children.get(i) instanceof ParserReact.Function_declarationContext) {
                Scope functionScope = new Scope();
                if (((ParserReact.Function_declarationContext) (ctx.children.get(i))).normal_function() != null) {
                    //  add id to the scope .....
                    functionScope.setId(
                            (
                                    (ParserReact.Function_declarationContext) (ctx.children.get(i))
                            ).normal_function().function_header().use_random_name().getText()
                                    +
                                    "_"
                                    +
                                    ((ctx.children.get(i)).hashCode())
                    );
                    // add father to the scope .....
                    functionScope.setParent(scopesStack.peek());
                    // add the scope to the scope stack .....
                    scopesStack.push(functionScope);
                    app.getFunctions().add(visitFunction_declaration((ParserReact.Function_declarationContext) ctx.children.get(i)));
                } else {
                    //  add id to the scope .....
                    functionScope.setId(
                            counterForArrowFunctions
                                    +
                                    "_"
                                    +
                                    ((ctx.children.get(i)).hashCode())
                    );
                    // add father to the scope .....
                    functionScope.setParent(scopesStack.peek());
                    // add the scope to the scope stack .....
                    scopesStack.push(functionScope);
                    app.getFunctions().add(visitFunction_declaration((ParserReact.Function_declarationContext) ctx.children.get(i)));
//                  change the value of counterForArrowFunctions for next arrow function declaration
                    counterForArrowFunctions++;
                }

            }
            if (ctx.children.get(i) instanceof ParserReact.ExportContext) {
                app.setExport(visitExport(ctx.export(i)));
            }
        }

        return app;
    }


    @Override
    public FunctionDeclaration visitFunction_declaration(ParserReact.Function_declarationContext ctx) {
        FunctionDeclaration functionDeclaration = new FunctionDeclaration();
        System.out.println("visiting function declaration ");
        if (ctx.normal_function() != null) {
            functionDeclaration.setNormalFunction(visitNormal_function(ctx.normal_function()));
        } else if (ctx.arrow_function() != null) {
            functionDeclaration.setArrowFunction(visitArrow_function(ctx.arrow_function()));
        }
        return functionDeclaration;
    }

    @Override
    public ArrowFunction visitArrow_function(ParserReact.Arrow_functionContext ctx) {
        ArrowFunction arrowFunction = new ArrowFunction();
        System.out.println("visiting arrow function declaration ");
        arrowFunction.setBody(visitFunction_body(ctx.function_body()));
        Scope currentScope = scopesStack.peek();
        String functionName = currentScope.getId();
        Symbol functionSymbol = new Symbol();
        Type type = new Type();
        functionSymbol.setFunction(true);
        functionSymbol.setIsParam(false);
        type.setName(Type.VAR_TYPE);
        functionSymbol.setName(functionName);
        functionSymbol.setScope(currentScope);
        functionSymbol.setType(type);
        // check if the variable is declared before .....
        if (itIsFirstDeclaredCheck(functionName)) {
            // if not declared before add the symbol to the current scope as map .....
            currentScope.addSymbol(functionName, functionSymbol);
            if (ctx.function_body().return_rule() != null) {
                // if there is return statement in the function body then the function will define a new type ....
                setFunctionType(ctx.function_body().return_rule().return_type(), functionName);
            }
            if (ctx.function_body().CLOSE_BRACE() != null) {
                Main.symbolTable.addScope(scopesStack.pop());
            }
        }

        return arrowFunction;
    }

    @Override
    public NormalFunction visitNormal_function(ParserReact.Normal_functionContext ctx) {
        NormalFunction normalFunction = new NormalFunction();
        System.out.println("visiting normal function declaration ");
        normalFunction.setHeader(visitFunction_header(ctx.function_header()));
        normalFunction.setBody(visitFunction_body(ctx.function_body()));
        String functionName = normalFunction.getHeader().getName();
        Scope currentScope = scopesStack.peek();
        Symbol functionSymbol = new Symbol();
        Type type = new Type();
        functionSymbol.setFunction(true);
        functionSymbol.setIsParam(false);
        type.setName(Type.VAR_TYPE);
        functionSymbol.setName(functionName);
        functionSymbol.setScope(currentScope);
        functionSymbol.setType(type);
        // check if the variable is declared before .....
        if (itIsFirstDeclaredCheck(functionName)) {
            // if not declared before add the symbol to the current scope as map .....
            currentScope.addSymbol(functionName, functionSymbol);
            if (ctx.function_body().return_rule() != null) {
                // if there is return statement in the function body then the function will define a new type ....
                setFunctionType(ctx.function_body().return_rule().return_type(), ctx.function_header().use_random_name().getText());
            }
            if (ctx.function_body().CLOSE_BRACE() != null) {
                Main.symbolTable.addScope(scopesStack.pop());
            }
        }
        return normalFunction;
    }

    public FunctionHeader visitFunction_header(ParserReact.Function_headerContext ctx) {
        System.out.println("function_header ");
        FunctionHeader header = new FunctionHeader();
        header.setName(ctx.use_random_name().getText());
        for (int i = 0; i < ctx.args().size(); i++) {
            header.add_item_to_arglist(visitArgs(ctx.args(i)));
        }
        for (int j = 0; j < ctx.creating_with_assign().size(); j++) {
            header.add_item_to_with_assign_var_list(visitCreating_with_assign(ctx.creating_with_assign(j)));
        }

        return header;
    }


    @Override
    public FunctionBody visitFunction_body(ParserReact.Function_bodyContext ctx) {
        System.out.println("visit function body");
        FunctionBody function_body = new FunctionBody();
        Instruction ins;
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof ParserReact.InstructionsContext) {
                function_body.addNode(visitInstructions((ParserReact.InstructionsContext) ctx.children.get(i)));
            } else if (ctx.children.get(i) instanceof ParserReact.Sub_function_bodyContext) {
                function_body.addNode(visitSub_function_body((ParserReact.Sub_function_bodyContext) ctx.children.get(i)));
            }
        }
        if (ctx.return_rule() != null) {
            function_body.setR(visitReturn_rule(ctx.return_rule()));
        }
        return function_body;
    }

    @Override
    public SubFunctionBody visitSub_function_body(ParserReact.Sub_function_bodyContext ctx) {
        SubFunctionBody sub_function_body = new SubFunctionBody();
        System.out.println("visit Sub function body");

        Scope subFucntionScope = new Scope();
        subFucntionScope.setId("sub_function_body_" + ctx.hashCode());
        subFucntionScope.setParent(scopesStack.peek());
        scopesStack.push(subFucntionScope);

        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof ParserReact.InstructionsContext) {
                sub_function_body.addNode(visitInstructions((ParserReact.InstructionsContext) ctx.children.get(i)));
            } else if (ctx.children.get(i) instanceof ParserReact.Sub_function_bodyContext) {
                sub_function_body.addNode(visitSub_function_body((ParserReact.Sub_function_bodyContext) ctx.children.get(i)));
            }
        }
        if (ctx.CLOSE_BRACE() != null) {
            Main.symbolTable.addScope(scopesStack.pop());
        }

        return sub_function_body;
    }

    @Override
    public ReturnRule visitReturn_rule(ParserReact.Return_ruleContext ctx) {
        ReturnRule rule = new ReturnRule();
        System.out.println("visit return rule");
        rule.setT(visitReturn_type(ctx.return_type()));
        return rule;

    }

    @Override
    public ReturnType visitReturn_type(ParserReact.Return_typeContext ctx) {
        System.out.println("visit return type ");
        ReturnType returnType = new ReturnType();
        if (ctx.expression() != null) {
            returnType.setExpression(visitExpression(ctx.expression()));
            symanticCheck(returnType.getExpression());
        } else if (ctx.bool_expression() != null) {
            returnType.setBooleanExpr(visitBool_expression(ctx.bool_expression()));
        } else if (ctx.intral_expression_value() != null) {
            returnType.setInternalExpressionValue(visitIntral_expression_value(ctx.intral_expression_value()));
        } else if (ctx.NULL() != null) {
            returnType.setNull(true);
            System.out.println(" visit null " + ctx.NULL().getSymbol().getText());
        }
        return returnType;
    }

    public void setFunctionType(ParserReact.Return_typeContext ctx, String functinName) {
        Symbol mySymbol = returnSymbolByName(functinName);
        if (ctx.bool_expression() != null) {
            mySymbol.getType().setName(Type.BOOLEAN_TYPE);
        } else if (ctx.expression() != null) {
            mySymbol.getType().setName(Type.INT_TYPE);
        } else if (ctx.intral_expression_value().IDENTIFIER() != null) {
            mySymbol.getType().setName(Type.STRING_TYPE);
        } else if (ctx.intral_expression_value().varible_name() != null) {
            Symbol varSymbol = returnSymbolByName(ctx.intral_expression_value().varible_name().use_random_name().getText());
            mySymbol.getType().setName(varSymbol.getType().getName());
        } else if (ctx.intral_expression_value().ONE_CHAR_LETTER() != null) {
            mySymbol.getType().setName(Type.STRING_TYPE);
        } else if (ctx.intral_expression_value().FALSE() != null) {
            mySymbol.getType().setName(Type.BOOLEAN_TYPE);
        } else if (ctx.intral_expression_value().TRUE() != null) {
            mySymbol.getType().setName(Type.BOOLEAN_TYPE);
        } else if (ctx.NULL() != null) {
            mySymbol.getType().setName(Type.VAR_TYPE);
        } else if (ctx.intral_expression_value().NUMERIC_LITERAL() != null) {
            mySymbol.getType().setName(Type.INT_TYPE);
        } else if (ctx.intral_expression_value().call_function() != null) {
            Symbol funSymbol = returnSymbolByName(ctx.expression().intral_expression_value().call_function().use_random_name().getText());
            mySymbol.getType().setName(funSymbol.getType().getName());
        }
    }

    public Symbol returnSymbolByName(String name) {
        Scope scope = scopesStack.peek();
        while (scope != null) {
            if (scope.getSymbolMap().containsKey(name)) {
                return scope.getSymbolMap().get(name);
            } else {
                scope = scope.getParent();
            }
        }
        return null;

    }

    @Override
    public Args visitArgs(ParserReact.ArgsContext ctx) {
        Args temp = new Args();
        System.out.println("visit args ");
        if (ctx.create_without_assign() != null) {
            visitCreate_without_assign(ctx.create_without_assign());
        }
        return temp;
    }

    @Override
    public GeneralCreating visitGeneral_creating(ParserReact.General_creatingContext ctx) {
        System.out.println("general creating ");
        GeneralCreating general = new GeneralCreating();
        if (ctx.create_without_assign() != null) {
            general.setWihtoutassig(visitCreate_without_assign(ctx.create_without_assign()));
            general.setInstrucation_name(general.getWihtoutassig().getInstrucation_name());
        }
        if (ctx.creating_with_assign() != null) {
            general.setWithassign(visitCreating_with_assign(ctx.creating_with_assign()));
            general.setInstrucation_name(general.getWithassign().getInstrucation_name());

        }
        return general;
    }

    @Override
    public CreateWithAssign visitCreating_with_assign(ParserReact.Creating_with_assignContext ctx) {
        System.out.println("visit create with assign ");
        CreateWithAssign variable_with_assign = new CreateWithAssign();
        if (ctx.create_varible_with_assign() != null) {
            CreateVariableWithAssign create = new CreateVariableWithAssign();
            Symbol symbol = new Symbol();
            Type types = new Type();
            variable_with_assign.setVar_wiht_assign(visitCreate_varible_with_assign(ctx.create_varible_with_assign()));
            create = (CreateVariableWithAssign) variable_with_assign.getVar_wiht_assign();
        } else if (ctx.create_json_with_assign() != null) {
            variable_with_assign.setJson_wiht_assign(visitCreate_json_with_assign(ctx.create_json_with_assign()));
            variable_with_assign.setInstrucation_name(variable_with_assign.getJson_wiht_assign().getInstrucation_name());
        } else if (ctx.create_Array_with_assign() != null) {
            variable_with_assign.setArray_with_assign(visitCreate_Array_with_assign(ctx.create_Array_with_assign()));
            variable_with_assign.setInstrucation_name(variable_with_assign.getArray_with_assign().getInstrucation_name());

        }
        return variable_with_assign;
    }

    @Override
    public CreateVariableWithAssign visitCreate_varible_with_assign(ParserReact.Create_varible_with_assignContext ctx) {
        CreateVariableWithAssign variable_with_assign = new CreateVariableWithAssign();
        variable_with_assign.setVar(visitAssign_varible(ctx.assign_varible()));
        Scope currentScope = new Scope();
        currentScope = scopesStack.peek();
        Symbol createdSymbol = new Symbol();
        String name = ctx.assign_varible().use_random_name().get(0).getText();
        createdSymbol.setName(name);
        createdSymbol.setIsParam(false);
        createdSymbol.setScope(currentScope);
        Expression expression = new Expression();
        boolean symanticCheck = true;
        // assign type to the variable boolean or another type ....
        if (variable_with_assign.getVar().getBooleanExpr() != null) {
            Type type = new Type();
            type.setName(Type.BOOLEAN_TYPE);
            createdSymbol.setType(type);
        } else if (variable_with_assign.getVar().getExpression() != null) {
            expression = variable_with_assign.getVar().getExpression();
            symanticCheck = symanticCheck(variable_with_assign);
            createdSymbol.setType(addTypeForVariable(expression, symanticCheck));
        }

        currentScope.addSymbol(name, createdSymbol);


        return variable_with_assign;
    }


    @Override
    public CreateArrayWithAssign visitCreate_Array_with_assign(ParserReact.Create_Array_with_assignContext ctx) {
        CreateArrayWithAssign create = new CreateArrayWithAssign();
        System.out.println("visite create array with assign ");
        create.setIndex(visitArray_base_form_without_index(ctx.array_base_form_without_index()));
        create.setSide(visitLeft_side_array(ctx.left_side_array()));
        create.setInstrucation_name(CreateArrayWithAssign.class.getName());
        return create;
    }


    @Override
    public ArrayLeftSide visitLeft_side_array(ParserReact.Left_side_arrayContext ctx) {
        ArrayLeftSide leftside = new ArrayLeftSide();
        System.out.println("visite array_left_side");
        if (ctx.value_left_side() != null) {
            leftside.setArrayValueForm(visitValue_left_side(ctx.value_left_side()));
        }

        if (ctx.array_name() != null) {
            leftside.setName(visitUse_random_name(ctx.array_name().use_random_name()));
        }

        return leftside;
    }

    @Override
    public ArrayValue visitValue_left_side(ParserReact.Value_left_sideContext ctx) {
        int i = 0;
        ArrayValue leftvalue = new ArrayValue();
        System.out.println(" value is the array");
        if (ctx.array_identifier_form() != null) {
            leftvalue.setID(visitArray_identifier_form(ctx.array_identifier_form()));

            for (i = 0; i < leftvalue.getID().size(); i++)
                System.out.println(" value in index  " + i + leftvalue.getID().get(i).getText());
        }
        if (ctx.array_charecter_form() != null) {
            leftvalue.setID(visitArray_charecter_form(ctx.array_charecter_form()));
            for (i = 0; i < leftvalue.getID().size(); i++) {
                System.out.println(" value in index " + i + leftvalue.getID().get(i).getText());
            }

        }
        if (ctx.array_objects_form() != null) {
            leftvalue.setStatment(visitArray_objects_form(ctx.array_objects_form()));

        }
        if (ctx.array_objects_form2() != null) {
            leftvalue.setStatment(visitArray_objects_form2(ctx.array_objects_form2()));
        }
        if (ctx.array_arrayes_form() != null) {
            leftvalue.setArrayfor(visitArray_arrayes_form(ctx.array_arrayes_form()));
        }


        return leftvalue;
    }

    @Override
    public ArrayList<JsonStatement> visitArray_objects_form(ParserReact.Array_objects_formContext ctx) {
        ArrayList<JsonStatement> j = new ArrayList<JsonStatement>();
        for (int i = 0; i < ctx.json_statment().size(); i++) {

            j.add(visitJson_statment(ctx.json_statment(i)));
            System.out.println("value of json statment in list " + "in the index " + i + ctx.json_statment(i).getText().toString());
        }
        return j;
    }

    @Override
    public ArrayList<JsonStatement> visitArray_objects_form2(ParserReact.Array_objects_form2Context ctx) {
        System.out.println("visit array object form 2 ");
        ArrayList<JsonStatement> t = new ArrayList<JsonStatement>();
        t = visitArray_objects_form(ctx.array_objects_form());
        return t;
    }

    @Override
    public ArrayList<Token> visitArray_identifier_form(ParserReact.Array_identifier_formContext ctx) {
        ArrayList<Token> t = new ArrayList<Token>();

        for (int i = 0; i < ctx.IDENTIFIER().size(); i++) {

            t.add(ctx.IDENTIFIER(i).getSymbol());
        }
        return t;
    }


    @Override
    public ArrayOfArrayForm visitArray_arrayes_form(ParserReact.Array_arrayes_formContext ctx) {
        System.out.println("visite array of array form ");
        ArrayOfArrayForm forms = new ArrayOfArrayForm();
        for (int i = 0; i < ctx.left_side_array().size(); i++) {
            forms.adding(visitLeft_side_array(ctx.left_side_array(i)));
        }
        for (int i = 0; i < ctx.left_side_array().size(); i++) {
            System.out.println(" the value in th index " + i + ctx.left_side_array(i).toString());

        }
        return forms;
    }

    @Override
    public ArrayList<Token> visitArray_charecter_form(ParserReact.Array_charecter_formContext ctx) {
        ArrayList<Token> t = new ArrayList<Token>();

        for (int i = 0; i < ctx.ONE_CHAR_LETTER().size(); i++) {

            t.add(ctx.COMMA(i).getSymbol());
        }
        return t;

    }

    @Override
    public CreateJsonWithAssign visitCreate_json_with_assign(ParserReact.Create_json_with_assignContext ctx) {
        System.out.println("visite create json wiht assign ");
        CreateJsonWithAssign jsowith = new CreateJsonWithAssign();

        jsowith.setAssingit(visitAssign_json(ctx.assign_json()));
        jsowith.setInstrucation_name(CreateJsonWithAssign.class.getName());

        return jsowith;
    }

    @Override
    public JsonAssign visitAssign_json(ParserReact.Assign_jsonContext ctx) {
        System.out.println("visite assign json ");
        JsonAssign assjsoin = new JsonAssign();
        assjsoin.setForm(visitJson_name(ctx.json_name(0)));
        if (ctx.json_statment() != null) {
            assjsoin.setJson(visitJson_statment(ctx.json_statment()));

        }
        System.out.println(" json name " + ctx.json_name(0).getText());
        if (ctx.json_name(0) != null) {
            System.out.println("json value " + ctx.json_name(0).getText());
            assjsoin.setForm(visitJson_name(ctx.json_name(0)));
        }
        return assjsoin;
    }

    @Override
    public JsonStatement visitJson_statment(ParserReact.Json_statmentContext ctx) {
        System.out.println("visit json statment ");
        JsonStatement inside_json = new JsonStatement();
        for (int i = 0; i < ctx.inside_json_statmnet().size(); i++) {
            inside_json.additemtojsonstatment(visitInside_json_statmnet(ctx.inside_json_statmnet().get(i)));
            //System.out.println(" justing testing it "+ctx.inside_json_statmnet().get(i).getText());
        }

        return inside_json;
    }

    @Override
    public InsideJsonStatement visitInside_json_statmnet(ParserReact.Inside_json_statmnetContext ctx) {
        System.out.println("visite inside json statment ");
        InsideJsonStatement inside = new InsideJsonStatement();
        inside.setName(visitUse_random_name(ctx.use_random_name()));
        inside.setValue(visitValue_json_statmnet(ctx.value_json_statmnet()));
        if (inside.getName() != null && inside.getValue() != null) {
            System.out.println("variable name " + inside.getName());
            if (inside.getValue().getStatmnet() != null) {
                System.out.println(" the value will be " + inside.getValue().getStatmnet().getName());
            }
            if (inside.getValue().getTypes() != null)
                System.out.println("the value will be " + inside.getValue().getTypes().getText());

        }
        return inside;
    }


    @Override
    public BooleanExpr visitBool_expression(ParserReact.Bool_expressionContext ctx) {
        System.out.println("visit bool expression");
        BooleanExpr booleanExpr = new BooleanExpr();
        setBooleanOperator(ctx, booleanExpr);
        for (int i = 0; i < ctx.expression().size(); i++) {
            booleanExpr.setExpression(visitExpression(ctx.expression(i)));
        }
        return booleanExpr;
    }

    public void setBooleanOperator(ParserReact.Bool_expressionContext ctx, BooleanExpr booleanExpr) {
        if (ctx.LT() != null) {
            booleanExpr.setOperator(ctx.LT().toString());
            System.out.println("bool Operator :" + booleanExpr.getOperator());
        } else if (ctx.GT() != null) {
            booleanExpr.setOperator(ctx.GT().toString());
            System.out.println("bool Operator :" + booleanExpr.getOperator());
        } else if (ctx.GT_EQ() != null) {
            booleanExpr.setOperator(ctx.GT_EQ().toString());
            System.out.println("bool Operator :" + booleanExpr.getOperator());
        } else if (ctx.LT_EQ() != null) {
            booleanExpr.setOperator(ctx.LT_EQ().toString());
            System.out.println("bool Operator :" + booleanExpr.getOperator());
        } else if (ctx.EQ() != null) {
            booleanExpr.setOperator(ctx.EQ().toString());
            System.out.println("bool Operator :" + booleanExpr.getOperator());
        } else if (ctx.NOT_EQ1() != null) {
            booleanExpr.setOperator(ctx.NOT_EQ1().toString());
            System.out.println("bool Operator :" + booleanExpr.getOperator());
        } else if (ctx.AND() != null) {
            booleanExpr.setOperator(ctx.AND().toString());
            System.out.println("bool Operator :" + booleanExpr.getOperator());
        } else if (ctx.OR() != null) {
            booleanExpr.setOperator(ctx.OR().toString());
            System.out.println("bool Operator :" + booleanExpr.getOperator());
        }
    }

    @Override
    public Expression visitExpression(ParserReact.ExpressionContext ctx) {
        Expression expression = new Expression();
        expression.setExpression_list(expression_algorthim(ctx));
        System.out.println("visit expression");

        return expression;
    }

    public Expression_List expression_algorthim(ParserReact.ExpressionContext ctx) {
        Expression_List expression_list = new Expression_List();
        if (ctx.children.size() == 1) {
            expression_list.setIntral_expression_value(visitIntral_expression_value(ctx.intral_expression_value()));
        } else if (ctx.PLPL() != null || ctx.MINUS_MINUS() != null) {
            expression_list.setShortcut_statments(shortcut_Statments_Expression(ctx));
        } else if (ctx.expression().size() == 2) {
            setOprator(ctx, expression_list);
            expression_list.setLeft_expr(expression_algorthim(ctx.expression(0)));
            expression_list.setRight_expr(expression_algorthim(ctx.expression(1)));
        } else if (!ctx.OPEN_PAREN().isEmpty()) {
            Bracket_Expression bracket_expression = new Bracket_Expression();
            if (!ctx.expression().isEmpty()) {

                bracket_expression.setExpression_list(expression_algorthim(ctx.expression(0)));
            } else if (ctx.genral_assign() != null) {
                bracket_expression.setAssign(visitGenral_assign(ctx.genral_assign()));
            }
            expression_list.setBracket_expression(bracket_expression);
        } else if (ctx.expression().size() == 3) {
            OnLineIfExpr one_line_if_expression = new OnLineIfExpr();
            one_line_if_expression.setBoolean_condition(expression_algorthim(ctx.expression(0)));
            one_line_if_expression.setFirstelement(expression_algorthim(ctx.expression(1)));
            one_line_if_expression.setSecond_element(expression_algorthim(ctx.expression(2)));
            expression_list.setOne_line_if_expression(one_line_if_expression);
            System.out.println("visit one line if");
        }
        return expression_list;
    }

    public ShortcutStatements shortcut_Statments_Expression(ParserReact.ExpressionContext ctx) {
        ShortcutStatements shortcut_statments = new ShortcutStatements();
        shortcut_statments.setInstrucation_name("Shortcut_Statments");
        if (ctx.expression(0).intral_expression_value() != null) {
            Variable_Name variable_name = visitVarible_name(ctx.expression(0).intral_expression_value().varible_name());
            shortcut_statments.setShortcut_variable_name(variable_name.getVariable_name());
        }
        if (ctx.PLPL() != null) {
            shortcut_statments.setOprator(ctx.PLPL().getText());
        } else if (ctx.MINUS_MINUS() != null) {
            shortcut_statments.setOprator(ctx.MINUS_MINUS().getText());
        }
        System.out.println("shortcut stored : " + shortcut_statments.getInstrucation_name());
        System.out.println(shortcut_statments.getOprator());
        symanticCheck(shortcut_statments);
        return shortcut_statments;
    }

    public void setOprator(ParserReact.ExpressionContext ctx, Expression_List expression_list) {
        if (ctx.PLUS() != null) {
            expression_list.setOp(ctx.PLUS().toString());
            System.out.println("opretor :" + expression_list.getOp());
        } else if (ctx.MINUS() != null) {
            expression_list.setOp(ctx.MINUS().toString());
            System.out.println("opretor :" + expression_list.getOp());
        } else if (ctx.MULTI() != null) {
            expression_list.setOp(ctx.MULTI().toString());
            System.out.println("opretor :" + expression_list.getOp());
        } else if (ctx.JSX_SLASH_OR_DIV() != null) {
            expression_list.setOp(ctx.JSX_SLASH_OR_DIV().toString());
            System.out.println("opretor :" + expression_list.getOp());
        } else if (ctx.MOD() != null) {
            expression_list.setOp(ctx.MOD().toString());
            System.out.println("opretor :" + expression_list.getOp());
        }
    }

    @Override
    public InternalExpressionValue visitIntral_expression_value(ParserReact.Intral_expression_valueContext ctx) {
        System.out.println("visit internal expressing value");
        InternalExpressionValue internalExpressionValue = new InternalExpressionValue();
        if (ctx.varible_name() != null) {
            internalExpressionValue.setVariable_name(visitVarible_name(ctx.varible_name()));
        } else if (ctx.IDENTIFIER() != null) {
            internalExpressionValue.setIdentyfire(ctx.getText());
            System.out.println("String stored : " + internalExpressionValue.getIdentyfire());
        } else if (ctx.FALSE() != null) {
            internalExpressionValue.setTure_or_False(ctx.getText());
            System.out.println("false stored : " + internalExpressionValue.getTure_or_False());
        } else if (ctx.TRUE() != null) {
            internalExpressionValue.setTure_or_False(ctx.getText());
            System.out.println("true stored : " + internalExpressionValue.getTure_or_False());
        } else if (ctx.NUMERIC_LITERAL() != null) {
            internalExpressionValue.setNUMERIC_LITERAL(ctx.getText());
            System.out.println("number stored : " + internalExpressionValue.getNUMERIC_LITERAL());
        } else if (ctx.call_function() != null) {
            internalExpressionValue.setCall_function(visitCall_function(ctx.call_function()));
          getSymbolType(internalExpressionValue.getCall_function().getFunction_name());
        } else if (ctx.ONE_CHAR_LETTER() != null) {
            internalExpressionValue.setONE_CHAR_LETTER(ctx.getText().charAt(0));
            System.out.println("Char stored : " + internalExpressionValue.getONE_CHAR_LETTER());
        } else if (ctx.varible_from_object() != null) {
            internalExpressionValue.setVariable_From_Object(visitVarible_from_object(ctx.varible_from_object()));
        }
        return internalExpressionValue;

    }

    @Override
    public Variable_Name visitVarible_name(ParserReact.Varible_nameContext ctx) {

        Variable_Name variable_name = new Variable_Name();
        variable_name.setVariable_name(ctx.getText());
        System.out.println("variable stored : " + variable_name.getVariable_name());

        return variable_name;
    }


    @Override
    public JsonStatementValue visitValue_json_statmnet(ParserReact.Value_json_statmnetContext ctx) {
        JsonStatementValue value = new JsonStatementValue();
        System.out.println("visite value json statment ");

        if (ctx.IDENTIFIER() != null) {
            value.setTypes(ctx.IDENTIFIER().getSymbol());

        } else if (ctx.NULL() != null) {

            value.setTypes(ctx.NULL().getSymbol());

        } else if (ctx.NUMERIC_LITERAL() != null) {
            value.setTypes(ctx.NUMERIC_LITERAL().getSymbol());
        } else if (ctx.json_statment() != null) {
            value.setStatmnet(visitJson_statment(ctx.json_statment())); // calling it our we should assign to it
        } else if (ctx.varible_name() != null) {
            value.setName(visitUse_random_name(ctx.varible_name().use_random_name()));
        } else if (ctx.varible_from_object() != null) {
            value.setObject(visitVarible_from_object(ctx.varible_from_object()));

        }
        return value;

    }

    @Override
    public VariabelFromObject visitVarible_from_object(ParserReact.Varible_from_objectContext ctx) {
        System.out.println("visite variable from object");
        VariabelFromObject objectes = new VariabelFromObject();
        if (ctx.json_name() != null && ctx.varible_name() != null) {
            objectes.setJson(visitJson_name(ctx.json_name()));

            for (int i = 0; i < ctx.varible_name().size(); i++) {
                objectes.setName(visitUse_random_name(ctx.varible_name(i).use_random_name()));

            }
        }
        return objectes;
    }

    @Override
    public CreateWithoutAssign visitCreate_without_assign(ParserReact.Create_without_assignContext ctx) {
        CreateWithoutAssign wihtoutassign = new CreateWithoutAssign();
        System.out.println("visit creating without assign ");
        if (ctx.create_varible_without_assign() != null) {
            wihtoutassign.setVar(visitCreate_varible_without_assign(ctx.create_varible_without_assign()));
            wihtoutassign.setInstrucation_name(wihtoutassign.getVar().getInstrucation_name());
        }
        if (ctx.create_Array_without_assign() != null) {
            wihtoutassign.setArray(visitCreate_Array_without_assign(ctx.create_Array_without_assign()));
            wihtoutassign.setInstrucation_name(wihtoutassign.getArray().getInstrucation_name());
        }
        if (ctx.create_json_object_without_assign() != null) {
            wihtoutassign.setJson(visitCreate_json_object_without_assign(ctx.create_json_object_without_assign()));
            wihtoutassign.setInstrucation_name(wihtoutassign.getJson().getInstrucation_name());
        }
        return wihtoutassign;

    }

    @Override
    public CreateJsonWithoutAssign visitCreate_json_object_without_assign(ParserReact.Create_json_object_without_assignContext ctx) {
        System.out.println("visite json wihtout assign ");
        CreateJsonWithoutAssign json_without_assign = new CreateJsonWithoutAssign();
        json_without_assign.setForm(visitJson_name(ctx.json_name()));
        json_without_assign.setInstrucation_name(CreateJsonWithoutAssign.class.getName());

        return json_without_assign;
    }

    @Override
    public JsonForm visitJson_name(ParserReact.Json_nameContext ctx) {
        System.out.println("json name ");

        JsonForm form = new JsonForm();
        form.setName(visitUse_random_name(ctx.use_random_name()));
        return form;
    }

    @Override
    public CreateArrayWithoutAssign visitCreate_Array_without_assign(ParserReact.Create_Array_without_assignContext ctx) {
        System.out.println("creaitng array wihtout assing ");
        CreateArrayWithoutAssign wihtoutassing = new CreateArrayWithoutAssign();
        wihtoutassing.setWihtoutindex(visitArray_base_form_without_index(ctx.array_base_form_without_index()));
        wihtoutassing.setInstrucation_name(CreateArrayWithoutAssign.class.getName());

        return wihtoutassing;
    }

    @Override
    public ArrayFormWithoutSize visitArray_base_form_without_index(ParserReact.Array_base_form_without_indexContext ctx) {
        System.out.println("creating array base form ");
        ArrayFormWithoutSize wihtoutindex = new ArrayFormWithoutSize();
        wihtoutindex.setName(visitArray_name(ctx.array_name()));
        return wihtoutindex;
    }

    @Override
    public String visitArray_name(ParserReact.Array_nameContext ctx) {
        String name = "";
        System.out.println("visite array name ");
        name = visitUse_random_name(ctx.use_random_name());
        System.out.println("array name " + name);
        return name;
    }

    @Override
    public CreateVariableWithoutAssign visitCreate_varible_without_assign(ParserReact.Create_varible_without_assignContext ctx) {
        System.out.println("Creating Variable without assign");
        CreateVariableWithoutAssign creatvaribelwihtout = new CreateVariableWithoutAssign();
        creatvaribelwihtout.setN(visitUse_random_name(ctx.varible_name().use_random_name()));
        creatvaribelwihtout.setInstrucation_name(CreateVariableWithoutAssign.class.getName());
        // peek I current scope ....
        Scope currentScope = scopesStack.peek();
        Symbol variableSymbol = new Symbol();
        Type type = new Type();
        variableSymbol.setIsParam(false);
        String name = ctx.varible_name().use_random_name().getText();
        type.setName(Type.VAR_TYPE);
        variableSymbol.setName(name);
        variableSymbol.setScope(currentScope);
        variableSymbol.setType(type);
        // check if the variable is declared before .....
        if (itIsFirstDeclaredCheck(ctx.varible_name().use_random_name().getText())) {
            // if not declared before add the symbol to the current scope as map .....
            currentScope.addSymbol(name, variableSymbol);
        }

        return creatvaribelwihtout;

    }

    @Override
    public String visitUse_random_name(ParserReact.Use_random_nameContext ctx) {
        String name = "";
        if (ctx.RANDOM_NAME() != null) {
            name = ctx.RANDOM_NAME().getSymbol().getText();
        }
        System.out.println("visitUse_random_name: " + name);
        return name;
    }


    @Override
    public Instruction visitFunctional_instruction(ParserReact.Functional_instructionContext ctx) {
        FunctionalIns instructions = new FunctionalIns();

        if (ctx.while_rule() != null) {
            Scope whileScope = new Scope();
            whileScope.setParent(scopesStack.peek());
            whileScope.setId(ctx.while_rule().WHILE() + "_" + ctx.while_rule().hashCode());
            scopesStack.push(whileScope);
            instructions = visitWhile_rule(ctx.while_rule());

            if (ctx.instructions().size() != 0) {
                for (int i = 0; i < ctx.instructions().size(); i++) {
                    instructions.getInstructions().add(visitInstructions(ctx.instructions(i)));


                }
            }
            if (ctx.exiting_loops() != null) {
                visitExiting_loops(ctx.exiting_loops());
            }
            Main.symbolTable.addScope(scopesStack.pop());

        } else if (ctx.foreach() != null) {

            Scope foreachScope = new Scope();
            foreachScope.setParent(scopesStack.peek());
            foreachScope.setId(ctx.foreach().FOREACH().getText() + "_" + ctx.foreach().hashCode());

            scopesStack.push(foreachScope);
            instructions = visitForeach(ctx.foreach());

            for (int i = 0; i < ctx.instructions().size(); i++) {
                instructions.getInstructions().add(visitInstructions(ctx.instructions(i)));

            }
            if (ctx.exiting_loops() != null) {
                visitExiting_loops(ctx.exiting_loops());

            }
            Main.symbolTable.addScope(scopesStack.pop());
        } else if (ctx.for_loop_rule() != null) {

            Scope forScope = new Scope();
            forScope.setId(ctx.for_loop_rule().FOR() + "_" + ctx.for_loop_rule().hashCode());
            forScope.setParent(scopesStack.peek());

            scopesStack.push(forScope);
            instructions = visitFor_loop_rule(ctx.for_loop_rule());

            for (int i = 0; i < ctx.instructions().size(); i++) {
                instructions.getInstructions().add(visitInstructions(ctx.instructions(i)));

            }
            if (ctx.exiting_loops() != null) {
                visitExiting_loops(ctx.exiting_loops());
            }
            Main.symbolTable.addScope(scopesStack.pop());

        }


        return instructions;
    }

    @Override
    public Exiting_Loop visitExiting_loops(ParserReact.Exiting_loopsContext ctx) {
        Exiting_Loop c = new Exiting_Loop();
        if (ctx.BREAK() != null)
            System.out.println("visite break rule" + ctx.BREAK().getSymbol().getText());
        if (ctx.CONTINUE() != null) {
            System.out.println("visite continue rule " + ctx.CONTINUE().getSymbol().getText());
        }
        if (ctx.return_rule() != null) {
            c.setR(visitReturn_rule(ctx.return_rule()));
        }
        return c;
    }

    @Override
    public Instruction visitInstructions(ParserReact.InstructionsContext ctx) {
        System.out.println("visit instruction");

        Instruction instructions = new Instruction();

        if (ctx.functional_instruction() != null) {

            if (ctx.functional_instruction().if_else_rule() != null) {
                instructions = visitIf_else_rule(ctx.functional_instruction().if_else_rule());
                // System.out.println("size ))))))))))"+ctx.functional_instruction().instructions().size());
            } else if (ctx.functional_instruction().do_while() != null) {
                instructions = visitDo_while(ctx.functional_instruction().do_while());

            } else if (ctx.functional_instruction().while_rule() != null) {
                instructions = visitFunctional_instruction(ctx.functional_instruction());
            } else if (ctx.functional_instruction().foreach() != null) {
                instructions = visitFunctional_instruction(ctx.functional_instruction());
            } else if (ctx.functional_instruction().switch_rule() != null) {
                instructions = visitSwitch_rule(ctx.functional_instruction().switch_rule());
            } else if (ctx.functional_instruction().for_loop_rule() != null) {
                instructions = visitFunctional_instruction(ctx.functional_instruction());
            }


        } else if (ctx.nonfunctional_instruction() != null) {
            if (ctx.nonfunctional_instruction().general_creating() != null) {
                instructions = visitGeneral_creating(ctx.nonfunctional_instruction().general_creating());
            } else if (ctx.nonfunctional_instruction().genral_assign() != null) {
                instructions = visitGenral_assign(ctx.nonfunctional_instruction().genral_assign());
            } else if (ctx.nonfunctional_instruction().call_function() != null) {
                instructions = visitCall_function(ctx.nonfunctional_instruction().call_function());
            } else if (ctx.nonfunctional_instruction().print_statment() != null) {
                instructions = visitPrint_statment(ctx.nonfunctional_instruction().print_statment());
            } else if (ctx.nonfunctional_instruction().shortcut_statments() != null) {
                instructions = visitShortcut_statments(ctx.nonfunctional_instruction().shortcut_statments());
            }

            //todo complete it else if (ctx.nonfunctional_instruction().one_line_if_instruction()!=null)

        }
        return instructions;
    }

    @Override
    public Instruction visitIf_else_rule(ParserReact.If_else_ruleContext ctx) {
        System.out.println("visit if rule");
        IFElse ins = new IFElse();
        ins.setInstrucation_name(IFElse.class.getName());
        ins.setBooleanExpr(visitBool_expression(ctx.if_rule().bool_expression()));
//       todo do semantic check here for boolean expression ...
        checkBoolExpression(ctx.if_rule().bool_expression());
        Scope parentScope = scopesStack.peek();
        if (ctx.if_rule() != null) {
            Scope currentScope = new Scope();
            String scopeName = ctx.if_rule().IF().getText() + ctx.if_rule().hashCode();
            currentScope.setId(scopeName);
            currentScope.setParent(parentScope);
            scopesStack.push(currentScope);
            for (int i = 0; i < ctx.if_rule().instructions().size(); i++) {
                ins.addinstruction(visitInstructions(ctx.if_rule().instructions(i)));
            }
            if (ctx.if_rule().return_rule() != null) {
                ReturnRule r = new ReturnRule();
                r = visitReturn_rule(ctx.if_rule().return_rule());
                Exiting_Loop e = new Exiting_Loop();
                e.setR(r);
                ins.setLoop(e);
            }

            Main.symbolTable.addScope(scopesStack.pop());


            if (ctx.else_if_rule() != null) {
                for (int i = 0; i < ctx.else_if_rule().size(); i++) {
                    System.out.println("visit else_if");
                    ElseIfRule else_if_rule = new ElseIfRule();
                    ins.add_Else_if_rule_in_if(else_if_rule);
                    System.out.println("else if:" + ins.getElse_if());
                    else_if_rule.setBooleanExpr(visitBool_expression(ctx.else_if_rule().get(i).bool_expression()));
                    Scope elseifScop = new Scope();
                    String elseifeName = ctx.else_if_rule().get(i).ELSE_IF().getText() + ctx.else_if_rule().get(i).hashCode();
                    elseifScop.setId(elseifeName);
                    elseifScop.setParent(parentScope);
                    scopesStack.push(elseifScop);

                    for (int j = 0; j < ctx.else_if_rule().get(i).instructions().size(); j++) {

                        else_if_rule.addinstruction(visitInstructions(ctx.else_if_rule().get(i).instructions().get(j)));

                    }

                    if (ctx.else_if_rule(i).return_rule() != null) {
                        ReturnRule r = new ReturnRule();
                        r = visitReturn_rule(ctx.else_if_rule(i).return_rule());
                        Exiting_Loop e = new Exiting_Loop();
                        e.setR(r);
                        ins.setLoop(e);

                    }
                    Main.symbolTable.addScope(scopesStack.pop());
                }
            }

        }
        if (ctx.else_rulse() != null) {
            System.out.println("visit else");
            Else else_rule = new Else();
            ins.setElse_rule(else_rule);
            System.out.println("else :" + ins.getElse_rule());

            Scope elseScope = new Scope();
            String elseName = ctx.else_rulse().ELSE().getText() + ctx.else_rulse().hashCode();
            elseScope.setId(elseName);
            elseScope.setParent(parentScope);
            scopesStack.push(elseScope);

            for (int i = 0; i < ctx.else_rulse().instructions().size(); i++) {
                else_rule.addinstruction(visitInstructions(ctx.else_rulse().instructions(i)));
            }

            /*if(ctx.else_rulse().returning_in_if()!=null)
                ins.setR(visitReturning_in_if(ctx.else_rulse().returning_in_if()));*/
            if (ctx.else_rulse().return_rule() != null) {
                ReturnRule r = new ReturnRule();
                r = visitReturn_rule(ctx.else_rulse().return_rule());
                Exiting_Loop e = new Exiting_Loop();
                e.setR(r);
                ins.setLoop(e);
            }
            Main.symbolTable.addScope(scopesStack.pop());

        }

        return ins;

    }


    @Override
    public Instruction visitPrint_statment(ParserReact.Print_statmentContext ctx) {
        System.out.println("visit Prints");
        PrintStatement print = new PrintStatement();
        print.setInstrucation_name(PrintStatement.class.getName());
        if (ctx.indisde_the_print() != null) {
            if (ctx.indisde_the_print() != null) {
                for (int i = 0; i < ctx.indisde_the_print().size(); i++) {

                    if (ctx.indisde_the_print().get(i) != null) {
                        print.getPrints().add(visitIndisde_the_print(ctx.indisde_the_print().get(i)));
                    }
                }
            }

        }
        return print;
    }

    @Override
    public InsidePrintStatement visitIndisde_the_print(ParserReact.Indisde_the_printContext ctx) {
        System.out.println("visit inside print");
        InsidePrintStatement inside_the_print = new InsidePrintStatement();

        if (ctx.expression() != null) {
            inside_the_print.setExpression(visitExpression(ctx.expression()));
            symanticCheck(inside_the_print.getExpression());

        } else if (ctx.varible_from_object() != null) {
            inside_the_print.setVariable_from_object(visitVarible_from_object(ctx.varible_from_object()));
            System.out.println(inside_the_print.getVariable_from_object());
        } else if (ctx.IDENTIFIER() != null) {
            inside_the_print.setIdentifire(ctx.IDENTIFIER().getText());
            System.out.println(inside_the_print.getIdentifire());
        } else if (ctx.array_base_form_with_index() != null) {
            inside_the_print.setArray_base_with_index(visitArray_base_form_with_index(ctx.array_base_form_with_index()));
            System.out.println(inside_the_print.getArray_base_with_index());
        } else if (ctx.use_random_name() != null) {
            inside_the_print.setVariable_name(visitUse_random_name(ctx.use_random_name()));
            System.out.println(inside_the_print.getVariable_name());
        } else if (ctx.call_function() != null) {
            inside_the_print.setCallFunction(visitCall_function(ctx.call_function()));
            System.out.println(inside_the_print.getCallFunction());
        }

        return inside_the_print;
    }


    @Override
    public Instruction visitDo_while(ParserReact.Do_whileContext ctx) {
        System.out.println("visit do while");
        DoWhile ins = new DoWhile();
        ins.setInstrucation_name(DoWhile.class.getName());
        ins.setBooleanExpr(visitBool_expression(ctx.while_rule().bool_expression()));
//        todo do semantic check here for bool expression ....
        Scope dowhileScope = new Scope();
        dowhileScope.setId(ctx.DO().getText() + "_" + ctx.hashCode());
        dowhileScope.setParent(scopesStack.peek());
        scopesStack.push(dowhileScope);

        for (int i = 0; i < ctx.instructions().size(); i++) {
            ins.addinstruction(visitInstructions(ctx.instructions(i)));
        }
        if (ctx.exiting_loops() != null) {
            ins.setLoop(visitExiting_loops(ctx.exiting_loops()));

        }
        Main.symbolTable.addScope(scopesStack.pop());


        return ins;
    }

    @Override
    public FunctionalIns visitFor_loop_rule(ParserReact.For_loop_ruleContext ctx) {
        System.out.println("visit for rule");
        ForLoop for_loop_rule = new ForLoop();
        for_loop_rule.setInstrucation_name(ForLoop.class.getName());


        if (ctx.create_varible_with_assign() != null) {
            for_loop_rule.setVar_with_asgn(visitCreate_varible_with_assign(ctx.create_varible_with_assign()));
            if (ctx.inside_for_loop(0) != null) { // right hand
                for_loop_rule.setRight_inside_for_loop(visitInside_for_loop(ctx.inside_for_loop(0)));
            }

        } else if (ctx.create_varible_without_assign() != null) {
            for_loop_rule.setVar_without_asgn(visitCreate_varible_without_assign(ctx.create_varible_without_assign()));
            if (ctx.inside_for_loop(0) != null) { // right hand
                for_loop_rule.setRight_inside_for_loop(visitInside_for_loop(ctx.inside_for_loop(0)));
            }
        } else if (ctx.inside_for_loop(0) != null) { //left hand
            for_loop_rule.setLeft_inside_for_loop(visitInside_for_loop(ctx.inside_for_loop(0)));
            if (ctx.inside_for_loop(1) != null) { // right hand
                for_loop_rule.setRight_inside_for_loop(visitInside_for_loop(ctx.inside_for_loop(1)));
            }
        }
        if (ctx.bool_expression() != null) {
            for_loop_rule.setBooleanExpr(visitBool_expression(ctx.bool_expression()));
            // todo do semantic check here for bool expression ....
        }

        return for_loop_rule;
    }

    @Override
    public InsideForLoop visitInside_for_loop(ParserReact.Inside_for_loopContext ctx) {
        InsideForLoop inside_for_loop = new InsideForLoop();
        if (ctx.expression() != null) {
            inside_for_loop.setExpression(visitExpression(ctx.expression()));
            symanticCheck(inside_for_loop.getExpression());
        } else if (ctx.assign_array() != null) {
            inside_for_loop.setAssign_array(visitAssign_array(ctx.assign_array()));
        } else if (ctx.assign_varible() != null) {
            // must change in g4 to general assign
            Assignment assignment = new Assignment();
            assignment.setVar(visitAssign_varible(ctx.assign_varible()));
            inside_for_loop.setVar(assignment.getVar());
            symanticCheck(assignment);
        } else if (ctx.shortcut_statments() != null) {
            inside_for_loop.setShortcut_statments(visitShortcut_statments(ctx.shortcut_statments()));
        } else if (ctx.create_Array_without_assign() != null) {
            inside_for_loop.setCreate_arry_without_assign(visitCreate_Array_without_assign(ctx.create_Array_without_assign()));
        }
        return inside_for_loop;
    }

    @Override
    public FunctionalIns visitWhile_rule(ParserReact.While_ruleContext ctx) {
        System.out.println("visit while");
        While_Rule ins = new While_Rule();
        ins.setInstrucation_name(While_Rule.class.getName());
        ins.setBooleanExpr(visitBool_expression(ctx.bool_expression()));
//        todo do semantic check here for bool expression ....
        return ins;
    }

    @Override
    public FunctionalIns visitForeach(ParserReact.ForeachContext ctx) {
        System.out.println("visit Foreach");
        Foreach ins = new Foreach();
        ins.setInstrucation_name(Foreach.class.getName());
        ins.setLoop_variable(visitUse_random_name(ctx.use_random_name(0)));
        itIsFirstDeclaredCheck(ins.getLoop_variable());
        ins.setObject_variable(visitUse_random_name(ctx.use_random_name(1)));
        errorOfUsingUndeclaredVariable(scopesStack.peek(), ins.getObject_variable());
        ArrayList<Object> d = new ArrayList<Object>();


        return ins;
    }

    @Override
    public CallFunction visitCall_function(ParserReact.Call_functionContext ctx) {
        System.out.println("visit call function");
        CallFunction ins = new CallFunction();
        ins.setInstrucation_name(CallFunction.class.getName());
        errorOfUsingUndeclaredFunction(ctx.use_random_name().getText());
        ins.setFunction_name(ctx.use_random_name().getText());
        for (int i = 0; i < ctx.prameters().size(); i++) {
            ins.getParameters().add(visitPrameters(ctx.prameters(i)));

        }
        return ins;
    }

    @Override
    public Parameter visitPrameters(ParserReact.PrametersContext ctx) {
        System.out.println("visist parametar");
        Parameter parameter = new Parameter();

        if (ctx.NUMERIC_LITERAL() != null)
            parameter.setNumber(ctx.NUMERIC_LITERAL().getText());
        else if (ctx.IDENTIFIER() != null) {
            parameter.setIdentifire(ctx.IDENTIFIER().getText());
        } else if (ctx.call_function() != null) {
            errorOfUsingUndeclaredFunction(ctx.call_function().use_random_name().getText());
            parameter.setCallFunction(visitCall_function(ctx.call_function()));
        } else if (ctx.use_random_name() != null) {
            errorOfUsingUndeclaredVariable(scopesStack.peek(), ctx.use_random_name().getText());
            parameter.setVariable_name(visitUse_random_name(ctx.use_random_name()));
        } else if (ctx.array_base_form_with_index() != null) {
            parameter.setArray_base_with_index(visitArray_base_form_with_index(ctx.array_base_form_with_index()));
        } else if (ctx.varible_from_object() != null) {
            parameter.setVariable_from_object(visitVarible_from_object(ctx.varible_from_object()));
        } else if (ctx.ONE_CHAR_LETTER() != null) {
            parameter.setOne_char(ctx.ONE_CHAR_LETTER().getText());
        } else if (ctx.genral_assign() != null) {
            parameter.setGeneral_assign(visitGenral_assign(ctx.genral_assign()));
        }
        return parameter;
    }


    @Override
    public Assignment visitGenral_assign(ParserReact.Genral_assignContext ctx) {
        System.out.println("General Assign");
        Assignment ins = new Assignment();
        ins.setInstrucation_name(Assignment.class.getName());

        if (ctx.assign_varible() != null) {
            ins.setVar(visitAssign_varible(ctx.assign_varible()));
            if (ins.getVar().getExpression() != null) {
                symanticCheck(ins);
            }
        } else if (ctx.assign_array() != null) {
            ins.setArray(visitAssign_array(ctx.assign_array()));
        } else if (ctx.assign_json() != null) {
            ins.setJson(visitAssign_json(ctx.assign_json()));
        }
        return ins;
    }

    @Override
    public assign_variable visitAssign_varible(ParserReact.Assign_varibleContext ctx) {
        System.out.println("visit variable assign");
        assign_variable var = new assign_variable();
        if (ctx.use_random_name() != null) {
            for (int i = 0; i < ctx.use_random_name().size(); i++) {
                VariableWithOperator variable_with_opretor = new VariableWithOperator();
                variable_with_opretor.setVariable_name(visitUse_random_name(ctx.use_random_name().get(i)));
                if (ctx.any_arithmetic_oprator() != null && ctx.any_arithmetic_oprator().size() != 0) {
                    variable_with_opretor.setOperator(ctx.any_arithmetic_oprator().get(i).getText());
                }
                var.getVariable_with_opretor().add(variable_with_opretor);
            }
        }
        if (ctx.bool_expression() != null) {
            var.setBooleanExpr(visitBool_expression(ctx.bool_expression()));
            var.setExpression(null);
        } else if (ctx.expression() != null) {
            var.setExpression(visitExpression(ctx.expression()));
            var.setBooleanExpr(null);
        }

        return var;
    }

    @Override
    public AssignArray visitAssign_array(ParserReact.Assign_arrayContext ctx) {
        System.out.println("visit assign_array");
        AssignArray arry = new AssignArray();

        ArrayWithOperator array_base_form_with_operetor = new ArrayWithOperator();
        ObjectFromArrayIndex array_base_with_index = new ObjectFromArrayIndex();
        if (ctx.array_base_form_with_index() != null) {
            for (int i = 0; i < ctx.any_arithmetic_oprator().size(); i++) {
                if (ctx.any_arithmetic_oprator() != null) {
                    if (ctx.any_arithmetic_oprator().get(i) != null)
                        array_base_form_with_operetor.setOperator(ctx.any_arithmetic_oprator().get(i).getText());
                }
            }
            for (int i = 0; i < ctx.array_base_form_with_index().size(); i++) {

                array_base_form_with_operetor.getArray_base_fom().add(visitArray_base_form_with_index(ctx.array_base_form_with_index(i)));
                arry.getArrayWithOperatorList().add(array_base_form_with_operetor);
            }
        }
        if (ctx.expression() != null) {
            arry.setExpression(visitExpression(ctx.expression()));
        }

        return arry;
    }


    @Override
    public ShortcutStatements visitShortcut_statments(ParserReact.Shortcut_statmentsContext ctx) {
        ShortcutStatements shortcut_statments = new ShortcutStatements();

        if (ctx.use_random_name() != null) {
            shortcut_statments.setShortcut_variable_name(visitUse_random_name(ctx.use_random_name()));

        }

        if (ctx.PLPL() != null) {
            shortcut_statments.setOprator(ctx.PLPL().getText());
        } else if (ctx.MINUS_MINUS() != null) {
            shortcut_statments.setOprator(ctx.MINUS_MINUS().getText());
        }

        System.out.println("shortcut stored : " + shortcut_statments.getInstrucation_name());
        System.out.println(shortcut_statments.getOprator());
        errorOfUsingUndeclaredVariable(scopesStack.peek(), shortcut_statments.getShortcut_variable_name());
        symanticCheck(shortcut_statments);
        return shortcut_statments;
    }

    @Override
    public ObjectFromArrayIndex visitArray_base_form_with_index(ParserReact.Array_base_form_with_indexContext ctx) {
        System.out.println("visit Array base form with index ");
        ObjectFromArrayIndex array_base_with_index = new ObjectFromArrayIndex();
        VariableArray array_base_form_variables = new VariableArray();
        for (int j = 0; j < ctx.NUMERIC_LITERAL().size(); j++) {
            if (ctx.NUMERIC_LITERAL() != null) {
                array_base_form_variables.setNumber(ctx.NUMERIC_LITERAL().get(j).getText());
            }
            for (int i = 0; i < ctx.varible_name().size(); i++) {
                if (ctx.varible_name() != null) {
                    array_base_form_variables.setVariable_name(visitUse_random_name(ctx.varible_name().get(j).use_random_name()));
                }
            }
            for (int i = 0; i < ctx.expression().size(); i++) {

                if (ctx.expression().get(j) != null) {
                    array_base_form_variables.setExpression(visitExpression(ctx.expression().get(j)));
                }
            }
            array_base_with_index.getArrayVariableList().add(array_base_form_variables);
        }
        return array_base_with_index;
    }


    @Override
    public Instruction visitSwitch_rule(ParserReact.Switch_ruleContext ctx) {
        System.out.println("visit Switch");
        Switch ins = new Switch();
        ins.setInstrucation_name(Switch.class.getName());
        Scope switchScope = new Scope();
        switchScope.setId(ctx.SWITCH().getText() + "_" + ctx.hashCode());
        switchScope.setParent(scopesStack.peek());
        scopesStack.push(switchScope);
        if (ctx.use_random_name() != null) {
            if (errorOfUsingUndeclaredVariable(scopesStack.peek(), ctx.use_random_name().getText())) {
            }
            ins.setVariable_name(visitUse_random_name(ctx.use_random_name()));
        } else if (ctx.ONE_CHAR_LETTER() != null) {
            ins.setTermenal_node(ctx.ONE_CHAR_LETTER().getSymbol().getText());
        } else if (ctx.NUMERIC_LITERAL() != null) {
            ins.setTermenal_node(ctx.NUMERIC_LITERAL().getSymbol().getText());
        } else if (ctx.call_function() != null) {
            errorOfUsingUndeclaredFunction(ctx.call_function().use_random_name().getText());
            ins.setTermenal_node(ctx.call_function().getText());

        } else if (ctx.varible_from_object() != null) {
            ins.setTermenal_node(ctx.varible_from_object().getText());
        } else if (ctx.bool_expression() != null) {
            ins.setBooleanExpr(visitBool_expression(ctx.bool_expression()));
//            todo do semantic check here for bool expression ....;
        } else if (ctx.genral_assign() != null) {
            ins.setS(visitGenral_assign(ctx.genral_assign()));
        }
        if (ctx.case_rule() != null) {
            for (int i = 0; i < ctx.case_rule().size(); i++) {
                ins.getCases().add(visitCase_rule(ctx.case_rule(i)));
            }
        }
        if (ctx.defult() != null) {
            ins.setDeafult(visitDefult(ctx.defult()));
        }
        Main.symbolTable.addScope(scopesStack.pop());

        return ins;
    }

    @Override
    public Case visitCase_rule(ParserReact.Case_ruleContext ctx) {
        System.out.println("visit Case");
        Case case_ins = new Case();

        if (ctx.bool_expression() != null) {
            case_ins.setBooleanExpr(visitBool_expression(ctx.bool_expression()));
//          todo do semantic check here for bool expression ....
        } else if (ctx.any_name() != null) {
            case_ins.setVariable_name(ctx.any_name().getText());
        } else if (ctx.NUMERIC_LITERAL() != null) {
            case_ins.setTermenal_node(ctx.NUMERIC_LITERAL().getText());
        } else if (ctx.ONE_CHAR_LETTER() != null) {
            case_ins.setTermenal_node(ctx.ONE_CHAR_LETTER().getText());
        } else if (ctx.varible_from_object() != null) {
            case_ins.setTermenal_node(ctx.varible_from_object().getText());
        }

        for (int i = 0; i < ctx.instructions().size(); i++) {
            case_ins.getInstructions().add(visitInstructions(ctx.instructions(i)));
        }
        if (ctx.return_rule() != null) {
            case_ins.setR(visitReturn_rule(ctx.return_rule()));
        }
        if (ctx.BREAK() != null) {
            System.out.println("visit the breake rule " + ctx.BREAK().getSymbol().getText().toString());
        }
        return case_ins;
    }

    @Override
    public Deafult visitDefult(ParserReact.DefultContext ctx) {
        System.out.println("visit Deafult");
        Deafult deafult = new Deafult();
        if (ctx.instructions() != null) {
            for (int i = 0; i < ctx.instructions().size(); i++) {
                deafult.getInstructions().add(visitInstructions(ctx.instructions(i)));
            }
        }
        if (ctx.return_rule() != null) {
            deafult.setR(visitReturn_rule(ctx.return_rule()));
        }
        if (ctx.BREAK() != null) {
            System.out.println("visit the break relue " + ctx.BREAK().getSymbol().getText());
        }
        return deafult;
    }


    @Override
    public ImportR visitImportR(ParserReact.ImportRContext ctx) {
        ImportR importR = new ImportR();
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof ParserReact.React_librariesContext) {
                importR.getReactLibs().add(visitReact_libraries((ParserReact.React_librariesContext) ctx.children.get(i)));
                System.out.println(importR.getReactLibs());
            }
        }


        return importR;
    }

    @Override
    public String visitReact_libraries(ParserReact.React_librariesContext ctx) {
        System.out.println("visit React_libraries Node for : " + ctx.getText());
        return ctx.getText();
    }

    //*********************************************************************************************


    @Override
    public Syntax visitSyntax(ParserReact.SyntaxContext ctx) {
        Syntax syntax = new Syntax();
        if (ctx.ONE_CHAR_LETTER() != null) {
            syntax.setSYNTAX(ctx.ONE_CHAR_LETTER().getText());
        }
        return syntax;
    }

    @Override
    public Export visitExport(ParserReact.ExportContext ctx) {
        Export export = new Export();
        if (ctx.SYNTAX() != null) {
            export.setSYNTAX(ctx.SYNTAX().getText());
        }
        if (ctx.EXPORT() != null) {
            export.setEXPORT(ctx.EXPORT().getText());
        }
        if (ctx.DEFAULT() != null) {
            export.setDEFAULT(ctx.DEFAULT().getText());
        }
        return export;
    }

//    @Override
//    public VariableDeclaration visitVariableDeclaration(ParserReact.VariableDeclarationContext ctx) {
//        VariableDeclaration variableDeclaration = new VariableDeclaration();
//        if (ctx.VAR() != null) {
//            variableDeclaration.setVAR(ctx.VAR().getText());
//        }
//        if (ctx.CONST() != null) {
//            variableDeclaration.setCONST(ctx.CONST().getText());
//        }
//        if (ctx.LET() != null) {
//            variableDeclaration.setLET(ctx.LET().getText());
//        }
//        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
//            if (ctx.SYNTAX(i) != null) {
//                variableDeclaration.getSYNTAXList().add(ctx.SYNTAX(i).getText());
//            }
//        }
//        for (int i = 0; i < ctx.arrayy().size(); i++) {
//            if (ctx.arrayy(i) != null) {
//                variableDeclaration.getArrayyList().add(ctx.arrayy(i).getText());
//            }
//        }
//        if (ctx.function2() != null) {
//            variableDeclaration.setFunction2((visitFunction2(ctx.function2())));
//        }
//        if (ctx.useRef() != null) {
//            variableDeclaration.setUseRef(visitUseRef(ctx.useRef()));
//        }
//        if (ctx.useState() != null) {
//            variableDeclaration.setUseState(visitUseState(ctx.useState()));
//        }
//        return variableDeclaration;
//
//    }
//
//    @Override
//    public Print visitPrint(ParserReact.PrintContext ctx) {
//        Print print = new Print();
//        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
//            if (ctx.SYNTAX(i) != null) {
//                print.getSYNTAXList().add(ctx.SYNTAX(i).getText());
//            }
//        }
//        if (ctx.CONSOLE_() != null) {
//            print.setCONSOLE_(ctx.CONSOLE_().getText());
//        }
//        if (ctx.LOG_() != null) {
//            print.setLOG_(ctx.LOG_().getText());
//        }
//        return print;
//    }

//    @Override
//    public Function1 visitFunction1(ParserReact.Function1Context ctx) {
//        Function1 function1 = new Function1();
//        if (ctx.FUNCTION() != null) {
//            function1.setFUNCTION(ctx.FUNCTION().getText());
//        }
//        if (ctx.RANDOM_NAME() != null) {
//            function1.setID(ctx.RANDOM_NAME().getText());
//        }
//        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
//            if (ctx.SYNTAX(i) != null) {
//                function1.getSYNTAXList().add(ctx.SYNTAX(i).getText());
//            }
//        }
//        if (ctx.functionBody() != null) {
//            function1.setFunctionBody(visitFunctionBody(ctx.functionBody()));
//        }
//        return function1;
//    }
//
//    @Override
//    public Function2 visitFunction2(ParserReact.Function2Context ctx) {
//        Function2 function2 = new Function2();
//        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
//            if (ctx.SYNTAX(i) != null) {
//                function2.getSYNTAXList().add(ctx.SYNTAX(i).getText());
//            }
//        }
//        if (ctx.functionBody() != null) {
//            function2.setFunctionBody(visitFunctionBody(ctx.functionBody()));
//        }
//        return function2;
//    }
//
//    @Override
//    public FunctionBody visitFunctionBody(ParserReact.FunctionBodyContext ctx) {
//        FunctionBody functionBody = new FunctionBody();
//        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
//            if (ctx.SYNTAX(i) != null) {
//                functionBody.getSYNTAXList().add(ctx.SYNTAX(i).getText());
//            }
//        }
//        for (int i = 0; i < ctx.print().size(); i++) {
//            if (ctx.print() != null) {
//                functionBody.getPrintlist().add(visitPrint(ctx.print(i)));
//            }
//        }
//        for (int i = 0; i < ctx.callFun().size(); i++) {
//            if (ctx.callFun() != null) {
//                functionBody.getCallFunlist().add(visitCallFun(ctx.callFun(i)));
//            }
//        }
//        for (int i = 0; i < ctx.jsxCode().size(); i++) {
//            if (ctx.jsxCode() != null) {
//                functionBody.getJsxCodelist().add(visitJsxCode(ctx.jsxCode(i)));
//            }
//        }
//        for (int i = 0; i < ctx.variableDeclaration().size(); i++) {
//            if (ctx.variableDeclaration() != null) {
//                functionBody.getVariableDeclarationlist().add(visitVariableDeclaration(ctx.variableDeclaration(i)));
//            }
//        }
//        if (ctx.returnStatement() != null) {
//            functionBody.setReturnStatement(visitReturnStatement(ctx.returnStatement()));
//        }
//        return functionBody;
//    }

//    @Override
//    public CallFun visitCallFun(ParserReact.CallFunContext ctx) {
//        CallFun callFun = new CallFun();
//        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
//            if (ctx.SYNTAX(i) != null) {
//                callFun.getSYNTAXList().add(ctx.SYNTAX(i).getText());
//            }
//        }
//        if (ctx.RANDOM_NAME() != null) {
//            callFun.setID(ctx.RANDOM_NAME().getText());
//        }
//        return callFun;
//    }
//
//    @Override
//    public ReturnStatement visitReturnStatement(ParserReact.ReturnStatementContext ctx) {
//        ReturnStatement returnStatement = new ReturnStatement();
//        if (ctx.returnStatement1() != null) {
//            returnStatement.setReturnStatement1(visitReturnStatement1(ctx.returnStatement1()));
//        }
//        if (ctx.RETURN() != null) {
//            returnStatement.setRETURN(ctx.RETURN().getText());
//        }
//        return returnStatement;
//    }
//
//    @Override
//    public ReturnStatement1 visitReturnStatement1(ParserReact.ReturnStatement1Context ctx) {
//        ReturnStatement1 returnStatement1 = new ReturnStatement1();
//        if (ctx.RETURN() != null) {
//            returnStatement1.setRETURN(ctx.RETURN().getText());
//        }
//        if (ctx.onClick() != null) {
//            returnStatement1.setOnClick(visitOnClick(ctx.onClick()));
//        }
//        if (ctx.mapMethod() != null) {
//            returnStatement1.setMapMethod(visitMapMethod(ctx.mapMethod()));
//        }
//        if (ctx.jsxElement() != null) {
//            returnStatement1.setJsxElement(visitJsxElement(ctx.jsxElement()));
//        }
//        return returnStatement1;
//    }

    @Override
    public Attributes visitAttributes(ParserReact.AttributesContext ctx) {
        Attributes attributes = new Attributes();
        for (int i = 0; i < ctx.attribute().size(); i++) {
            if (ctx.attribute() != null) {
                attributes.getAttributelist().add(visitAttribute(ctx.attribute(i)));
            }
        }
        return attributes;
    }

    @Override
    public Attribute visitAttribute(ParserReact.AttributeContext ctx) {
        Attribute attribute = new Attribute();
        if (ctx.RANDOM_NAME() != null) {
            attribute.setID(ctx.RANDOM_NAME().getText());
        }
        if (ctx.COLON() != null) {
            attribute.setCOLON(ctx.COLON().getText());
        }
        if (ctx.attributeValue() != null) {
            attribute.setAttributeValue(visitAttributeValue(ctx.attributeValue()));
        }
        return attribute;
    }

    @Override
    public AttributeValue visitAttributeValue(ParserReact.AttributeValueContext ctx) {
        AttributeValue attributeValue = new AttributeValue();
        if (ctx.SYNTAX() != null) {
            attributeValue.setSYNTAX(ctx.SYNTAX().getText());
        }
        return attributeValue;
    }

    @Override
    public Object visitArray(ParserReact.ArrayContext ctx) {
        Array array = new Array();
        if (ctx.VAR() != null) {
            array.setVAR(ctx.VAR().getText());
        }
        if (ctx.CONST() != null) {
            array.setCONST(ctx.CONST().getText());
        }
        if (ctx.LET() != null) {
            array.setLET(ctx.LET().getText());
        }
        if (ctx.arrayy() != null) {
            array.setArrayy(visitArrayy(ctx.arrayy()));
        }
        if (ctx.useState() != null) {
            array.setUseState(visitUseState(ctx.useState()));
        }
        return array;
    }

    @Override
    public Arrayy visitArrayy(ParserReact.ArrayyContext ctx) {
        Arrayy arrayy = new Arrayy();
        for (int i = 0; i < ctx.par().size(); i++) {
            if (ctx.par() != null) {
                arrayy.getParlist().add(visitPar(ctx.par(i)));
            }
        }
        return arrayy;
    }

    @Override
    public Par visitPar(ParserReact.ParContext ctx) {
        Par par = new Par();
        if (ctx.TYPE() != null) {
            par.setTYPE(ctx.TYPE().getText());
        }
        if (ctx.SYNTAX() != null) {
            par.setSYNTAX(ctx.SYNTAX().getText());
        }
        return par;
    }

    @Override
    public Map visitMap(ParserReact.MapContext ctx) {
        Map map = new Map();
        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
            if (ctx.SYNTAX(i) != null) {
                map.getSYNTAXList().add(ctx.SYNTAX(i).getText());
            }
        }
        for (int i = 0; i < ctx.attributeValue().size(); i++) {
            if (ctx.attributeValue() != null) {
                map.getAttributeValueList().add(visitAttributeValue(ctx.attributeValue(i)));
            }
        }
        for (int i = 0; i < ctx.arrayy().size(); i++) {
            if (ctx.arrayy() != null) {
                map.getArrayyList().add(visitArrayy(ctx.arrayy(i)));
            }
        }
        return map;
    }

//ahlam

    @Override
    public JsxOpenTag visitJsxOpenTag(ParserReact.JsxOpenTagContext ctx) {

        JsxOpenTag jsxO = new JsxOpenTag();
        for (int i = 0; i < ctx.jsxChild().size(); i++) {
            if (ctx.jsxChild(i) != null) {
                jsxO.getJsxChild().add(visitJsxChild(ctx.jsxChild(i)));
            }
        }
        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
            if (ctx.SYNTAX(i) != null) {
                jsxO.getID().add(ctx.jsxChild(i).getText());
            }
        }
        return jsxO;
    }

    @Override
    public JsxElement visitJsxElement(ParserReact.JsxElementContext ctx) {
        JsxElement jsxE = new JsxElement();
        for (int i = 0; i < ctx.jsxChild2().size(); i++) {
            if (ctx.jsxChild2(i) != null) {
                jsxE.getJsxChild2List().add(visitJsxChild2(ctx.jsxChild2(i)));
            }
        }
        return jsxE;
    }

    @Override
    public JsxCode visitJsxCode(ParserReact.JsxCodeContext ctx) {
        JsxCode jsxC = new JsxCode();
        if (ctx.jsxOpenTag() != null) {
            jsxC.setJsxOpenTag(visitJsxOpenTag(ctx.jsxOpenTag()));
        }
        if (ctx.jsxElement() != null) {
            jsxC.setJsxElement(visitJsxElement(ctx.jsxElement()));
        }
        if (ctx.syntax() != null) {
            jsxC.setSyntax((Syntax) visitSyntax(ctx.syntax()));
        }
        return jsxC;
    }

    @Override
    public JsxChild2 visitJsxChild2(ParserReact.JsxChild2Context ctx) {
        JsxChild2 jsxCh2 = new JsxChild2();
        if (ctx.jsxChild() != null) {
            jsxCh2.setJsxChild(visitJsxChild(ctx.jsxChild()));
        }
        if (ctx.functionCall() != null) {
            jsxCh2.setFunctionCall(visitFunctionCall(ctx.functionCall()));
        }
        if (ctx.jsxElement() != null) {
            jsxCh2.setJsxElement(visitJsxElement(ctx.jsxElement()));
        }
        return jsxCh2;
    }

    @Override
    public JsxChild visitJsxChild(ParserReact.JsxChildContext ctx) {
        JsxChild jsxCh = new JsxChild();
        if (ctx.SYNTAX() != null) {
            jsxCh.setSYNTAX(ctx.SYNTAX().getText());
        }
        if (ctx.MAP_() != null) {
            jsxCh.setMAP_(ctx.MAP_().getText());
        }
        return jsxCh;
    }

    @Override
    public FunctionalCall visitFunctionCall(ParserReact.FunctionCallContext ctx) {
        FunctionalCall fun = new FunctionalCall();
        for (int i = 0; i < ctx.jsxChild().size(); i++) {
            if (ctx.jsxChild(i) != null) {
                fun.getJsxChildlist().add(visitJsxChild(ctx.jsxChild(i)));
            }
        }
        if (ctx.RANDOM_NAME() != null) {
            fun.setID(ctx.RANDOM_NAME().getText());
        }
        return fun;
    }

    @Override
    public MapMethod visitMapMethod(ParserReact.MapMethodContext ctx) {
        MapMethod mapmethod = new MapMethod();
        if (ctx.MAP_() != null) {
            mapmethod.setMAP_(ctx.MAP_().getText());
        }
        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
            if (ctx.SYNTAX() != null) {
                mapmethod.getSYNTAXlist().add(visitSyntax((ParserReact.SyntaxContext) ctx.SYNTAX(i)));
            }
        }
        if (ctx.jsxElement() != null) {
            mapmethod.setJsxElement(visitJsxElement(ctx.jsxElement()));
        }
        return mapmethod;
    }

    @Override
    public UseEffect visitUseEffect(ParserReact.UseEffectContext ctx) {
        UseEffect useeffect = new UseEffect();
        if (ctx.arrayy() != null) {
            useeffect.setArrayy(visitArrayy(ctx.arrayy()));
        }
//        if (ctx.function2() != null) {
//            useeffect.setFunction2(visitFunction2(ctx.function2()));
//        }
        if (ctx.USEEFFECT_() != null) {
            useeffect.setUSEEFFECT_(ctx.USEEFFECT_().getText());
        }
        return useeffect;
    }


    @Override
    public UseRef visitUseRef(ParserReact.UseRefContext ctx) {
        UseRef useref = new UseRef();
        if (ctx.USEREF_() != null) {
            useref.setUSEREF_(ctx.USEREF_().getText());
        }
        return useref;
    }

    @Override
    public UseState visitUseState(ParserReact.UseStateContext ctx) {

        UseState useState = new UseState();
        for (int i = 0; i < ctx.SYNTAX().size(); i++) {
            if (ctx.SYNTAX(i) != null) {
                useState.getSYNTAXList().add(ctx.SYNTAX(i).getText());
            }
        }
        if (ctx.USESTATE_() != null) {
            useState.setUSESTATE_(ctx.USESTATE_().getText());
        }
        return useState;
    }


//  Error check ..............................


public boolean errorOfUsingUndeclaredVariable(Scope scope, String symbole_name) {
    boolean declared = false;
    while (scope.getParent() != null) {
        if (scope.getSymbolMap().containsKey(symbole_name)) {
            declared = true;
            break;
        } else {
            scope = scope.getParent();
            declared = false;
        }
    }
    if (!declared) {
        System.err.println(" Error variable   " + symbole_name + "  is not declared before ");
    }
    return declared;
}

public boolean errorOfUsingUndeclaredFunction(String function_name) {
    Scope scope = scopesStack.peek();
    while (scope != null) {
        if (scope.getSymbolMap().containsKey(function_name)) {
            return false;
        } else {
            scope = scope.getParent();
        }
    }
    System.err.println(" Error  the function   " + function_name + "   is not  declared before ");
    return true;
}


public boolean compareTwoTypes(Type firstType, Type secondType) {
    if (secondType.getName().equals(Type.VAR_TYPE)
//                || secondType.getName().equals("did not find variable")
//                || firstType.getName().equals("did not find variable")
    ) {
        return false;
    } else if (firstType.getName().equals(secondType.getName())) {
        return true;
    } else if (firstType.getName().equals(Type.VAR_TYPE))
        return true;
    else {
        System.err.println("can't assign variable with type: " + firstType.getName() + " to type: " + secondType.getName());
        return false;
    }
}


public Type addTypeForVariable(Expression expression, boolean checktypeValidation) {
    Type type = new Type();
    type.setName("**type conflict**");
    if (checktypeValidation) {
        type.setName(getFirstExpritionType(expression).getName());
    } else {

    }
    return type;
}

public Type getFirstExpritionType(Expression expression) {
    Type type = new Type();
    type.setName("undefined first function");
    ArrayList<InternalExpressionValue> expression_lists = convertExpretionListToArray(expression);
    if (expression_lists.get(0).getNUMERIC_LITERAL() != null) {
        type.setName(Type.INT_TYPE);
    } else if (expression_lists.get(0).getTure_or_False() != null) {
        type.setName(Type.BOOLEAN_TYPE);
    } else if (expression_lists.get(0).getIdentyfire() != null) {
        type.setName(Type.STRING_TYPE);
    } else if (expression_lists.get(0).getVariable_name() != null) {
        type = getSymbolType(expression_lists.get(0).getVariable_name().getVariable_name());
    }
    return type;
}

public boolean Check_From_ShortCut_Type(ShortcutStatements short_cut) {
    boolean isnot_shortcut = false;

    Symbol sym = scopesStack.peek().getSymbolMap().get(short_cut.getShortcut_variable_name());
    if (sym != null) {
        if (sym.getType().getName().equals(Type.INT_TYPE)) {
            System.err.println("can't applied :" + short_cut.getOprator() + "with type: " + sym.getType());

        }
    } else {
        Scope scop = scopesStack.peek().getParent();
        while (scop != null) {
            if (scop.getSymbolMap().get(short_cut.getShortcut_variable_name()) != null) {
                Symbol s = scop.getSymbolMap().get(short_cut.getShortcut_variable_name());
                if (s.getType().getName().equals(Type.INT_TYPE)) {
                    return true;

                }
            } else if (scop.getSymbolMap().get(short_cut.getShortcut_variable_name()) == null) {
                scop = scop.getParent();
            }
        }

    }
    return isnot_shortcut;
}

public Type getSymbolType(String variableName) {
    Scope currentScope = scopesStack.peek();
    Type variableType = new Type();
    variableType.setName("**type conflict**");
    while (currentScope.getParent() != null) {
        if (currentScope.getSymbolMap().containsKey(variableName)) {
            return currentScope.getSymbolMap().get(variableName).getType();
        } else {
            currentScope = currentScope.getParent();
        }
    }
    return variableType;
}

public boolean checkIsBooleanExpression(Expression expression) {

    return true;
}


public boolean checkExpressionTypeValid(Expression expression) {
    ArrayList<InternalExpressionValue> expression_lists = convertExpretionListToArray(expression);
    boolean undefinedVar = false;
    boolean valid = true;
    ArrayList<Type> types = new ArrayList<>();
    for (InternalExpressionValue intral_expression_value : expression_lists) {
        Type type = new Type();
        if (intral_expression_value.getNUMERIC_LITERAL() != null) {
            type.setName(Type.INT_TYPE);
            types.add(type);
        } else if (intral_expression_value.getTure_or_False() != null) {
            type.setName(Type.BOOLEAN_TYPE);
            types.add(type);
        } else if (intral_expression_value.getIdentyfire() != null) {
            type.setName(Type.STRING_TYPE);
            types.add(type);
        } else if (intral_expression_value.getVariable_name() != null) {
            if (errorOfUsingUndeclaredVariable(scopesStack.peek(), intral_expression_value.getVariable_name().getVariable_name())) {
                type.setName(getSymbolType(intral_expression_value.getVariable_name().getVariable_name()).getName());
                if (type.getName().equals(Type.VAR_TYPE)) {
                    undefinedVar = true;
                }

                types.add(type);
            }
        }

    }
    if (types.size() == 1 && !undefinedVar) {
        return true;
    } else {
        for (int i = 0; i < types.size(); i++) {
            if (types.get(i).getName().equals(Type.VAR_TYPE)) {
                System.err.println("trying to assign undefined variable ");
                valid = false;
            }
        }
        for (int i = 0; i < types.size() - 1; i++) {
            if (types.get(i).getName().equals(types.get(i + 1).getName())) {
            } else if ((types.get(i).getName().equals(Type.VAR_TYPE)) || types.get(i + 1).getName().equals(Type.VAR_TYPE)) {

            } else {
                // error in expression types
                System.err.println("Can't applied operation between " + types.get(i).getName() + " And " + types.get(i + 1).getName());
                valid = false;
            }
        }
    }

    return valid;

}


private ArrayList<InternalExpressionValue> convertExpretionListToArray(Expression expression) {
    ArrayList<InternalExpressionValue> expression_list = new ArrayList<>();

    extractDataFromExpretion(expression.getExpression_list(), expression_list);

    return expression_list;
}


public void extractDataFromExpretion(Expression_List expression_list, ArrayList<InternalExpressionValue> expression_lists) {
    if (expression_list.getIntral_expression_value() != null) {
        expression_lists.add(expression_list.getIntral_expression_value());
    }
    if (expression_list.getRight_expr() != null) {
        extractDataFromExpretion(expression_list.getRight_expr(), expression_lists);
    }
    if (expression_list.getLeft_expr() != null) {
        extractDataFromExpretion(expression_list.getLeft_expr(), expression_lists);
    }
    if (expression_list.getOne_line_if_expression() != null) {
        if (expression_list.getOne_line_if_expression().getBoolean_condition() != null) {
            extractDataFromExpretion(expression_list.getOne_line_if_expression().getBoolean_condition(), expression_lists);
        }
        if (expression_list.getOne_line_if_expression().getFirstelement() != null) {
            extractDataFromExpretion(expression_list.getOne_line_if_expression().getFirstelement(), expression_lists);

        }
        if (expression_list.getOne_line_if_expression().getSecond_element() != null) {
            extractDataFromExpretion(expression_list.getOne_line_if_expression().getSecond_element(), expression_lists);
        }
    }
    if (expression_list.getShortcut_statments() != null) {
        InternalExpressionValue intral_expression_value = new InternalExpressionValue();
        Variable_Name variable_name = new Variable_Name();
        variable_name.setVariable_name(expression_list.getShortcut_statments().getShortcut_variable_name());
        intral_expression_value.setVariable_name(variable_name);
        expression_lists.add(intral_expression_value);
    }
    if (expression_list.getBracket_expression() != null) {
        extractDataFromExpretion(expression_list.getBracket_expression().getExpression_list(), expression_lists);
    }
}


public void checkBoolExpression(ParserReact.Bool_expressionContext ctx) {
    if (ctx.isEmpty()) {
        System.err.println("the bool expression is not valid");
    }
}

private boolean symanticCheck() {
    boolean resault = true;
    return resault;
}

public boolean symanticCheck(ShortcutStatements shortcut_statments) {
    Scope scope = scopesStack.peek();
    boolean found = false;
    while (scope.getParent() != null) {
        if (scope.getSymbolMap().containsKey(shortcut_statments.getShortcut_variable_name())) {
            found = true;
            break;
        } else {
            scope = scope.getParent();
            found = false;

        }
    }
    if (found) {
        Type type = getSymbolType(shortcut_statments.getShortcut_variable_name());
        if (!type.getName().equals(Type.INT_TYPE)) {
            System.err.println("Can't applied :" + shortcut_statments.getOprator() + " to type: " + type.getName());
        }
    }
    return found;
}


private boolean symanticCheck(Assignment ins) {
    boolean resault = true;
    String leftSideVariableName = ins.getVar().getVariable_with_opretor().get(0).getVariable_name();
    resault = symanticCheck(ins.getVar().getExpression());

    resault = errorOfUsingUndeclaredVariable(scopesStack.peek(), leftSideVariableName);
    if (resault) {
        Type leftsideVariableType = getSymbolType(leftSideVariableName);
        resault = compareTwoTypes(leftsideVariableType, getFirstExpritionType(ins.getVar().getExpression()));
        if (resault) {
            leftsideVariableType.setName(getFirstExpritionType(ins.getVar().getExpression()).getName());
        }

    }
    return resault;
}

private boolean symanticCheck(Expression expression) {
    boolean resault = true;
    boolean haveVariable = false;
    resault = checkExpressionTypeValid(expression);

    return resault;
}

private boolean symanticCheck(CreateVariableWithAssign create_variable) {
    boolean resault, resault2;
    resault = itIsFirstDeclaredCheck(create_variable.getVar().getVariable_with_opretor().get(0).getVariable_name());
    resault2 = symanticCheck(create_variable.getVar().getExpression());

    return resault && resault2;

}


public void displayExprissionList(ArrayList<InternalExpressionValue> intral_expression_values) {
    for (InternalExpressionValue node : intral_expression_values) {
        if (node.getNUMERIC_LITERAL() != null) {
            System.out.println(node.getNUMERIC_LITERAL());
        } else if (node.getTure_or_False() != null) {
            System.out.println(node.getTure_or_False());
        } else if (node.getIdentyfire() != null) {
            System.out.println(node.getIdentyfire());
        } else if (node.getVariable_name() != null) {
            System.out.println(node.getVariable_name().getVariable_name());
        }
    }
}

public void dispalaySymbolsInScope(Scope scope) {

    for (Object symbol : scope.getSymbolMap().values().toArray()) {
        System.out.println("-Symbol: " + ((Symbol) symbol).getName());
        System.out.println("-Symbol Scope: " + ((Symbol) symbol).getScope().getId());
        System.out.println("-Symbol type: " + ((Symbol) symbol).getType().getName());
    }
}


public boolean itIsFirstDeclaredCheck(String name) {
    boolean result = true;
    Scope scope = scopesStack.peek();
    while (scope != null) {
        if (scope.getSymbolMap().containsKey(name)) {
            System.err.println("variable   " + name + "  can be declared at most once");
            result = false;
            break;
        } else {
            scope = scope.getParent();
        }
    }

    return result;
}


// .............................................

}


