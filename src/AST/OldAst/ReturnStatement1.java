package AST.OldAst;

public class ReturnStatement1 {
    String RETURN;
    OnClick onClick;
    MapMethod mapMethod;
    JsxElement jsxElement;

    public String getRETURN() {
        return RETURN;
    }

    public void setRETURN(String RETURN) {
        this.RETURN = RETURN;
    }

    public OnClick getOnClick() {
        return onClick;
    }

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    public MapMethod getMapMethod() {
        return mapMethod;
    }

    public void setMapMethod(MapMethod mapMethod) {
        this.mapMethod = mapMethod;
    }

    public JsxElement getJsxElement() {
        return jsxElement;
    }

    public void setJsxElement(JsxElement jsxElement) {
        this.jsxElement = jsxElement;
    }

    @Override
    public String toString() {
        return "\n ReturnStatement1{" +
                "\n" + RETURN + '\'' +
                "\n" + onClick +
                "\n" + mapMethod +
                "\n" + jsxElement +
                "\n}";
    }

}
