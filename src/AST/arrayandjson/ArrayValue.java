package AST.arrayandjson;

import AST.Common.Node;
import AST.creating.Array.ArrayOfArrayForm;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;

public class ArrayValue extends Node {
    ArrayList<Token> ID = new  ArrayList<Token>();
  ArrayList<JsonStatement> statment = new ArrayList<JsonStatement>();
 ArrayOfArrayForm arrayfor ;
    public void setID(ArrayList<Token> ID) {
        this.ID = ID;
    }

    public ArrayList<Token> getID() {
        return ID;
    }
     public  void addIden ( Token TT){
        ID.add(TT);
    }

    public void setStatment(ArrayList<JsonStatement> statment) {
        this.statment = statment;
    }

    public ArrayList<JsonStatement> getStatment() {
        return statment;
    }

    public void setArrayfor(ArrayOfArrayForm arrayfor) {
        this.arrayfor = arrayfor;
    }

    public ArrayOfArrayForm getArrayfor() {
        return arrayfor;
    }

}
