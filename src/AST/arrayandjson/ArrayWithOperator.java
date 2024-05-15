package AST.arrayandjson;


import AST.Common.Node;

import java.util.ArrayList;
import java.util.List;


public class ArrayWithOperator extends Node {
    List<ObjectFromArrayIndex> objectFromArrayIndexList;
    String operator;

    public ArrayWithOperator(){
        this.objectFromArrayIndexList = new ArrayList<>();
    }
    public List<ObjectFromArrayIndex> getArray_base_fom() {
        return objectFromArrayIndexList;
    }

    public void setArray_base_fom(List<ObjectFromArrayIndex> array_base_fom) {
        this.objectFromArrayIndexList = array_base_fom;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
