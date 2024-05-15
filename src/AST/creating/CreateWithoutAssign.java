package AST.creating;

import AST.creating.Array.CreateArrayWithoutAssign;
import AST.creating.Json.CreateJsonWithoutAssign;
import AST.creating.Variable.CreateVariableWithoutAssign;

public class CreateWithoutAssign extends GeneralCreating {
    CreateVariableWithoutAssign var  ;
    CreateArrayWithoutAssign array ;
    CreateJsonWithoutAssign json ;
    public void setVar(CreateVariableWithoutAssign var) {
        this.var = var;
    }

    public void setArray(CreateArrayWithoutAssign array) {
        this.array = array;
    }

    public CreateVariableWithoutAssign getVar() {
        return var;
    }

    public CreateArrayWithoutAssign getArray() {
        return array;
    }

    public void setJson(CreateJsonWithoutAssign json) {
        this.json = json;
    }

    public CreateJsonWithoutAssign getJson() {
        return json;
    }

}
