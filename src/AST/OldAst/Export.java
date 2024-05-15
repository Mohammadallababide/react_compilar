package AST.OldAst;

public class Export {
    String EXPORT;
    String DEFAULT;
    String SYNTAX;

    public String getEXPORT() {
        return EXPORT;
    }

    public void setEXPORT(String EXPORT) {
        this.EXPORT = EXPORT;
    }

    public String getDEFAULT() {
        return DEFAULT;
    }

    public void setDEFAULT(String DEFAULT) {
        this.DEFAULT = DEFAULT;
    }

    public String getSYNTAX() {
        return SYNTAX;
    }

    public void setSYNTAX(String SYNTAX) {
        this.SYNTAX = SYNTAX;
    }

    @Override
    public String toString() {
        return "\n Export{" +
                "\n " + EXPORT + '\'' +
                "\n " + DEFAULT + '\'' +
                "\n " + SYNTAX + '\'' +
                "\n}";
    }


}
