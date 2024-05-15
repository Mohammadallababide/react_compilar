package AST.instruction.Print_rule;


import AST.instruction.NonFunctionalIns;

import java.util.ArrayList;
import java.util.List;

public class PrintStatement extends NonFunctionalIns {

    public PrintStatement(){
        prints = new ArrayList<>();
    }

    public List<InsidePrintStatement> getPrints() {
        return prints;
    }

    public void setPrints(List<InsidePrintStatement> prints) {
        this.prints = prints;
    }

    List<InsidePrintStatement> prints;

}
