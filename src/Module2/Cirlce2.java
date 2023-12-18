package Module2;

public class Cirlce2 {

    private double radius = 1.0;

    public Cirlce2() {
    }

    public Cirlce2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Cirlce[" +
                "radius=" + radius +
                ']';
    }
}
