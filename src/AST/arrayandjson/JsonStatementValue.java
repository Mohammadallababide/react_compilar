package AST.arrayandjson;

import org.antlr.v4.runtime.Token;

public class JsonStatementValue extends InsideJsonStatement {
   public Token types;
    VariabelFromObject object ;
    JsonStatement statmnet ;

    public void setTypes(Token types) {
        this.types = types;
    }

    public Token getTypes() {
        return types;
    }

    public void setObject(VariabelFromObject object) {
        this.object = object;
    }

    public VariabelFromObject getObject() {
        return object;
    }

    public void setStatmnet(JsonStatement statmnet) {
        this.statmnet = statmnet;
    }

    public JsonStatement getStatmnet() {
        return statmnet;
    }
}
