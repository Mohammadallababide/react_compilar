package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class Attributes {
    List<Attribute> attributelist=new ArrayList<Attribute>();

    public List<Attribute> getAttributelist() {
        return attributelist;
    }

    public void setAttributelist(List<Attribute> attributelist) {
        this.attributelist = attributelist;
    }

    @Override
    public String toString() {
        return "\n Attributes{" +
                "\n " + attributelist +
                "\n}";
    }
}
