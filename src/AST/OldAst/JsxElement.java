package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class JsxElement {
    List<JsxChild2>jsxChild2List =new ArrayList<JsxChild2>();

    public List<JsxChild2> getJsxChild2List() {
        return jsxChild2List;
    }

    public void setJsxChild2List(List<JsxChild2> jsxChild2List) {
        this.jsxChild2List = jsxChild2List;
    }

    @Override
    public String toString() {
        return "JsxElement{" +
                "jsxChild2List=" + jsxChild2List +
                '}';
    }
}
