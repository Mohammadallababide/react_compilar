package AST.instruction.Returning;


import AST.arrayandjson.ObjectFromArrayIndex;
import AST.arrayandjson.VariabelFromObject;
import AST.assignmnet.AssignArray;
import AST.assignmnet.assign_variable;
import AST.assignmnet.JsonAssign;
import AST.expr.BooleanExpr;
import AST.expr.Expression;
import AST.expr.InternalExpressionValue;
import AST.instruction.CallFunction;
import org.antlr.v4.runtime.Token;

public class ReturnType {
    Expression expression;
    BooleanExpr booleanExpr;
    InternalExpressionValue internalExpressionValue;
    boolean isNull;

    public InternalExpressionValue getInternalExpressionValue() {
        return internalExpressionValue;
    }

    public void setInternalExpressionValue(InternalExpressionValue internalExpressionValue) {
        this.internalExpressionValue = internalExpressionValue;
    }

    public boolean isNull() {
        return isNull;
    }

    public void setNull(boolean aNull) {
        isNull = aNull;
    }

    public BooleanExpr getBooleanExpr() {
        return booleanExpr;
    }

    public void setBooleanExpr(BooleanExpr booleanExpr) {
        this.booleanExpr = booleanExpr;
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }


}
