package interpreter;

public class NumberExpression extends Expression {

    private int number;

    public NumberExpression(int n){
        number = n;
    }

    public NumberExpression(String s){
        number = Integer.parseInt(s);
    }

    @Override
    public int interpret() {
        return number;
    }
}
