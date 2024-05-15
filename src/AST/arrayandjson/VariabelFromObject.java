package AST.arrayandjson;

public class VariabelFromObject {
   String name ;
    JsonForm json = new JsonForm();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJson(JsonForm json) {
        this.json = json;
    }

    public JsonForm getJson() {
        return json;
    }
}
