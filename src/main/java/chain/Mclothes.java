package chain;

public class Mclothes extends Clothes {

    public Mclothes(Size size) {
        super(size);
    }

    @Override
    public void findClothes() {
        System.out.println("find a M Size clothes");
    }
}
