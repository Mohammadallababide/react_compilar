package AST.App;
import AST.instruction.function.FunctionDeclaration;
import AST.Common.Node;
import AST.ImportAst.ImportR;
import AST.OldAst.*;
import java.util.ArrayList;
import java.util.List;

public class App extends Node {
    List<ImportR> Importlist=new ArrayList<ImportR>();
    List<VariableDeclaration> variableDeclarationlist=new ArrayList<VariableDeclaration>();
    Export export;
    private List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();
    public List<ImportR> getImportlist() {
        return Importlist;
    }

    public List<FunctionDeclaration> getFunctions() {
        return functions;
    }

    public void setFunctions(List<FunctionDeclaration> functions) {
        this.functions = functions;
    }

    public void setImportlist(List<ImportR> importlist) {
        Importlist = importlist;
    }
    public List<VariableDeclaration> getVariableDeclarationlist() {
        return variableDeclarationlist;
    }
    public void setVariableDeclarationlist(List<VariableDeclaration> variableDeclarationlist) {
        this.variableDeclarationlist = variableDeclarationlist;
    }
    public Export getExport() {
        return export;
    }
    public void setExport(Export export) {
        this.export = export;
    }




}
