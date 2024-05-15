package AST.OldAst;

public class Par {
    String TYPE,SYNTAX;

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE;
    }

    public String getSYNTAX() {
        return SYNTAX;
    }

    public void setSYNTAX(String SYNTAX) {
        this.SYNTAX = SYNTAX;
    }

    @Override
    public String toString() {
        return "Par{" +
                "TYPE='" + TYPE + '\'' +
                ", SYNTAX='" + SYNTAX + '\'' +
                "\n}";
    }
}
