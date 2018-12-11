package decorator;

import decorator.base.People;

public class WearTrousers extends WrapPeople {

    public WearTrousers(People people) {
        super(people);
    }

    @Override
    public void wear(){
        people.wear();
        System.out.println("wear trousers");
    }
}
