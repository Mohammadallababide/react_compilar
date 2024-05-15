package AST.instruction.function;
import java.util.ArrayList;
import java.util.List;

public class SubFunctionBody {

    public List<Object> getInstructions() {
        return nodes;
    }

    public void setInstructions(List<Object> instructions) {
        this.nodes = instructions;
    }
    public void addNode(Object Node){
        this.nodes.add(Node);
    }


    List<Object> nodes = new ArrayList<Object>();



}
