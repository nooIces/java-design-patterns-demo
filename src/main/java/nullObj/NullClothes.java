package nullObj;

public class NullClothes extends AbstractClothes {
    @Override
    public String getName() {
        return "Not exist";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
