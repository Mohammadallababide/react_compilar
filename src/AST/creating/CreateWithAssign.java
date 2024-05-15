package AST.creating;


import AST.creating.Array.CreateArrayWithAssign;
import AST.creating.Json.CreateJsonWithAssign;
import AST.creating.Variable.CreateVariableWithAssign;

public class CreateWithAssign extends GeneralCreating {
    CreateJsonWithAssign json_wiht_assign ;
    CreateVariableWithAssign var_wiht_assign ;
    CreateArrayWithAssign array_with_assign ;

    public void setJson_wiht_assign(CreateJsonWithAssign json_wiht_assign) {
        this.json_wiht_assign = json_wiht_assign;
    }
    public CreateJsonWithAssign getJson_wiht_assign() {
        return json_wiht_assign;
    }

    public CreateWithAssign getVar_wiht_assign() {
        return var_wiht_assign;
    }

    public void setVar_wiht_assign( CreateVariableWithAssign var_wiht_assign) {
        this.var_wiht_assign = var_wiht_assign;
    }

    public CreateArrayWithAssign getArray_with_assign() {
        return array_with_assign;
    }

    public void setArray_with_assign(CreateArrayWithAssign array_with_assign) {
        this.array_with_assign = array_with_assign;
    }
}
