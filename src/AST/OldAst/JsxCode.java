package AST.OldAst;

public class  JsxCode {
    JsxOpenTag jsxOpenTag;
   JsxElement jsxElement ;
   Syntax syntax;

    public JsxOpenTag getJsxOpenTag() {
        return jsxOpenTag;
    }

    public void setJsxOpenTag(JsxOpenTag jsxOpenTag) {
        this.jsxOpenTag = jsxOpenTag;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public Syntax getSyntax() {
        return syntax;
    }

    public void setSyntax(Syntax syntax) {
        this.syntax = syntax;
    }

    @Override
    public String toString() {
        return "JsxCode{" +
                "jsxOpenTag=" + jsxOpenTag +
                ", jsxElement=" + jsxElement +
                ", syntax=" + syntax +
                '}';
    }
}
