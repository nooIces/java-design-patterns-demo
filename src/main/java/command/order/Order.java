package command.order;

import command.item.Clothes;

public abstract class Order {

    protected Clothes clothes;

    public Order(Clothes clothes){
        this.clothes = clothes;
    }

    public abstract void execute();
}
