package AST.instruction.IF_rule;


import AST.expr.BooleanExpr;
import AST.instruction.FunctionalIns;
import AST.instruction.Instruction;

import java.util.ArrayList;
import java.util.List;

public class IFElse extends FunctionalIns {

    public IFElse() {
        else_if = new ArrayList<>();
    }

    public void add_Else_if_rule_in_if(Instruction node){
        else_if.add(node);
    }

    public List<Instruction> getElse_if() {
        return else_if;
    }

    public void setElse_if(List<Instruction> else_if) {
        this.else_if = else_if;
    }

    public Instruction getElse_rule() {
        return else_rule;
    }

    public void setElse_rule(Instruction else_rule) {
        this.else_rule = else_rule;
    }


    public BooleanExpr getBooleanExpr() {
        return booleanExpr;
    }

    public void setBooleanExpr(BooleanExpr booleanExpr) {
        this.booleanExpr = booleanExpr;
    }

    BooleanExpr booleanExpr ;

    private List<Instruction> else_if ;

    private Instruction else_rule ;

   /* public returning_in_if getR() {
        return r;
    }*/

   /* public void setR(returning_in_if r) {
        this.r = r;
    }*/
}
