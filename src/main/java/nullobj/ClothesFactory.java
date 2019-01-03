package nullobj;

public class ClothesFactory {

    private static final String[] names = {"Shirt", "Hat", "Trousers"};

    public static AbstractClothes getClothes(String name){
        for(String s : names){
            if(s.equals(name)){
                return new NormalClothes(name);
            }
        }
        return new NullClothes();
    }
}
