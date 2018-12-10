package prototype;

import prototype.item.Clothes;

import java.util.HashMap;
import java.util.Map;

public class ClothesCache {
    private Map<Integer, Clothes> map;

    public ClothesCache(){
        map = new HashMap<>();
    }

    public void addCache(Clothes clothes){
        map.put(clothes.getId(), clothes);
    }

    public Clothes get(int id){
        return map.get(id).clone();
    }
}
