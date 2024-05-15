package AST.instruction.Print_rule;


import AST.Common.Node;
import AST.arrayandjson.ObjectFromArrayIndex;
import AST.arrayandjson.VariabelFromObject;
import AST.expr.Expression;
import AST.instruction.CallFunction;

public class InsidePrintStatement extends Node {

    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public VariabelFromObject getVariable_from_object() {
        return variable_from_object;
    }

    public void setVariable_from_object(VariabelFromObject variable_from_object) {
        this.variable_from_object = variable_from_object;
    }

    public ObjectFromArrayIndex getArray_base_with_index() {
        return array_base_with_index;
    }

    public void setArray_base_with_index(ObjectFromArrayIndex array_base_with_index) {
        this.array_base_with_index = array_base_with_index;
    }

    String  variable_name;

    public String getIdentifire() {
        return identifire;
    }

    public void setIdentifire(String identifire) {
        this.identifire = identifire;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    Expression expression;
    String identifire ;
    CallFunction callFunction;
    VariabelFromObject variable_from_object;
    ObjectFromArrayIndex array_base_with_index;

}
