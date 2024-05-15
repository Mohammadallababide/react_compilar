package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class FunctionalCall {

        String ID;
        List<JsxChild> jsxChildlist=new ArrayList<JsxChild>();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public List<JsxChild> getJsxChildlist() {
        return jsxChildlist;
    }

    public void setJsxChildlist(List<JsxChild> jsxChildlist) {
        this.jsxChildlist = jsxChildlist;
    }

    @Override
    public String toString() {
        return "\n FunctionalCall{" +
                "\n " + ID + '\'' +
                "\n " + jsxChildlist +
                "\n }";
    }
}
