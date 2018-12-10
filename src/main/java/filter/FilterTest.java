package filter;

import filter.condition.AndCondition;
import filter.condition.Female;
import filter.condition.Male;
import filter.condition.OrCondition;
import filter.condition.Teenage;

import java.util.ArrayList;
import java.util.List;

public class FilterTest {
    public static void main(String[] args) {
        List<People> list = new ArrayList<>();
        for(int i = 8; i <= 22; i+=2){
            list.add(new People(i, "code", "male"));
            list.add(new People(i, "code", "female"));
        }
        System.out.println("total:" + list);

        Male male = new Male();
        System.out.println("male:" + male.filter(list));

        Female female = new Female();
        System.out.println("female:" + female.filter(list));

        Teenage teenage = new Teenage();
        System.out.println("teenage:" + teenage.filter(list));

        AndCondition andCondition = new AndCondition(male, teenage);
        System.out.println("male and teenage:" + andCondition.filter(list));

        OrCondition orCondition = new OrCondition(female, teenage);
        System.out.println("female or teenage:" + orCondition.filter(list));
    }
}
