package chain;

public class Sclothes extends Clothes {
    public Sclothes(Size size) {
        super(size);
    }

    @Override
    public void findClothes() {
        System.out.println("find a S Size clothes");
    }
}
