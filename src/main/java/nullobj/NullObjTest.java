package nullobj;

public class NullObjTest {
    public static void main(String[] args) {
        AbstractClothes a = ClothesFactory.getClothes("Hat");
        AbstractClothes b = ClothesFactory.getClothes("Shirt");
        AbstractClothes c = ClothesFactory.getClothes("sweater");

        System.out.println(a.getName());
        System.out.println(b.getName());
        System.out.println(c.getName());
    }
}
