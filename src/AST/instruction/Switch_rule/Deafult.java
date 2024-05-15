package AST.instruction.Switch_rule;
import AST.instruction.Returning.ReturnRule;
import AST.instruction.FunctionalIns;

public class Deafult extends FunctionalIns {
    public ReturnRule getR() {
        return r;
    }

    public void setR(ReturnRule r) {
        this.r = r;
    }

    ReturnRule r;

}
