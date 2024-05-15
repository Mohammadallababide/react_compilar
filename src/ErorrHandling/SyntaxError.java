package ErorrHandling;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import symbolTable.SymbolTable;

import java.io.IOException;

public class SyntaxError extends BaseErrorListener {
    SymbolTable symbolTable = SymbolTable.getInstance();
    public static SyntaxError INSTANCE = new SyntaxError();
    public boolean hasError = false;
    public static boolean REPORT_SYNTAX_ERRORS = true;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                            int line, int charPositionInLine,
                            String msg, RecognitionException e) {

        if (!REPORT_SYNTAX_ERRORS) {
            return;
        }

        String sourceName = recognizer.getInputStream().getSourceName();
        if (!sourceName.isEmpty()) {

            symbolTable.hasSyntaxError = true;
            // sourceName = String.format("%s:%d:%d: ", sourceName, line, charPositionInLine);
        }
        try {
            symbolTable.write("Error in line " + line + ":" + charPositionInLine + " " + msg);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

}
