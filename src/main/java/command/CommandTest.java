package command;

import command.item.Hat;
import command.item.Trousers;
import command.order.BuyOrder;
import command.order.ChangeOrder;

public class CommandTest {
    public static void main(String[] args) {
        Hat hat = new Hat("帽子", 100);
        Trousers trousers = new Trousers("牛仔裤", 50);
        Broker broker = new Broker();
        broker.addOrder(new BuyOrder(hat));
        broker.addOrder(new ChangeOrder(hat));
        broker.addOrder(new BuyOrder(trousers));
        broker.addOrder(new ChangeOrder(trousers));

        broker.executeOrder();
    }
}
