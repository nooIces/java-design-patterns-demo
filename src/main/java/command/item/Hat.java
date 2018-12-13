package command.item;

public class Hat extends Clothes {

    public Hat(String name, double price) {
        super(name, price);
    }

    @Override
    public void change() {
        System.out.println("带上" + name);
    }

    @Override
    public void buy() {
        System.out.println("买一个" + name + ",花了" + price + "元");
    }
}
