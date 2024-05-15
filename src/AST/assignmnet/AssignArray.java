package AST.assignmnet;


import AST.Common.Node;
import AST.arrayandjson.ArrayWithOperator;
import AST.expr.Expression;

import java.util.ArrayList;
import java.util.List;

public class AssignArray extends Node {


    List<ArrayWithOperator> arrayWithOperatorList;

    Expression expression ;


    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }



    public AssignArray(){
        arrayWithOperatorList = new ArrayList<>();
    }


    public List<ArrayWithOperator> getArrayWithOperatorList() {
        return arrayWithOperatorList;
    }

    public void setArrayWithOperatorList(List<ArrayWithOperator> arrayWithOperatorList) {
        this.arrayWithOperatorList = arrayWithOperatorList;
    }

}
