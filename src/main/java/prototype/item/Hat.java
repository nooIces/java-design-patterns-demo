package prototype.item;

public class Hat extends Clothes {

    public Hat(int id){
        super(id);
        this.name = "hat";
    }

    @Override
    void wear() {
        System.out.println("wear a hat!");
    }
}
