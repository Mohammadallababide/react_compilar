package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class MapMethod {
    String MAP_;
    List<Syntax> SYNTAXlist=new ArrayList<Syntax>();
    JsxElement jsxElement;

    public String getMAP_() {
        return MAP_;
    }

    public void setMAP_(String MAP_) {
        this.MAP_ = MAP_;
    }

    public List<Syntax> getSYNTAXlist() {
        return SYNTAXlist;
    }

    public void setSYNTAXlist(List<Syntax> SYNTAXlist) {
        this.SYNTAXlist = SYNTAXlist;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    @Override
    public String toString() {
        return "\n MapMethod{" +
                "\n " + MAP_ + '\'' +
                "\n " + SYNTAXlist +
                "\n " + jsxElement +
                "\n }";
    }
}
