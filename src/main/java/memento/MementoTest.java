package memento;

import java.util.ArrayList;
import java.util.List;

public class MementoTest {
    public static void main(String[] args) {
        Originator originator = new Originator("StateA");

        List<Memento> remember = new ArrayList<>();
        remember.add(originator.saveState());
        originator.setState("StateB");
        originator.setState("StateC");
        remember.add(originator.saveState());
        originator.setState("StateD");

        System.out.println("current state:---" + originator.getState());
        originator.getFromMemento(remember.get(0));
        System.out.println("first saved state:---" + originator.getState());
        originator.getFromMemento(remember.get(1));
        System.out.println("second saved state:---" + originator.getState());
    }
}
