package visitor;

import visitor.clothesEnum.Color;
import visitor.clothesEnum.Size;

public abstract class Clothes {

    protected String name;

    protected Enum size;

    protected Enum color;

    protected double price;

    public Clothes(){
        this.size = Size.M;
        this.color = Color.WHITE;
        this.price = 100.0;
    }

    public Clothes(String name, Enum size, Enum color, double price){
        this.name = name;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    abstract public void sell(Visitor visitor);

    public Enum getSize() {
        return size;
    }

    public void setSize(Enum size) {
        this.size = size;
    }

    public Enum getColor() {
        return color;
    }

    public void setColor(Enum color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
