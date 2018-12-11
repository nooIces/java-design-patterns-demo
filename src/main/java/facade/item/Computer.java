package facade.item;

public class Computer implements ShoppingMall {

    @Override
    public void sell() {
        System.out.println("sell a computer!");
    }
}
