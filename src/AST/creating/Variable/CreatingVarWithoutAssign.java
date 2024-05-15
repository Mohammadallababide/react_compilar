package AST.creating.Variable;


import AST.Common.UserRandomName;

public class CreatingVarWithoutAssign extends CreateVariable {
   private UserRandomName use = new UserRandomName();

    public void setUse(UserRandomName use) {
        this.use = use;
    }

    public UserRandomName getUse() {
        return use;
    }


}
