package abstractFactory;

import abstractFactory.classic.ClassicClothes;
import abstractFactory.modern.ModernClothes;

public abstract class ClothesPressFactory {

    public abstract ModernClothes getModernClothes(String type);

    public abstract ClassicClothes getClassicClothes(String type);
}
