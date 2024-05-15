package AST.arrayandjson;


import AST.Common.Node;

public class ArrayLeftSide extends Node {
    String  name ;
    ArrayValue arrayValueForm;


   //  factored_select;
    public String  getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArrayValueForm(ArrayValue arrayValueForm) {
        this.arrayValueForm = arrayValueForm;
    }

    public ArrayValue getArrayValueForm() {
        return arrayValueForm;
    }

}
