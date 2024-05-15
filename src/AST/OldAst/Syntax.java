package AST.OldAst;

public class Syntax {
    String SYNTAX;

    public String getSYNTAX() {
        return SYNTAX;
    }

    public void setSYNTAX(String SYNTAX) {
        this.SYNTAX = SYNTAX;
    }

    @Override
    public String toString() {
        return "\n Syntax{" +
                "\n " + SYNTAX + '\'' +
                "\n }";
    }

}
