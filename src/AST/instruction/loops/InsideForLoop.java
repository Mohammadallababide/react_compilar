package AST.instruction.loops;


import AST.Common.Node;
import AST.assignmnet.AssignArray;
import AST.assignmnet.assign_variable;
import AST.creating.Array.CreateArrayWithoutAssign;
import AST.expr.Expression;
import AST.instruction.ShortcutStatements;

public class InsideForLoop extends Node {
    public AssignArray getAssign_array() {
        return assign_array;
    }

    public void setAssign_array(AssignArray assign_array) {
        this.assign_array = assign_array;
    }

    public assign_variable getVar() {
        return var;
    }

    public void setVar(assign_variable var) {
        this.var = var;
    }

    public CreateArrayWithoutAssign getCreate_arry_without_assign() {
        return create_arry_without_assign;
    }

    public void setCreate_arry_without_assign(CreateArrayWithoutAssign create_arry_without_assign) {
        this.create_arry_without_assign = create_arry_without_assign;
    }

    public ShortcutStatements getShortcut_statments() {
        return shortcut_statments;
    }

    public void setShortcut_statments(ShortcutStatements shortcut_statments) {
        this.shortcut_statments = shortcut_statments;
    }
    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }


    AssignArray assign_array ;
    assign_variable var ;
    CreateArrayWithoutAssign create_arry_without_assign;
    ShortcutStatements shortcut_statments;
    Expression expression;

}
