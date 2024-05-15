package AST.creating.Json;
import AST.arrayandjson.JsonForm;
import AST.creating.CreateWithoutAssign;

public class CreateJsonWithoutAssign extends CreateWithoutAssign {
    JsonForm form = new JsonForm();

    public void setForm(JsonForm form) {
        this.form = form;
    }

    public JsonForm getForm() {
        return form;
    }
}
