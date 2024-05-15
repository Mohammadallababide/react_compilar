package AST.instruction.function.ParametesandArgs;


import AST.Common.Node;
import AST.arrayandjson.ObjectFromArrayIndex;
import AST.arrayandjson.VariabelFromObject;
import AST.assignmnet.Assignment;
import AST.instruction.CallFunction;

public class Parameter extends Node {

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOne_char() {
        return one_char;
    }

    public void setOne_char(String one_char) {
        this.one_char = one_char;
    }

    public String getIdentifire() {
        return identifire;
    }

    public void setIdentifire(String identifire) {
        this.identifire = identifire;
    }

    public String getVariable_name() {
        return variable_name;
    }

    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name;
    }

    public ObjectFromArrayIndex getArray_base_with_index() {
        return array_base_with_index;
    }

    public void setArray_base_with_index(ObjectFromArrayIndex array_base_with_index) {
        this.array_base_with_index = array_base_with_index;
    }

    public VariabelFromObject getVariable_from_object() {
        return variable_from_object;
    }

    public void setVariable_from_object(VariabelFromObject variable_from_object) {
        this.variable_from_object = variable_from_object;
    }

    public CallFunction getCallFunction() {
        return callFunction;
    }

    public void setCallFunction(CallFunction callFunction) {
        this.callFunction = callFunction;
    }

    public Assignment getGeneral_assign() {
        return general_assign;
    }

    public void setGeneral_assign(Assignment general_assign) {
        this.general_assign = general_assign;
    }

    String number ;
    String one_char ;
    String identifire ;
    String variable_name ;
    ObjectFromArrayIndex array_base_with_index;
    VariabelFromObject variable_from_object;
    CallFunction callFunction;
    Assignment general_assign;

}
