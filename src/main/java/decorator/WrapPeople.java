package decorator;

import decorator.base.People;

public abstract class WrapPeople implements People{

    protected People people;

    public WrapPeople(People people){
        this.people = people;
    }

    public void wear(){
        people.wear();
    }
}
