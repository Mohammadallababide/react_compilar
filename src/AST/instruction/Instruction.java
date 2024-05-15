package AST.instruction;


import AST.Common.Node;

public class Instruction extends Node {
    private String instrucation_name ;

    public String getInstrucation_name() {
        return instrucation_name;
    }

    public void setInstrucation_name(String instrucation_name) {
        this.instrucation_name = instrucation_name;
    }

}
