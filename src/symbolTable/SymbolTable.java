package symbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SymbolTable {
    private ArrayList<Scope> scopes = new ArrayList<>();
    private ArrayList<Type> declaredTypes = new ArrayList<>();
    private static SymbolTable single_instance = null;
    public boolean hasSyntaxError = false;
    public boolean hasSemanticError = false;
    // functions header should be added to our symbol table
    // declared component be added to our symbol table

    public SymbolTable() {
    }
    public static SymbolTable getSingle_instance() {
        return single_instance;
    }

    public static void setSingle_instance(SymbolTable single_instance) {
        SymbolTable.single_instance = single_instance;
    }

    public boolean isHasSyntaxError() {
        return hasSyntaxError;
    }

    public void setHasSyntaxError(boolean hasSyntaxError) {
        this.hasSyntaxError = hasSyntaxError;
    }

    public boolean isHasSemanticError() {
        return hasSemanticError;
    }

    public void setHasSemanticError(boolean hasSemanticError) {
        this.hasSemanticError = hasSemanticError;
    }

    public ArrayList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(ArrayList<Scope> scopes) {
        this.scopes = scopes;
    }

    public ArrayList<Type> getDeclaredTypes() {
        return declaredTypes;
    }

    public void setDeclaredTypes(ArrayList<Type> declaredTypes) {
        this.declaredTypes = declaredTypes;
    }

    public void addScope(Scope scope) {
        this.scopes.add(scope);
    }

    public void addType(Type type) {
        this.declaredTypes.add(type);
    }

    public static SymbolTable getInstance() {
        if (single_instance == null)
            single_instance = new SymbolTable();

        return single_instance;
    }

    public void write(String text) throws IOException {
        FileWriter syntaxError = new FileWriter("output//SyntaxError.txt");
        syntaxError.write(text);
        syntaxError.close();
    }

}
