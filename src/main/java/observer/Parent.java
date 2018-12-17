package observer;

public class Parent implements Observer {

    private String name;

    public Parent(Observable ob, String name){
        ob.addObserver(this);
        this.name = name;
    }

    @Override
    public void updateInfo(Observable ob, Object info) {
        if(ob.isUpdate()){
            System.out.println("家长" + name + "收到了家庭作业:" + info);
        }
    }
}
