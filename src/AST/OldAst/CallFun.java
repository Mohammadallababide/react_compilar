package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class CallFun {
    String ID;
    List<String> SYNTAXList = new ArrayList<String>();

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
    @Override
    public String toString() {
        return "\n CallFun{" +
                "\n" + ID + '\'' +
                "\n " + SYNTAXList +
                "\n}";
    }


}
