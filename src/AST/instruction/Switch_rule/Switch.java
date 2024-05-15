package AST.instruction.Switch_rule;


import AST.assignmnet.Assignment;
import AST.expr.BooleanExpr;
import AST.instruction.NonFunctionalIns;

import java.util.ArrayList;
import java.util.List;

public class Switch extends NonFunctionalIns {

    public Switch(){
        this.cases = new ArrayList<>();
    }

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



    public List<Case> getCases() {
        return cases;
    }

    public void setCases(List<Case> cases) {
        this.cases = cases;
    }

    public Deafult getDeafult() {
        return deafult;
    }

    public void setDeafult(Deafult deafult) {
        this.deafult = deafult;
    }

    public BooleanExpr getBooleanExpr() {
        return booleanExpr;
    }

    public void setBooleanExpr(BooleanExpr booleanExpr) {
        this.booleanExpr = booleanExpr;
    }

    String variable_name;

    BooleanExpr booleanExpr;

    String termenal_node;


    public Assignment getS() {
        return s;
    }

    public void setS(Assignment s) {
        this.s = s;
    }

    Assignment s ;
    List<Case>cases ;
    Deafult deafult ;


}
