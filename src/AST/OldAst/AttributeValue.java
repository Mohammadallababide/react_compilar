package AST.OldAst;

public class AttributeValue {
    String SYNTAX;
    public String getSYNTAX() {
        return SYNTAX;
    }

    public void setSYNTAX(String SYNTAX) {
        this.SYNTAX = SYNTAX;
    }

    @Override
    public String toString() {
        return "\n AttributeValue{" +
                "\n" + SYNTAX + '\'' +
                "\n}";
    }


}
