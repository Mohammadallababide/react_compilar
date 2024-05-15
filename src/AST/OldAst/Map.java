package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class Map {
    List<String> SYNTAXList=new ArrayList<String>();
    List<AttributeValue> attributeValueList=new ArrayList<AttributeValue>();
    List<Arrayy> arrayyList=new ArrayList<Arrayy>();

    public List<String> getSYNTAXList() {
        return SYNTAXList;
    }
    public void setSYNTAXList(List<String> SYNTAXList) {
        this.SYNTAXList = SYNTAXList;}
    public List<AttributeValue> getAttributeValueList() {
        return attributeValueList;
    }

    public void setAttributeValueList(List<AttributeValue> attributeValueList) {
        this.attributeValueList = attributeValueList;}
    public List<Arrayy> getArrayyList() {
        return arrayyList;
    }
    public void setArrayyList(List<Arrayy> arrayyList) {
        this.arrayyList = arrayyList;
    }
    @Override
    public String toString() {
        return "\n Map{" +
                "\n" + SYNTAXList +
                "\n" + attributeValueList +
                "\n" + arrayyList +
                "\n}";
    }




}
