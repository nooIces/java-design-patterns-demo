package bridge;

import bridge.item.Coat;
import bridge.item.Sweater;

public class BridgeTest {
    public static void main(String[] args) {
        People cn = new Chinese(new Coat());

        People la = new American(new Sweater());
    }
}
