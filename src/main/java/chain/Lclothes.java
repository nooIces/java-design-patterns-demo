package chain;

public class Lclothes extends Clothes {
    
    public Lclothes(Size size) {
        super(size);
    }

    @Override
    public void findClothes() {
        System.out.println("find a L Size clothes");
    }
}
