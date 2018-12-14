package mediator.mediation;

import mediator.item.People;

import java.util.ArrayList;
import java.util.List;

public class MiddleAgeMediator extends MerriageMediator {

    public MiddleAgeMediator() {
        super("燃烧的青春");
    }

    @Override
    public void addMember(People people) {
        int age = people.getAge();
        if(age < 30 || age > 40){
            System.out.println(people.getAge()+"岁, 不符合年龄, 不能加入");
            return;
        }
        List<People> list = map.getOrDefault(people.getSex(), new ArrayList<>());
        list.add(people);
        people.setMediator(this);
        map.put(people.getSex(), list);
    }

    @Override
    public void contract(String message, People people) {
        String msg = showMediatorMessage()+":"+message;
        List<People> list = map.getOrDefault(people.getSex()== People.Sex.MALE? People.Sex.FEMALE: People.Sex.MALE, new ArrayList<>());
        for(People p : list){
            p.getMessage(msg);
        }
    }
}
