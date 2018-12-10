package filter.condition;

import filter.People;

import java.util.List;

public interface PeopleCondition {

    public List<People> filter(List<People> people);
}
