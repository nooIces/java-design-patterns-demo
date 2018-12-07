package visitor.clothesEntity;

import visitor.Clothes;
import visitor.Visitor;

public class Hat extends Clothes {

    public Hat(Enum size, Enum color, double price){
        super("Hat", size, color, price);
    }

    @Override
    public void sell(Visitor visitor) {
        visitor.buy(this);
    }
}
