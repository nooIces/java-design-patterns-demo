package abstractFactory;

import abstractFactory.classic.ClassicFactory;
import abstractFactory.modern.ModernFactory;

public class FactoryProducer {
    public static ClothesPressFactory getFactory(String type){
        switch (type){
            case "CLASSIC":
                return new ClassicFactory();
            case "MODERN":
                return new ModernFactory();
            default:
        }
        return null;
    }
}
