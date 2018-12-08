package builder;

import builder.combine.Market;
import builder.combine.MarketBuilder;

public class BuilderTest {
    public static void main(String[] args) {
        MarketBuilder builder = new MarketBuilder();

        Market A = builder.twoNewCombine();
        A.showBill();

        Market B = builder.twoOldCombine();
        B.showBill();

    }
}
