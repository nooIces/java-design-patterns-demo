package mediator.item;

import mediator.mediation.AbstractMediator;

public class Male extends People {

    public Male(String name, int age, String work) {
        super(name, Sex.MALE, age, work);
    }

    @Override
    public void contact(String message) {
        AbstractMediator mediator = getMediator();
        if(mediator == null){
            System.out.println("你还不认识任何中介");
            return;
        }
        System.out.println("Male send a message!");
        getMediator().contract(message, this);
    }
}
