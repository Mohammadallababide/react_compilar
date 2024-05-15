package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class JsxOpenTag {
    List<String> ID=new ArrayList<String>();
    List<JsxChild> jsxChild=new ArrayList<JsxChild>();

    public List<String> getID() {
        return ID;
    }

    public void setID(List<String> ID) {
        this.ID = ID;
    }

    public List<JsxChild> getJsxChild() {
        return jsxChild;
    }

    public void setJsxChild(List<JsxChild> jsxChild) {
        this.jsxChild = jsxChild;
    }

    @Override
    public String toString() {
        return "\n JsxOpenTag{" +
                "\n " + ID +
                "\n " + jsxChild +
                "\n }";
    }
}
