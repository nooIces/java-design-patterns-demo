package prototype.item;

public abstract class Clothes implements Cloneable{

    private int id;

    protected String name;

    public Clothes(int id){
        this.id = id;
    }

    abstract void wear();

    public String getName() {
        return name;
    }

    public Object clone(){
        System.out.println("克隆开始...");
        Object clone = null;
        try{
            clone = super.clone();
            System.out.println("克隆结束...");
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

    public int getId() {
        return id;
    }
}
