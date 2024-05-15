package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class Function1 {
    String FUNCTION,ID;
    List<String> SYNTAXList = new ArrayList<String>();
    FunctionBody functionBody;

    public String getFUNCTION() {
        return FUNCTION;
    }

    public void setFUNCTION(String FUNCTION) {
        this.FUNCTION = FUNCTION;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<String> getSYNTAXList() {
        return SYNTAXList;
    }

    public void setSYNTAXList(List<String> SYNTAXList) {
        this.SYNTAXList = SYNTAXList;
    }

    public FunctionBody getFunctionBody() {
        return functionBody;
    }

    public void setFunctionBody(FunctionBody functionBody) {
        this.functionBody = functionBody;
    }
    @Override
    public String toString() {
        return "\n Function1{" +
                "\n " + FUNCTION + '\'' +
                "\n" + ID + '\'' +
                "\n" + SYNTAXList +
                "\n" + functionBody +
                "\n}";
    }

}
