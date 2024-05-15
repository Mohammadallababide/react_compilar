package AST.OldAst;

public class Array {
    String VAR , CONST , LET;
    Arrayy arrayy;
    UseState useState;

    public String getVAR() {
        return VAR;
    }
    public void setVAR(String VAR) {
        this.VAR = VAR;
    }
    public String getCONST() {
        return CONST;
    }
    public void setCONST(String CONST) {
        this.CONST = CONST;
    }
    public String getLET() {
        return LET;
    }
    public void setLET(String LET) {
        this.LET = LET;
    }
    public Arrayy getArrayy() {
        return arrayy;
    }
    public void setArrayy(Arrayy arrayy) {
        this.arrayy = arrayy;
    }
    public UseState getUseState() {
        return useState;
    }
    public void setUseState(UseState useState) {
        this.useState = useState;
    }
    @Override
    public String toString() {
        return "\n Arrayy{" +
                "\n " + VAR + '\'' +
                "\n" + CONST + '\'' +
                "\n " + LET + '\'' +
                "\n " + arrayy +
                "\n " + useState +
                "\n}";
    }
}
