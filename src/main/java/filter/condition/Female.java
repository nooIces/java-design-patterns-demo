package filter.condition;

import filter.People;

import java.util.List;
import java.util.stream.Collectors;

public class Female implements PeopleCondition {
    @Override
    public List<People> filter(List<People> people) {
        return people.stream().filter((People p) -> "female".equals(p.getSex())).collect(Collectors.toList());
    }
}
