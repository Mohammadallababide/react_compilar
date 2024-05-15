package AST.OldAst;

public class JsxChild2 {
   JsxChild jsxChild;
   JsxElement jsxElement;
     FunctionalCall functionCall;

    public JsxChild getJsxChild() {
        return jsxChild;
    }

    public void setJsxChild(JsxChild jsxChild) {
        this.jsxChild = jsxChild;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    public FunctionalCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionalCall functionCall) {
        this.functionCall = functionCall;
    }

    @Override
    public String toString() {
        return "\n JsxChild2{" +
                "\n " + jsxChild +
                "\n " + jsxElement +
                "\n " + functionCall +
                "\n}";
    }
}
