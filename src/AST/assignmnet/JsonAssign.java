package AST.assignmnet;


import AST.arrayandjson.JsonForm;
import AST.arrayandjson.JsonStatement;
import AST.creating.Json.CreateJsonWithAssign;

public class JsonAssign extends CreateJsonWithAssign {
    JsonStatement json = new JsonStatement(); // i can go to json form
    JsonForm form = new JsonForm();

    public void setJson(JsonStatement json) {
        this.json = json;
    }

    public JsonStatement getJson() {
        return json;
    }

    public void setForm(JsonForm form) {
        this.form = form;
    }

    public JsonForm getForm() {
        return form;
    }
}
