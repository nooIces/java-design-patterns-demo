package command;

import command.order.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<Order> orderList;

    public Broker(){
        orderList = new ArrayList<>();
    }

    public void addOrder(Order order){
        orderList.add(order);
    }

    public void executeOrder(){
        for(Order order : orderList){
            order.execute();
        }
    }
}
