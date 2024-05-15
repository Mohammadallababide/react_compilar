package AST.instruction.loops;

import AST.instruction.FunctionalIns;

public class Foreach extends FunctionalIns {
    public String getLoop_variable() {
        return loop_variable;
    }

    public void setLoop_variable(String loop_variable) {
        this.loop_variable = loop_variable;
    }

    public String getObject_variable() {
        return object_variable;
    }

    public void setObject_variable(String object_variable) {
        this.object_variable = object_variable;
    }

    String loop_variable;
    String object_variable;

}
