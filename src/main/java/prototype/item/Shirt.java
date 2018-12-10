package prototype.item;

public class Shirt extends Clothes {

    public Shirt(int id){
        super(id);
        this.name = "shirt";
    }


    @Override
    void wear() {
        System.out.println("wear a shirt");
    }
}
