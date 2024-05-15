package AST.instruction.Returning;


import AST.instruction.NonFunctionalIns;

public class ReturnRule extends NonFunctionalIns {

    ReturnType t ;

    public void setT(ReturnType t) {
        this.t = t;
    }

    public ReturnType getT() {
        return t;
    }

}
