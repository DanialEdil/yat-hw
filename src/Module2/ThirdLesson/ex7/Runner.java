package Module2.ThirdLesson.ex7;


public class Runner {

    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle(); // Using default constructor
        MyCircle circle2 = new MyCircle(3, 4, 5); // Using constructor with coordinates and radius
        MyCircle circle3 = new MyCircle(new MyPoint(1, 2), 3); // Using constructor with MyPoint and radius

        System.out.println("Circle 1:");
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Circumference: " + circle1.getCircumference());

        System.out.println("\nCircle 2:");
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Circumference: " + circle2.getCircumference());

        System.out.println("\nCircle 3:");
        System.out.println(circle3);
        System.out.println("Area: " + circle3.getArea());
        System.out.println("Circumference: " + circle3.getCircumference());

        double distanceBetweenCircle2AndCircle3 = circle2.distance(circle3);
        System.out.println("\nDistance between Circle 2 and Circle 3: " + distanceBetweenCircle2AndCircle3);

    }
}