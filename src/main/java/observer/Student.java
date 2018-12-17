package observer;

public class Student implements Observer{

    private String name;

    public Student(String name, Observable o){
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void updateInfo(Observable ob, Object info) {
        if(ob.isUpdate()){
            System.out.println("学生" + name + " 收到家庭作业:" + info);
        }
    }
}
