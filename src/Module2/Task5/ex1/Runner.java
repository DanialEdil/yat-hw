package Module2.Task5.ex1;


import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MyLine line1 = new MyLine(1, 2, 4, 5); // Using constructor with coordinates
        MyLine line2 = new MyLine(new MyPoint(3, 4), new MyPoint(6, 7)); // Using constructor with MyPoints

        System.out.println("Line 1:");
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        System.out.println("\nLine 2:");
        System.out.println(line2);
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());

        line1.setBeginX(2);
        line1.setBeginY(3);
        line1.setEndX(5);
        line1.setEndY(8);

        System.out.println("\nUpdated Line 1:");
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());
    }
}