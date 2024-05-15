package AST.assignmnet;

import AST.Common.Node;
import AST.Common.VariableWithOperator;
import AST.expr.BooleanExpr;
import AST.expr.Expression;

import java.util.ArrayList;
import java.util.List;

public class assign_variable extends Node {

    public assign_variable(){
        this.variable_with_opretor = new ArrayList<>();
    }

    public List<VariableWithOperator> getVariable_with_opretor() {
        return variable_with_opretor;
    }

    public void setVariable_with_opretor(List<VariableWithOperator> variable_with_opretor) {
        this.variable_with_opretor = variable_with_opretor;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    Expression expression;
    BooleanExpr booleanExpr;

    public BooleanExpr getBooleanExpr() {
        return booleanExpr;
    }

    public void setBooleanExpr(BooleanExpr booleanExpr) {
        this.booleanExpr = booleanExpr;
    }

    List<VariableWithOperator> variable_with_opretor ;


}
