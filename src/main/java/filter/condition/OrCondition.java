package filter.condition;

import filter.People;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrCondition implements PeopleCondition {

    PeopleCondition[] conditions;

    public OrCondition(PeopleCondition... conditions){
        this.conditions = conditions;
    }

    @Override
    public List<People> filter(List<People> people) {
        Set<People> set = new HashSet<>();
        for(PeopleCondition p : conditions){
            set.addAll(p.filter(people));
        }
        return new ArrayList<>(set);
    }
}
