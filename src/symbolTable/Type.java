package symbolTable;

public class Type {
private String name ;
private Scope scope;
    public static final String INT_TYPE = "int";
    public static final String STRING_TYPE = "string";
    public static final String BOOLEAN_TYPE = "boolean";
    public static final String LET_TYPE = "let";
    public static final String CONST_TYPE = "const";
    public static final String VAR_TYPE = "var";
    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
