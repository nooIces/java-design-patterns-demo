package decorator;

import decorator.base.American;
import decorator.base.Chinese;
import decorator.base.People;

public class DecoratorTest {
    public static void main(String[] args) {
        People cn = new Chinese();
        cn = new WearClothes(cn);
        cn = new WearTrousers(cn);
        cn.wear();

        System.out.println("-----");

        People na = new American();
        na = new WearClothes(na);
        na.wear();
    }
}
