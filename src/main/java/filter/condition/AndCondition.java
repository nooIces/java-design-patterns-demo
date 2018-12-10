package filter.condition;

import filter.People;

import java.util.List;

public class AndCondition implements PeopleCondition {

    PeopleCondition[] conditions;

    public AndCondition(PeopleCondition... conditions){
        this.conditions = conditions;
    }

    @Override
    public List<People> filter(List<People> people) {
        for(PeopleCondition p : conditions){
            people = p.filter(people);
        }
        return people;
    }
}
