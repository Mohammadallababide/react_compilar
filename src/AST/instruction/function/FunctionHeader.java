package AST.instruction.function;


import AST.instruction.function.ParametesandArgs.Args;
import AST.creating.CreateWithAssign;

import java.util.ArrayList;
import java.util.List;

public class FunctionHeader extends FunctionDeclaration {

    private List<Args> arg = new ArrayList<Args>();
    List<CreateWithAssign> createWithAssignList = new ArrayList<>();
    String name ;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setArg(List<Args> arg) {
        this.arg = arg;
    }

    public List<Args> getArg() {
        return arg;
    }
    public void  pri (){
        for (int i=0;i<arg.size();i++){
            // System.out.println(arg.get(i).getCreating().getWihtoutassig().getVar().getN());
            if(arg.get(i).getCreating().getWihtoutassig().getArray()!=null)
                System.out.println("array variable  without assign "+arg.get(i).getCreating().getWihtoutassig().getArray().getWihtoutindex().getName());
            else if (arg.get(i).getCreating().getWihtoutassig().getVar().getN()!=null)
                System.out.println("variable without assign  "+arg.get(i).getCreating().getWihtoutassig().getVar().getN());
            else if (arg.get(i).getCreating().getWihtoutassig().getJson().getForm().toString()!=null)
                System.out.println("json without assign  "+arg.get(i).getCreating().getWihtoutassig().getVar().getN());
        }
        for (int j = 0; j< createWithAssignList.size(); j++)
        {
           if(createWithAssignList.get(j).getVar_wiht_assign()!=null)
           {
               System.out.println("variable with assign "+ createWithAssignList.get(j).getVar_wiht_assign());
           }
        }

    }
    public void add_item_to_arglist(Args a ){
        this.arg.add(a);

    }
    public void add_item_to_with_assign_var_list(CreateWithAssign w ){
        this.createWithAssignList.add(w);

    }
}
