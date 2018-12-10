package filter;

public class People {

    private int age;

    private String work;

    private String sex;

    public People(int age, String work, String sex){
        this.age = age;
        this.work = work;
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getWork() {
        return work;
    }

    public String getSex() {
        return sex;
    }

    @Override
    public String toString(){
        return getSex() + " " + getAge();
    }
}
