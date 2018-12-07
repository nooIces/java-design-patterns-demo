package visitor.visitors;

import visitor.Clothes;
import visitor.Market;
import visitor.Visitor;

public class MemberVisitor implements Visitor {

    private double price;

    private double discount;

    private Market market;

    public MemberVisitor(double discount){
        this.discount = discount;
        this.market = new Market();
    }

    @Override
    public void buy(Clothes clothes) {
        //setPrice(getPrice()+clothes.getPrice()*0.5);
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
