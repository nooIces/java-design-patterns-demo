package mediator.item;

import mediator.mediation.AbstractMediator;

public class Female extends People {

    public Female(String name, int age, String work) {
        super(name, Sex.FEMALE, age, work);
    }

    @Override
    public void contact(String message) {
        AbstractMediator mediator = getMediator();
        if(mediator == null){
            System.out.println("你还不认识任何中介");
            return;
        }
        System.out.println("Female send a message!");
        mediator.contract(message, this);
    }
}
