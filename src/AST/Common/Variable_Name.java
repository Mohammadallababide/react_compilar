package AST.Common;
public class Variable_Name extends Node {
    String variable_name;

    public Variable_Name() {
    }

    public String getVariable_name() {
        return this.variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }
}
