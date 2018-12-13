package iterator;


public class IteratorTest {

    public static void main(String[] args) {
        ClothesContainer container = new ClothesContainer();
        Iterator it = container.iterator();
        System.out.println("列表有:");
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
