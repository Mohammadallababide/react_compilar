package AST.creating.Array;


import AST.arrayandjson.ArrayLeftSide;

import java.util.ArrayList;

public class ArrayOfArrayForm {
    ArrayList<ArrayLeftSide> side = new ArrayList<ArrayLeftSide>();

    public void setSide(ArrayList<ArrayLeftSide> side) {
        this.side = side;
    }

    public ArrayList<ArrayLeftSide> getSide() {
        return side;
    }
    public void adding ( ArrayLeftSide left ){
        side.add(left);
    }



}
