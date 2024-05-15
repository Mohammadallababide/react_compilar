package AST.instruction;

public class ShortcutStatements extends NonFunctionalIns {

    private String shortcut_variable_name;

    private String oprator ;

    public String getShortcut_variable_name() {
        return shortcut_variable_name;
    }

    public void setShortcut_variable_name(String shortcut_variable_name) {
        this.shortcut_variable_name = shortcut_variable_name;
    }

    public String getOprator() {
        return oprator;
    }

    public void setOprator(String oprator) {
        this.oprator = oprator;
    }


}
