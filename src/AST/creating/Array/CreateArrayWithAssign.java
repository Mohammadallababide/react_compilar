package AST.creating.Array;

import AST.arrayandjson.ArrayLeftSide;
import AST.arrayandjson.ArrayFormWithoutSize;
import AST.creating.CreateWithAssign;

public class CreateArrayWithAssign extends CreateWithAssign {
    ArrayFormWithoutSize index ;
    ArrayLeftSide side ;

    public void setSide(ArrayLeftSide side) {
        this.side = side;
    }

    public ArrayLeftSide getSide() {
        return side;
    }

    public void setIndex(ArrayFormWithoutSize index) {
        this.index = index;

    }

    public ArrayFormWithoutSize getIndex() {
        return index;
    }

}

