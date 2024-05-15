package symbolTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class Scope {
    private String id;
    private Scope parent;
    private Map<String, Symbol> symbolMap = new LinkedHashMap();
    private Map<String, Type> typeMap = new LinkedHashMap<>();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public Map<String, Symbol> getSymbolMap() {
        return symbolMap;
    }

    public void setSymbolMap(Map<String, Symbol> symbolMap) {
        this.symbolMap = symbolMap;
    }

    public Map<String, Type> getTypeMap() {
        return typeMap;
    }

    public void setTypeMap(Map<String, Type> typeMap) {
        this.typeMap = typeMap;
    }
    public void addType(String type_name, Type type) {
        this.typeMap.put(type_name , type);
    }
    public void addSymbol(String name, Symbol symbol) {
        this.symbolMap.put(name, symbol);
    }
}
