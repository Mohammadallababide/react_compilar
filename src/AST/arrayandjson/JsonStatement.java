package AST.arrayandjson;

import java.util.ArrayList;
import java.util.List;

public class JsonStatement extends JsonForm {
    private List<InsideJsonStatement> json_statmen = new ArrayList<InsideJsonStatement>();

   // public void setJson_statmen(List<inside_json_statmnet> json_statmen) {
     //   this.json_statmen = json_statmen;
    //}

    //public List<inside_json_statmnet> getJson_statmen() {
      //  return json_statmen;
    //}
    public void additemtojsonstatment (InsideJsonStatement j ){
        this.json_statmen.add(j);

    }

}
