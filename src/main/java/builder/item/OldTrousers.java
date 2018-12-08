package builder.item;

public abstract class OldTrousers implements Clothes{

    @Override
    public ClothesKind packing() {
        return new Probation();
    }

    @Override
    public abstract double price();
}
