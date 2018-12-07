package visitor.clothesEntity;

import visitor.Clothes;
import visitor.Visitor;

public class Shoes extends Clothes {

    public Shoes(Enum size, Enum color, double price){
        super("shoes", size, color, price);
    }

    @Override
    public void sell(Visitor visitor) {
        visitor.buy(this);
    }
}
