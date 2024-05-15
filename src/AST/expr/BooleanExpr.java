package AST.expr;

import AST.Common.Node;


public class BooleanExpr extends Node {
   Expression expression;
   String operator;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
