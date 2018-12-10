package filter.condition;

import filter.People;

import java.util.List;
import java.util.stream.Collectors;

public class Male implements PeopleCondition {
    @Override
    public List<People> filter(List<People> people) {
        return people.stream().filter((People p) -> "male".equals(p.getSex())).collect(Collectors.toList());
    }
}
