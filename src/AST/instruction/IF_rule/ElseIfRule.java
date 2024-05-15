package AST.instruction.IF_rule;


import AST.expr.BooleanExpr;
import AST.instruction.FunctionalIns;

public class ElseIfRule extends FunctionalIns {


  public BooleanExpr getBooleanExpr() {
    return booleanExpr;
  }

  public void setBooleanExpr(BooleanExpr booleanExpr) {
    this.booleanExpr = booleanExpr;
  }

  private BooleanExpr booleanExpr;
}
