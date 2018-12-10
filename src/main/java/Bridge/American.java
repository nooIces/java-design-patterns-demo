package Bridge;

import Bridge.item.Clothes;

public class American extends People{

    public American(Clothes clothes){
        super(clothes);
    }


    @Override
    public void wear() {
        clothes.wearClothes();
    }
}
