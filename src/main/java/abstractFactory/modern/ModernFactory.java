package abstractFactory.modern;

import abstractFactory.ClothesPressFactory;
import abstractFactory.classic.ClassicClothes;

public class ModernFactory extends ClothesPressFactory {

    @Override
    public ModernClothes getModernClothes(String type) {
        switch (type){
            case "DRESS":
                return new Dress();
            case "TROUSERS":
                return new Trousers();
            case "MODERNSHOES":
                return new ModernShoes();
            default:
        }
        return null;
    }

    @Override
    public ClassicClothes getClassicClothes(String type) {
        return null;
    }
}
