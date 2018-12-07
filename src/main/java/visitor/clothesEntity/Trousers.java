package visitor.clothesEntity;

import visitor.Clothes;
import visitor.Visitor;

public class Trousers extends Clothes {

    public Trousers(Enum size, Enum color, double price){
        super("trousers",size, color, price);
    }

    @Override
    public void sell(Visitor visitor) {
        visitor.buy(this);
    }
}
