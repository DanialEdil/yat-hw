package Module2.ThirdLesson.ex9;


public class Runner {

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 5);
        MyPoint point2 = new MyPoint(7, 2);

        // Create a rectangle
        MyRectangle rectangle = new MyRectangle(point1, point2);

        // Display rectangle information
        System.out.println("Top Left Corner: " + rectangle.getTopLeft());
        System.out.println("Bottom Right Corner: " + rectangle.getBottomRight());
        System.out.println("Area: " + rectangle.getArea());
    }
}