package chain;

public abstract class Clothes {

    protected Size size;

    protected Clothes clothes;

    public Clothes(Size size){
        this.size = size;
    }

    public void findSize(Size size){
        if(this.size == size){
            this.findClothes();
        }else if(clothes !=  null){
            clothes.findSize(size);
        }
    }

    public void setNext(Clothes clothes){
        this.clothes = clothes;
    }

    public abstract void findClothes();

    public static enum Size{
        S, M, L, XL
    }
}
