package AST.assignmnet;


import AST.instruction.NonFunctionalIns;

public class Assignment extends NonFunctionalIns {             // extends from instructions
    AssignArray array ;
    JsonAssign json ;
    assign_variable var ;
    public void setJson(JsonAssign json) {
        this.json = json;
    }

    public JsonAssign getJson() {
        return json;
    }

    public void setArray(AssignArray array) {
        this.array = array;
    }

    public AssignArray getArray() {
        return array;
    }

    public void setVar(assign_variable var) {
        this.var = var;
    }

    public assign_variable getVar() {
        return var;
    }

}
