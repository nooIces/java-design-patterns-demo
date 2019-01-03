package nullobj;

public class NormalClothes extends AbstractClothes {

    public NormalClothes(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
