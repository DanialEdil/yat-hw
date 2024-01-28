package Module2.Task5.ex2;

public class Cylinder {

    private Circle base;
    private double height = 1.0;

    public Cylinder() {
        this.base = new Circle();
    }

    public Cylinder(double radius) {
        base = new Circle(radius);
    }

    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return 0;
    }

    public Circle getBase() {
        return base;
    }
}
