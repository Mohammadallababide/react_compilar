package AST.arrayandjson;

public class InsideJsonStatement extends JsonStatement {

    JsonStatementValue value;


    public void setValue(JsonStatementValue value) {
        this.value = value;
    }

    public JsonStatementValue getValue() {
        return value;
    }
}

