package state;

public class Sea implements CarForm {

    @Override
    public void changeState(Car car) {
        System.out.println("可以在海里行驶啦");
        car.setForm(this);
    }

    @Override
    public String toString(){
        return "海洋";
    }
}
