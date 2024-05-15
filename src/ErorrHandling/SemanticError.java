package ErorrHandling;

import symbolTable.SymbolTable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SemanticError {
    SymbolTable symbolTable = SymbolTable.getInstance();
    public ArrayList<String> Errors = new ArrayList<>();

    public SemanticError() {

    }

    public void checkErrors() throws IOException {
        if (!symbolTable.hasSyntaxError) {
        }
        if (!Errors.isEmpty()) {
            symbolTable.hasSemanticError = true;
        }
        for (int i = 0; i < Errors.size(); i++) {
            FileWriter test = new FileWriter("output//SemanticError.txt");
            test.write(Errors.get(i));
            test.close();

        }
    }

}
