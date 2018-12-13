package command.item;

public class Trousers extends Clothes {

    public Trousers(String name, double price) {
        super(name, price);
    }

    @Override
    public void change() {
        System.out.println("穿上" + name);
    }

    @Override
    public void buy() {
        System.out.println("买一条" + name + ",花了" + price + "元");
    }
}
