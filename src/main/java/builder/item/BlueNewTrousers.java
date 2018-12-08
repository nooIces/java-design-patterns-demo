package builder.item;

public class BlueNewTrousers extends NewTrousers {
    @Override
    public String getName() {
        return "blue new trousers";
    }

    @Override
    public double price() {
        return 200;
    }
}
