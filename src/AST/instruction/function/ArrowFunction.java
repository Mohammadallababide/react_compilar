package AST.instruction.function;

import AST.instruction.function.ParametesandArgs.Args;

import java.util.ArrayList;
import java.util.List;

public class ArrowFunction extends FunctionDeclaration {
    List<Args> argsList = new ArrayList<>();
    FunctionBody body ;

    public List<Args> getArgsList() {
        return argsList;
    }

    public void setArgsList(List<Args> argsList) {
        this.argsList = argsList;
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    public FunctionBody getBody() {
        return body;
    }
}
