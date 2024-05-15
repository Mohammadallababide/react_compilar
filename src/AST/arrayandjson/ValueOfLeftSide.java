package AST.arrayandjson;

import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class ValueOfLeftSide extends ArrayLeftSide {
    ArrayList<Token > ID ;

    public void setID(ArrayList<Token> ID) {
        this.ID = ID;
    }

    public ArrayList<Token> getID() {
        return ID;
    }

}
