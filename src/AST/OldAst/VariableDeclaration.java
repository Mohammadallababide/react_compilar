package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class VariableDeclaration {
    String VAR,CONST,LET;
    List<String> SYNTAXList = new ArrayList<String>();
    List<String> arrayyList=new ArrayList<String>();
    Function2 function2;
    UseRef useRef;
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

    public List<String> getSYNTAXList() {
        return SYNTAXList;
    }

    public void setSYNTAXList(List<String> SYNTAXList) {
        this.SYNTAXList = SYNTAXList;
    }

    public List<String> getArrayyList() {
        return arrayyList;
    }

    public void setArrayyList(List<String> arrayyList) {
        this.arrayyList = arrayyList;
    }

    public Function2 getFunction2() {
        return function2;
    }

    public void setFunction2(Function2 function2) {
        this.function2 = function2;
    }

    public UseRef getUseRef() {
        return useRef;
    }

    public void setUseRef(UseRef useRef) {
        this.useRef = useRef;
    }

    public UseState getUseState() {
        return useState;
    }

    public void setUseState(UseState useState) {
        this.useState = useState;
    }
    @Override
    public String toString() {
        return "\n VariableDeclaration{" +
                "\n" + VAR + '\'' +
                "\n" + CONST + '\'' +
                "\n" + LET + '\'' +
                "\n" + SYNTAXList +
                "\n" + arrayyList +
                "\n" + function2 +
                "\n" + useRef +
                "\n" + useState +
               "\n}";
    }


}
