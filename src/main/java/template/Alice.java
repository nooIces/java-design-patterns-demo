package template;

public class Alice extends Rise {
    @Override
    protected void wakeUp() {
        System.out.println("20 minutes");
    }

    @Override
    protected void wearClothes() {
        System.out.println("10 minutes");
    }

    @Override
    protected void brush() {
        System.out.println("20 minutes");
    }
}
