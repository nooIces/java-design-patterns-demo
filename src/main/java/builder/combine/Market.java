package builder.combine;

import builder.item.Clothes;

import java.util.ArrayList;
import java.util.List;

public class Market {

    private List<Clothes> list;

    public Market(){
        list = new ArrayList<>();
    }

    public void addGoods(Clothes clothes){
        list.add(clothes);
    }

    public double showBill(){
        double price = 0;
        System.out.println("详细账单:");
        for(Clothes clothes : list){
            price += clothes.price();
            System.out.println(clothes.getName() + ":" + clothes.packing().kind() + "  " + clothes.price() + "元");
        }
        System.out.println("一共消费了"+price+"元");
        return price;
    }
}
