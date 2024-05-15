package AST.instruction;


import AST.instruction.function.ParametesandArgs.Parameter;

import java.util.ArrayList;
import java.util.List;

public class CallFunction extends NonFunctionalIns {

    public CallFunction(){
        this.parameters = new ArrayList<>();
    }

    public String getFunction_name() {
        return function_name;
    }

    public void setFunction_name(String function_name) {
        this.function_name = function_name;
    }

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    String function_name ;
    List<Parameter> parameters;
}
