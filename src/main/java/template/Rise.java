package template;

public abstract class Rise {
    public final void flow(){
        System.out.println("起床流程");
        wakeUp();
        wearClothes();
        brush();
    }

    protected abstract void wakeUp();

    protected abstract void wearClothes();

    protected abstract void brush();

}
