package visitor;

import java.util.ArrayList;
import java.util.List;

public class Market {

    private List<Clothes> market;

    public Market(){
        market = new ArrayList<>();
    }


    public List<Clothes> getMarket() {
        return market;
    }

    public void setMarket(List<Clothes> market) {
        this.market = market;
    }

    public void accout(Visitor visitor){
        double price = 0;
        System.out.println("购物清单:");
        for(Clothes clothes : market){
            double cur = clothes.getPrice()*visitor.getDiscount();
            System.out.println(clothes.getName() + " " + cur + "元!");
            price += cur;
        }
        System.out.println("一共花费了" + price + "元!");
    }

    public void addGoods(Clothes clothes){
        market.add(clothes);
    }
}
