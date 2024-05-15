package AST.creating.Variable;

import AST.assignmnet.assign_variable;
import AST.creating.CreateWithAssign;

public class CreateVariableWithAssign extends CreateWithAssign {
    assign_variable var ;

    public void setVar(assign_variable var) {
        this.var = var;
    }

    public assign_variable getVar() {
        return var;
    }

}
