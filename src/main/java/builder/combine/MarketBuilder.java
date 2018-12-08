package builder.combine;

import builder.item.BlackOldTrousers;
import builder.item.BlueNewTrousers;
import builder.item.PinkNewTrousers;
import builder.item.WhiteOldTrousers;

public class MarketBuilder {

    public Market twoOldCombine(){
        Market market = new Market();
        market.addGoods(new WhiteOldTrousers());
        market.addGoods(new BlackOldTrousers());
        return market;
    }

    public Market twoNewCombine(){
        Market market = new Market();
        market.addGoods(new BlueNewTrousers());
        market.addGoods(new PinkNewTrousers());
        return market;
    }
}
