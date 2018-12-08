package builder.item;

public class WhiteOldTrousers extends OldTrousers{
    @Override
    public String getName() {
        return "white old trousers";
    }

    @Override
    public double price() {
        return 75.0;
    }
}
