package interpreter;

public class MinusExpression extends Expression{

    private Expression left;

    private Expression right;

    public MinusExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret()-right.interpret();
    }
}
