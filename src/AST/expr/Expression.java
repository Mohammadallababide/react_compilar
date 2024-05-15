package AST.expr;


import AST.Common.Node;

public class Expression extends Node {



    public Expression_List getExpression_list() {
        return expression_list;
    }

    public void setExpression_list(Expression_List expression_list) {
        this.expression_list = expression_list;
    }



    Expression_List expression_list ;

}
