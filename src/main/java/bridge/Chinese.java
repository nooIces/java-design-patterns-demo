package bridge;

import bridge.item.Clothes;

public class Chinese extends People {

    public Chinese(Clothes clothes){
        super(clothes);
    }

    @Override
    public void wear() {
        clothes.wearClothes();
    }
}
