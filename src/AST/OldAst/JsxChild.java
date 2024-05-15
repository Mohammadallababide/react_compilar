package AST.OldAst;

public class JsxChild {

          String SYNTAX;
          String MAP_;


    public String getSYNTAX() {
        return SYNTAX;
    }

    public void setSYNTAX(String SYNTAX) {
        this.SYNTAX = SYNTAX;
    }

    public String getMAP_() {
        return MAP_;
    }

    public void setMAP_(String MAP_) {
        this.MAP_ = MAP_;
    }

    @Override
    public String toString() {
        return "\n JsxChild{" +
                "\n " + SYNTAX + '\'' +
                "\n '" + MAP_ + '\'' +
                '}';
    }
}
