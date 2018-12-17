package observer;

public class Teacher extends Observable{

    @Override
    public void showMessage() {
        System.out.println("this is a teacher");
    }

}
