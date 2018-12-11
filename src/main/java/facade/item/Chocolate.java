package facade.item;

public class Chocolate implements ShoppingMall {

    @Override
    public void sell() {
        System.out.println("sell a chocolate!");
    }
}
