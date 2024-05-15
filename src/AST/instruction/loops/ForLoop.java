package AST.instruction.loops;


import AST.creating.CreateWithAssign;
import AST.creating.CreateWithoutAssign;
import AST.expr.BooleanExpr;
import AST.instruction.FunctionalIns;

public class ForLoop extends FunctionalIns {
    public InsideForLoop getLeft_inside_for_loop() {
        return left_inside_for_loop;
    }

    public void setLeft_inside_for_loop(InsideForLoop left_inside_for_loop) {
        this.left_inside_for_loop = left_inside_for_loop;
    }

    public InsideForLoop getRight_inside_for_loop() {
        return right_inside_for_loop;
    }

    public void setRight_inside_for_loop(InsideForLoop right_inside_for_loop) {
        this.right_inside_for_loop = right_inside_for_loop;
    }

    public CreateWithAssign getVar_with_asgn() {
        return var_with_asgn;
    }

    public void setVar_with_asgn(CreateWithAssign var_with_asgn) {
        this.var_with_asgn = var_with_asgn;
    }

    public CreateWithoutAssign getVar_without_asgn() {
        return var_without_asgn;
    }

    public void setVar_without_asgn(CreateWithoutAssign var_without_asgn) {
        this.var_without_asgn = var_without_asgn;
    }

    public BooleanExpr getBooleanExpr() {
        return booleanExpr;
    }

    public void setBooleanExpr(BooleanExpr booleanExpr) {
        this.booleanExpr = booleanExpr;
    }

    InsideForLoop left_inside_for_loop ;
    InsideForLoop right_inside_for_loop ;
    CreateWithAssign var_with_asgn;
    CreateWithoutAssign var_without_asgn;
    BooleanExpr booleanExpr;

}
