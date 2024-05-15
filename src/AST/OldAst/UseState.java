package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class UseState {
    String USESTATE_;
    List<String> SYNTAXList=new ArrayList<String>();

    public String getUSESTATE_() {
        return USESTATE_;
    }

    public void setUSESTATE_(String USESTATE_) {
        this.USESTATE_ = USESTATE_;
    }

    public List<String> getSYNTAXList() {
        return SYNTAXList;
    }

    public void setSYNTAXList(List<String> SYNTAXList) {
        this.SYNTAXList = SYNTAXList;
    }

    @Override
    public String toString() {
        return "\n UseState{" +
                "\n" + USESTATE_ + '\'' +
                "\n" + SYNTAXList +
                "\n}";
    }

}
