package AST.instruction.function.ParametesandArgs;


import AST.Common.Node;
import AST.creating.CreateWithoutAssign;

public class Args  extends Node {
    CreateWithoutAssign creating ;

    public void setCreating(CreateWithoutAssign creating) {
        this.creating = creating;
    }

    public CreateWithoutAssign getCreating() {
        return creating;
    }

}
