package AST.instruction.function;


import AST.Common.Node;

public class FunctionDeclaration extends Node {
NormalFunction normalFunction ;
ArrowFunction arrowFunction ;

    public NormalFunction getNormalFunction() {
        return normalFunction;
    }

    public void setNormalFunction(NormalFunction normalFunction) {
        this.normalFunction = normalFunction;
    }

    public ArrowFunction getArrowFunction() {
        return arrowFunction;
    }

    public void setArrowFunction(ArrowFunction arrowFunction) {
        this.arrowFunction = arrowFunction;
    }
}
