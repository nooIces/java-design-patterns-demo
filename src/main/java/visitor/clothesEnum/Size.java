package visitor.clothesEnum;

public enum Size {

    S("s"), M("m"), X("x"), XL("xl"), XXL("xxl");

    private String size;
    Size(String size){
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
