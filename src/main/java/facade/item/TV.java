package facade.item;

public class TV implements ShoppingMall {

    @Override
    public void sell() {
        System.out.println("sell a TV!");
    }
}
