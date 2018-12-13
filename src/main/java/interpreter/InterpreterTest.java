package interpreter;

import java.util.Stack;

public class InterpreterTest {
    public static void main(String[] args) {
        String expression = "4 3 1 - 2 * +";
        String[] arr = expression.split(" ");

        Stack<Expression> stack = new Stack<>();

        for(String s : arr){
            if(isSign(s)){
                Expression right = stack.pop();
                Expression left = stack.pop();

                Expression operate = null;
                switch (s){
                    case "+":
                        operate = new PlusExpression(left, right);
                        break;
                    case "-":
                        operate = new MinusExpression(left, right);
                        break;
                    case "*":
                        operate = new MultiExpression(left, right);
                        break;
                    default:
                        operate = new PlusExpression(left, right);
                }
                stack.push(operate);
                continue;
            }
            stack.push(new NumberExpression(s));
        }

        System.out.println(stack.pop().interpret());
    }

    private static boolean isSign(String s){
        return s.equals("+") || s.equals("-") || s.equals("*");
    }
}
