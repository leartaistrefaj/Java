package Inheritance_part1;

public class FlyingBird extends Bird {
    private int height;

    public FlyingBird(String color, String movement, String food, int height) {
        super(color, movement, food);
        this.height=height;
        System.out.println(super.getMovement());
        System.out.println(getMovement());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
