package AST.creating.Array;


import AST.arrayandjson.ArrayFormWithoutSize;
import AST.creating.CreateWithoutAssign;

public class CreateArrayWithoutAssign extends CreateWithoutAssign {
    ArrayFormWithoutSize wihtoutindex = new ArrayFormWithoutSize();

    public void setWihtoutindex(ArrayFormWithoutSize wihtoutindex) {
        this.wihtoutindex = wihtoutindex;
    }

    public ArrayFormWithoutSize getWihtoutindex() {
        return wihtoutindex;
    }
}
