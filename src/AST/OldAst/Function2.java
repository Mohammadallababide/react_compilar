package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class Function2 {
    FunctionBody functionBody;
    List<String> SYNTAXList = new ArrayList<String>();

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
        return "\n Function2{" +
                "\n" + SYNTAXList +
                "\n" + functionBody +
                "\n}";
    }


}
