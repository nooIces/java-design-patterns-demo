package abstractFactory.classic;

import abstractFactory.ClothesPressFactory;
import abstractFactory.modern.ModernClothes;

public class ClassicFactory extends ClothesPressFactory {

    @Override
    public ModernClothes getModernClothes(String type) {
        return null;
    }

    @Override
    public ClassicClothes getClassicClothes(String type) {
        switch (type){
            case "COTTA":
                return new Cotta();
            case "PANTS":
                return new Pants();
            case "CLASSICSHOES":
                return new ClassicShoes();
            default:
        }
        return null;
    }
}
