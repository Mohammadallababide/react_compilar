package AST.ImportAst;

import AST.App.App;

import java.util.ArrayList;
import java.util.List;


public class ImportR extends App {
    List<String> reactLibs  = new ArrayList<>();
    String destinationName;

    public List<String> getReactLibs() {
        return reactLibs;
    }

    public void setReactLibs(List<String> reactLibs) {
        this.reactLibs = reactLibs;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }
}
