package visitor.clothesEnum;

public enum Color {
    RED("red"), WHITE("white"), GREEN("green");

    private String color;

    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
