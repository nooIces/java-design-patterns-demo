package flyweight;

public class Hat implements Clothes {

    private ClothesFactory.Color color;

    private ClothesFactory.Size size;

    public Hat(ClothesFactory.Color color){
        this.color = color;
    }

    public ClothesFactory.Size getSize() {
        return size;
    }

    public void setSize(ClothesFactory.Size size) {
        this.size = size;
    }

    @Override
    public void wear() {
        System.out.println("wear a " + color + " " + getSize() + " hat!");
    }
}
