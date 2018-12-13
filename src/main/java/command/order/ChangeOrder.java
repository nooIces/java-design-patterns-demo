package command.order;

import command.item.Clothes;

public class ChangeOrder extends Order {


    public ChangeOrder(Clothes clothes) {
        super(clothes);
    }

    @Override
    public void execute() {
        clothes.change();
    }
}
