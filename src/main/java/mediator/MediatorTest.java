package mediator;

import mediator.item.Female;
import mediator.item.Male;
import mediator.item.People;
import mediator.mediation.MiddleAgeMediator;

public class MediatorTest {
    public static void main(String[] args) {
        MiddleAgeMediator mediator = new MiddleAgeMediator();

        People John = new Male("John", 30, "engineer");
        People Karl = new Male("Karl", 25, "doctor");
        People James = new Male("James", 40, "writer");
        People Jordan = new Male("Jordan", 45, "worker");

        mediator.addMember(John);
        mediator.addMember(Karl);
        mediator.addMember(James);
        mediator.addMember(Jordan);

        People Alice = new Female("Alice", 30, "engineer");
        People Julie = new Female("Julie", 25, "doctor");
        People Taylor = new Female("Taylor", 40, "writer");
        People Lily = new Female("Lily", 45, "worker");

        mediator.addMember(Alice);
        mediator.addMember(Julie);
        mediator.addMember(Taylor);
        mediator.addMember(Lily);

        John.contact("Hello, I am John");
        Karl.contact("Hello, I am Karl");

        Alice.contact("I am Alice");
    }
}
