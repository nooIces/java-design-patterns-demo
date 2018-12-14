package mediator.mediation;

import mediator.item.People;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MerriageMediator extends AbstractMediator{

    private String name;

    protected Map<People.Sex, List<People>> map;

    public MerriageMediator(String name){
        this.name = name;
        map = new HashMap<>();
    }

    public abstract void addMember(People people);

    public String showMediatorMessage(){
        return "这是" + name + "介绍所介绍";
    }
}
