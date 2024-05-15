package AST.instruction;

import AST.instruction.Returning.Exiting_Loop;

import java.util.ArrayList;
import java.util.List;

public class FunctionalIns extends Instruction {

    public FunctionalIns() {
        this.instructions = instructions = new ArrayList<>();
    }

    public List<Instruction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Instruction> instructions) {
        this.instructions = instructions;
    }
    public void addinstruction (Instruction instructions)
    {
        this.instructions.add(instructions);
    }
    public Instruction check_it(int i)
    {
        return instructions.get(i);
    }

    List<Instruction> instructions;
    Exiting_Loop loop;

    public Exiting_Loop getLoop() {
        return loop;
    }

    public void setLoop(Exiting_Loop loop) {
        this.loop = loop;
    }




}
