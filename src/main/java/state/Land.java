package state;

public class Land implements CarForm {
    @Override
    public void changeState(Car car) {
        System.out.println("陆地行驶");
        car.setForm(this);
    }

    @Override
    public String toString(){
        return "陆地";
    }
}
