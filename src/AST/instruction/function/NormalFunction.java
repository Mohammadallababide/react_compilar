package AST.instruction.function;

public class NormalFunction extends FunctionDeclaration {
    FunctionHeader header ;
    FunctionBody body ;
    // coposotion betwen function body because visited will visited header then function body
    public void setHeader(FunctionHeader header) {
        this.header = header;
    }

    public void setBody(FunctionBody body) {
        this.body = body;
    }

    public FunctionHeader getHeader() {
        return header;
    }

    public FunctionBody getBody() {
        return body;
    }
}
