package chain;

public class ChainTest {
    public static void main(String[] args) {
        Sclothes s = new Sclothes(Clothes.Size.S);
        Mclothes m = new Mclothes(Clothes.Size.M);
        Lclothes l = new Lclothes(Clothes.Size.L);
        XLclothes xl = new XLclothes(Clothes.Size.XL);

        l.setNext(xl);
        m.setNext(l);
        s.setNext(m);
        s.findSize(Clothes.Size.L);
    }
}
