package builder.item;

public abstract class NewTrousers implements Clothes{

    @Override
    public ClothesKind packing() {
        return new Normal();
    }

    @Override
    public abstract double price();
}
