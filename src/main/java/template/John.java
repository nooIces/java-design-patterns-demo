package template;

public class John extends Rise {
    @Override
    protected void wakeUp() {
        System.out.println("10 minutes");
    }

    @Override
    protected void wearClothes() {
        System.out.println("2 minutes");
    }

    @Override
    protected void brush() {
        System.out.println("3 minutes");
    }
}
