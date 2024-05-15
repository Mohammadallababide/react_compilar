package AST.OldAst;

import java.util.ArrayList;
import java.util.List;

public class Arrayy {
    List<Par> parlist=new ArrayList<Par>();

    public List<Par> getParlist() {
        return parlist;
    }

    public void setParlist(List<Par> parlist) {
        this.parlist = parlist;
    }

    @Override
    public String toString() {
        return "Arrayy{" +
                "parlist=" + parlist +
                '}';
    }
}
