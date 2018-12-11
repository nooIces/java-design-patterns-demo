package flyweight;

import java.util.HashMap;
import java.util.Map;

public class ClothesFactory {

    private static Map<Color, Hat> map;

    static {
        map = new HashMap<>();
    }

    public static Hat getHat(Color color){
        Hat hat = map.get(color);
        if(hat == null){
            hat = new Hat(color);
            map.put(color, hat);
            System.out.println("add to Map hat");
        }
        return hat;
    }


    static enum Color{
        RED, WHITE, BLUE
    }

    static enum Size{
        S, M, L, X, XL, XLL
    }
}
