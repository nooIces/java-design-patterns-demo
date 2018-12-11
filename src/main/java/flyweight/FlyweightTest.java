package flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        Hat a = ClothesFactory.getHat(ClothesFactory.Color.BLUE);
        Hat b = ClothesFactory.getHat(ClothesFactory.Color.BLUE);
        a.setSize(ClothesFactory.Size.L);
        System.out.println(a.getSize());
        System.out.println(b.getSize());
    }
}
