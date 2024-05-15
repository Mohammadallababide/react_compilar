package AST.instruction.function;

import AST.Common.Node;
import AST.instruction.Returning.ReturnRule;

import java.util.ArrayList;
import java.util.List;

public class FunctionBody extends Node {

    List<Object> nodes = new ArrayList<Object>();
    ReturnRule r ;

    public List<Object> getInstructions() {
        return nodes;
    }

    public void setlist(List<Object> instructions) {
        this.nodes = instructions;
    }
    public void addNode(Object Node){
        this.nodes.add(Node);
    }

    public ReturnRule getR() {
        return r;
    }

    public void setR(ReturnRule r) {
        this.r = r;
    }



}
