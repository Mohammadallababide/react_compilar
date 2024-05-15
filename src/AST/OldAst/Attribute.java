package AST.OldAst;

public class Attribute {
    String ID,COLON;
    AttributeValue attributeValue;


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCOLON() {
        return COLON;
    }

    public void setCOLON(String COLON) {
        this.COLON = COLON;
    }

    public AttributeValue getAttributeValue() {
        return attributeValue;
    }

    public void setAttributeValue(AttributeValue attributeValue) {
        this.attributeValue = attributeValue;
    }

    @Override
    public String toString() {
        return "\n Attribute{" +
                "\n" + ID + '\'' +
                "\n" + COLON + '\'' +
                "\n" + attributeValue +
                "\n}";
    }


}
