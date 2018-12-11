package facade;

import facade.item.Chocolate;
import facade.item.Computer;
import facade.item.TV;

public class Customer {

    public void buyAll(){
        System.out.println("ShoppingList:");
        new TV().sell();
        new Computer().sell();
        new Chocolate().sell();
    }
}
