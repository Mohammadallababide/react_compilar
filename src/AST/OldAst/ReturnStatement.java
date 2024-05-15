package AST.OldAst;

public class ReturnStatement {
    ReturnStatement1 returnStatement1;
    String RETURN;

    public ReturnStatement1 getReturnStatement1() {
        return returnStatement1;
    }

    public void setReturnStatement1(ReturnStatement1 returnStatement1) {
        this.returnStatement1 = returnStatement1;
    }

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    @Override
    public String toString() {
        return "\n ReturnStatement{" +
                "\n" + returnStatement1 +
                "\n" + RETURN + '\'' +
                "\n}";
    }

}
