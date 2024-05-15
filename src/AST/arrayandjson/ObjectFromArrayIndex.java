package AST.arrayandjson;

import java.util.ArrayList;
import java.util.List;

public class ObjectFromArrayIndex {   // arithmatic one also
    public ObjectFromArrayIndex(){
        this.arrayVariableList = new ArrayList<>();
    }
    public String getArrayName() {
        return arrayName;
    }

    public void setArrayName(String arrayName) {
        this.arrayName = arrayName;
    }

    public List<VariableArray> getArrayVariableList() {
        return arrayVariableList;
    }

    public void setArrayVariableList(List<VariableArray> arrayVariableList) {
        this.arrayVariableList = arrayVariableList;
    }

    String arrayName;
    List<VariableArray> arrayVariableList;

}
