package AST.OldAst;

import AST.instruction.Print_rule.PrintStatement;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody {
    List<VariableDeclaration> variableDeclarationlist=new ArrayList<VariableDeclaration>();
    List<String> SYNTAXList = new ArrayList<String>();
    List<PrintStatement> printlist=new ArrayList<PrintStatement>();
    List<CallFun> callFunlist=new ArrayList<CallFun>();
    List<JsxCode> jsxCodelist=new ArrayList<JsxCode>();
    ReturnStatement returnStatement;

    public List<VariableDeclaration> getVariableDeclarationlist() {
        return variableDeclarationlist;
    }

    public void setVariableDeclarationlist(List<VariableDeclaration> variableDeclarationlist) {
        this.variableDeclarationlist = variableDeclarationlist;
    }

    public List<String> getSYNTAXList() {
        return SYNTAXList;
    }

    public void setSYNTAXList(List<String> SYNTAXList) {
        this.SYNTAXList = SYNTAXList;
    }

    public List<PrintStatement> getPrintlist() {
        return printlist;
    }

    public void setPrintlist(List<PrintStatement> printlist) {
        this.printlist = printlist;
    }

    public List<CallFun> getCallFunlist() {
        return callFunlist;
    }

    public void setCallFunlist(List<CallFun> callFunlist) {
        this.callFunlist = callFunlist;
    }

    public List<JsxCode> getJsxCodelist() {
        return jsxCodelist;
    }

    public void setJsxCodelist(List<JsxCode> jsxCodelist) {
        this.jsxCodelist = jsxCodelist;
    }

    public ReturnStatement getReturnStatement() {
        return returnStatement;
    }

    public void setReturnStatement(ReturnStatement returnStatement) {
        this.returnStatement = returnStatement;
    }

    @Override
    public String toString() {
        return "\n FunctionBody{" +
                "\n" + variableDeclarationlist +
                "\n" + SYNTAXList +
                "\n" + printlist +
                "\n" + callFunlist +
                "\n" + jsxCodelist +
                "\n" + returnStatement +
                "\n}";
    }


}
