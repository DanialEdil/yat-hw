package Module2.ThirdLesson.ex8;


public class Runner {

    public static void main(String[] args) {
        MyPoint point1 = new MyPoint(1, 1);
        MyPoint point2 = new MyPoint(5, 1);
        MyPoint point3 = new MyPoint(3, 5);

        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);

        System.out.println("Triangle 1:");
        System.out.println(triangle1);
        System.out.println("Perimeter: " + triangle1.getPerimeter());
        System.out.println("Type: " + triangle1.getType());

        MyTriangle triangle2 = new MyTriangle(1, 1, 5, 1, 3, 5);

        System.out.println("\nTriangle 2:");
        System.out.println(triangle2);
        System.out.println("Perimeter: " + triangle2.getPerimeter());
        System.out.println("Type: " + triangle2.getType());

    }
}