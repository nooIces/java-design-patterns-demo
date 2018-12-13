package command.item;

public abstract class Clothes {

    protected String name;

    protected double price;

    public Clothes(String name, double price){
        this.name = name;
        this.price = price;
    }

    public abstract void change();

    public abstract void buy();
}
