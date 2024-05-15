package AST.arrayandjson;


import AST.Common.Node;
import AST.expr.Expression;

public class VariableArray extends Node {


    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }


    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    String variable_name;

    Expression expression;

    String Number;

}
