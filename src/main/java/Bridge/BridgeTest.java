package Bridge;

import Bridge.item.Coat;
import Bridge.item.Sweater;

public class BridgeTest {
    public static void main(String[] args) {
        People cn = new Chinese(new Coat());

        People la = new American(new Sweater());
    }
}
