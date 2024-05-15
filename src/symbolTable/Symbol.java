package symbolTable;

public class Symbol {
    private String name;
    private Type type;
    private Scope scope;
    private boolean isParam;
    private boolean isFunction;

    public Symbol() {
    }


    public boolean isParam() {
        return isParam;
    }

    public void setParam(boolean param) {
        isParam = param;
    }

    public boolean isFunction() {
        return isFunction;
    }

    public void setFunction(boolean function) {
        isFunction = function;
    }

    public String getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public Scope getScope() {
        return this.scope;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public boolean getIsParam() {
        return this.isParam;
    }

    public void setIsParam(boolean param) {
        this.isParam = param;
    }


}
