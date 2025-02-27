package AST.expr;
import AST.Common.Node;

public class OnLineIfExpr extends Node {
    Expression_List boolean_condition;
    Expression_List firstelement;
    Expression_List second_element;

    public OnLineIfExpr() {
    }

    public Expression_List getBoolean_condition() {
        return this.boolean_condition;
    }

    public void setBoolean_condition(Expression_List boolean_condition) {
        this.boolean_condition = boolean_condition;
    }

    public Expression_List getFirstelement() {
        return this.firstelement;
    }

    public void setFirstelement(Expression_List firstelement) {
        this.firstelement = firstelement;
    }

    public Expression_List getSecond_element() {
        return this.second_element;
    }

    public void setSecond_element(Expression_List second_element) {
        this.second_element = second_element;
    }
}
