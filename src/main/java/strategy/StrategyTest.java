package strategy;

public class StrategyTest {
    public static void main(String[] args) {
        Context contextA = new Context(new Add());
        Context contextB = new Context(new Multi());

        System.out.println(contextA.execute(3, 2));
        System.out.println(contextB.execute(3, 2));
    }
}
