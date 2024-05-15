package AST.creating;

import AST.instruction.NonFunctionalIns;

public class GeneralCreating extends NonFunctionalIns {
    CreateWithoutAssign wihtoutassig  ;

    CreateWithAssign withassign ;
    String name ;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setWihtoutassig(CreateWithoutAssign wihtoutassig) {
        this.wihtoutassig = wihtoutassig;
    }

    public CreateWithoutAssign getWihtoutassig() {
        return wihtoutassig;
    }

    public void setWithassign(CreateWithAssign withassign) {
        this.withassign = withassign;
    }

    public CreateWithAssign getWithassign() {
        return withassign;
    }
    
}

