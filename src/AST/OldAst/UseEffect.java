package AST.OldAst;

public class UseEffect {
    String USEEFFECT_;
    Function2 function2;
    Arrayy arrayy;

    public String getUSEEFFECT_() {
        return USEEFFECT_;
    }

    public void setUSEEFFECT_(String USEEFFECT_) {
        this.USEEFFECT_ = USEEFFECT_;
    }

    public Function2 getFunction2() {
        return function2;
    }

    public void setFunction2(Function2 function2) {
        this.function2 = function2;
    }

    public Arrayy getArrayy() {
        return arrayy;
    }

    public void setArrayy(Arrayy arrayy) {
        this.arrayy = arrayy;
    }

    @Override
    public String toString() {
        return "UseEffect{" +
                "USEEFFECT_='" + USEEFFECT_ + '\'' +
                ", function2=" + function2 +
                ", arrayy=" + arrayy +
                '}';
    }



}
