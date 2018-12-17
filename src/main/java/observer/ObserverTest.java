package observer;

public class ObserverTest {
    public static void main(String[] args) {
        Observable ob = new Teacher();
        Student John = new Student("John", ob);
        Student Karl = new Student("Karl", ob);
        Parent JohnFather = new Parent(ob, "John's father");
        ob.notifyObservers("homework");


        /*String[] str = new String[]{"Alice", "Jim", "Will"};
        String[] homeworks = new String[]{"A", "B", "C"};
        for(int i = 0; i < 3; i++){
            int in = i;
            Thread thread = new Thread(() -> {
                Student s = new Student(str[in], ob);
                ob.notifyObservers(homeworks[in]);
            });
            thread.start();
        }*/
    }
}
