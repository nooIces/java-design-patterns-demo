package decorator;

import decorator.base.People;

public class WearClothes extends WrapPeople {

    public WearClothes(People people) {
        super(people);
    }

    @Override
    public void wear(){
        people.wear();
        System.out.println("wear clothes");
    }
}
