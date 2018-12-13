package interpreter;

public class MultiExpression extends Expression {

    private Expression left;

    private Expression right;

    public MultiExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret() {
        return left.interpret()*right.interpret();
    }
}
