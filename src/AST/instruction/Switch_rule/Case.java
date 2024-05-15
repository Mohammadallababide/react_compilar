package AST.instruction.Switch_rule;
import AST.expr.BooleanExpr;
import AST.instruction.Returning.ReturnRule;
import AST.instruction.FunctionalIns;

public class Case extends FunctionalIns {
    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

    public String getTermenal_node() {
        return termenal_node;
    }

    public void setTermenal_node(String termenal_node) {
        this.termenal_node = termenal_node;
    }

    public BooleanExpr getBooleanExpr() {
        return booleanExpr;
    }

    public void setBooleanExpr(BooleanExpr booleanExpr) {
        this.booleanExpr = booleanExpr;
    }

    String variable_name ;
    String termenal_node ;
    ReturnRule r ;
    BooleanExpr booleanExpr ;
    public ReturnRule getR() {
        return r;
    }

    public void setR(ReturnRule r) {
        this.r = r;
    }
}
