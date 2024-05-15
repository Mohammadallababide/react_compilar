package AST.expr;


import AST.Common.Node;

public class Literal_Value extends Node {
private String returnType;
    public  String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }
}
