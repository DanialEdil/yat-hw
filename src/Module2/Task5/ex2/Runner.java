package Module2.Task5.ex2;

public class Runner {
    public static void main(String[] args) {
        // Declare and allocate a new instance of cylinder
        //   with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius=" + c1.getBase().getRadius()
                + " height=" + c1.getHeight()
                + " base area=" + c1.getBase().getArea()
                + " volume=" + c1.getVolume());

        // Declare and allocate a new instance of cylinder
        //   specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius=" + c2.getBase().getRadius()
                + " height=" + c2.getHeight()
                + " base area=" + c2.getBase().getArea()
                + " volume=" + c2.getVolume());

        // Declare and allocate a new instance of cylinder
        //   specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius=" + c3.getBase().getRadius()
                + " height=" + c3.getHeight()
                + " base area=" + c3.getBase().getArea()
                + " volume=" + c3.getVolume());
    }
}
