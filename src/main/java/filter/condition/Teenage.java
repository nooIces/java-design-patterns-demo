package filter.condition;

import filter.People;

import java.util.List;
import java.util.stream.Collectors;

public class Teenage implements PeopleCondition {

    @Override
    public List<People> filter(List<People> people) {
        return people.stream().filter((People p) -> p.getAge()>=10 && p.getAge() <= 18).collect(Collectors.toList());
    }
}
