package Module2.Task4.ex5;

public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    private double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    private double getPerimeter() {
        return  2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[" +
                super.toString() +
                "radius=" + radius +
                ']';
    }
}
