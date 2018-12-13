package command.order;

import command.item.Clothes;

public class BuyOrder extends Order {

    public BuyOrder(Clothes clothes) {
        super(clothes);
    }

    @Override
    public void execute() {
        clothes.buy();
    }
}
