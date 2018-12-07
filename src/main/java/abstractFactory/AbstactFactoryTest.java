package abstractFactory;

public class AbstactFactoryTest {
    public static void main(String[] args) {
        System.out.println(FactoryProducer.getFactory("MODERN").getModernClothes("TROUSERS").getClothes());
    }
}
