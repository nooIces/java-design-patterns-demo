package prototype;

import prototype.item.Clothes;
import prototype.item.Hat;
import prototype.item.Shirt;

public class PrototypeTest {
    public static void main(String[] args) {
        Clothes A = new Hat(1);
        Clothes B = new Shirt(2);
        ClothesCache cache = new ClothesCache();
        cache.addCache(A);
        cache.addCache(B);

        Clothes clothesA = cache.get(1);
        System.out.println(clothesA.getId() + " " + clothesA.getName());
        System.out.println("是否相同:" + (A == clothesA));

        Clothes clothesB = cache.get(2);
        System.out.println(clothesB.getId() + " " + clothesB.getName());
        System.out.println("是否相同:" + (B == clothesB));
    }
}
