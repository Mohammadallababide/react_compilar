package AST.instruction.loops;


import AST.expr.BooleanExpr;
import AST.instruction.FunctionalIns;

public class While_Rule extends FunctionalIns {
    BooleanExpr booleanExpr ;

    public BooleanExpr getBooleanExpr() {
        return booleanExpr;
    }

    public void setBooleanExpr(BooleanExpr booleanExpr) {
        this.booleanExpr = booleanExpr;
    }
}
