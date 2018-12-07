package visitor.visitors;

import visitor.Clothes;
import visitor.Market;
import visitor.Visitor;

public class NormalVisitor implements Visitor {

    private double price;

    private double discount;

    private Market market;

    public NormalVisitor(double discount){
        this.discount = discount;
        market = new Market();
    }

    @Override
    public void buy(Clothes clothes) {
        //setPrice(getPrice()+clothes.getPrice());
        market.addGoods(clothes);
    }

    @Override
    public void showBill() {
        market.accout(this);
    }

    @Override
    public double getDiscount() {
        return discount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


}
