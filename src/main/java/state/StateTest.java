package state;

public class StateTest {
    public static void main(String[] args) {
        Car car = new Car(new Sky());
        System.out.println(car.getForm().toString());

        CarForm land = new Land();
        land.changeState(car);
        System.out.println(car.getForm().toString());

        CarForm sea = new Sea();
        sea.changeState(car);
        System.out.println(car.getForm().toString());
    }
}
