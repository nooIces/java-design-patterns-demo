package state;

public class Car {

    private CarForm form;

    public Car(CarForm form){
        this.form = form;
    }

    public CarForm getForm() {
        return form;
    }

    public void setForm(CarForm form) {
        this.form = form;
    }

}
