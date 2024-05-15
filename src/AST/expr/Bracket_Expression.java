package AST.expr;


import AST.Common.Node;
import AST.assignmnet.Assignment;

public class Bracket_Expression extends Node {
    Expression_List expression_list;
    Assignment assign;

    public Bracket_Expression() {
    }

    public Assignment getAssign() {
        return this.assign;
    }

    public void setAssign(Assignment assign) {
        this.assign = assign;
    }

    public Expression_List getExpression_list() {
        return this.expression_list;
    }

    public void setExpression_list(Expression_List expression_list) {
        this.expression_list = expression_list;
    }
}
