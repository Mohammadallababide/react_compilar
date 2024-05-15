package AST.OldAst;

public class UseRef {
    String USEREF_;

    public String getUSEREF_() {
        return USEREF_;
    }

    public void setUSEREF_(String USEREF_) {
        this.USEREF_ = USEREF_;
    }

    @Override
    public String toString() {
        return "\n UseRef{" +
                "\n " + USEREF_ + '\'' +
                "\n}";
    }
}
