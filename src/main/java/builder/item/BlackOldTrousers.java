package builder.item;

public class BlackOldTrousers extends OldTrousers {

    @Override
    public String getName() {
        return "black old trousers";
    }

    @Override
    public double price() {
        return 100;
    }
}
