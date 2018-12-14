package mediator.item;

import mediator.mediation.AbstractMediator;

public abstract class People {

    private String name;

    private Sex sex;

    private int age;

    private String work;

    private AbstractMediator mediator;

    public People(String name, Sex sex, int age, String work){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.work = work;
    }

    public static enum Sex{
        MALE, FEMALE
    }

    public abstract void contact(String message);

    public void getMessage(String message){
        System.out.println(name + " " + sex + " " + age + "岁, 收到一条信息:" + message);
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public AbstractMediator getMediator() {
        return mediator;
    }

    public void setMediator(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
