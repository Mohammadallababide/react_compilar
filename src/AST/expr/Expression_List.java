package AST.expr;


import AST.Common.Node;
import AST.instruction.ShortcutStatements;

public class Expression_List extends Node {
    InternalExpressionValue intral_expression_value;
    String Op;
    Expression_List left_expr ;
    Expression_List right_expr ;
    OnLineIfExpr one_line_if_expression;
    Bracket_Expression bracket_expression ;
    ShortcutStatements shortcut_statments ;
    Boolean isBooleanExp ;

    public Boolean getBooleanExp() {
        return isBooleanExp;
    }

    public void setBooleanExp(Boolean booleanExp) {
        isBooleanExp = booleanExp;
    }

    public ShortcutStatements getShortcut_statments() {
        return shortcut_statments;
    }

    public void setShortcut_statments(ShortcutStatements shortcut_statments) {
        this.shortcut_statments = shortcut_statments;
    }

    public InternalExpressionValue getIntral_expression_value() {
        return intral_expression_value;
    }

    public void setIntral_expression_value(InternalExpressionValue intral_expression_value) {
        this.intral_expression_value = intral_expression_value;
    }

    public Bracket_Expression getBracket_expression() {
        return bracket_expression;
    }

    public void setBracket_expression(Bracket_Expression bracket_expression) {
        this.bracket_expression = bracket_expression;
    }


    public OnLineIfExpr getOne_line_if_expression() {
        return one_line_if_expression;
    }

    public void setOne_line_if_expression(OnLineIfExpr one_line_if_expression) {
        this.one_line_if_expression = one_line_if_expression;
    }


    public String getOp() {
        return Op;
    }

    public void setOp(String op) {
        Op = op;
    }

    public Expression_List getLeft_expr() {
        return left_expr;
    }

    public void setLeft_expr(Expression_List left_expr) {
        this.left_expr = left_expr;
    }

    public Expression_List getRight_expr() {
        return right_expr;
    }

    public void setRight_expr(Expression_List right_expr) {
        this.right_expr = right_expr;
    }


}
