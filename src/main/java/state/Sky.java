package state;

public class Sky implements CarForm {


    @Override
    public void changeState(Car car) {
        System.out.println("可以飞啦");
        car.setForm(this);
    }

    @Override
    public String toString(){
        return "天空";
    }
}
