package Bridge;

import Bridge.item.Clothes;

public abstract class People {
    protected Clothes clothes;

    protected People(Clothes clothes){
        this.clothes = clothes;
    }

    public abstract void wear();
}
