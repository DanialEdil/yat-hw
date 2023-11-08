package Module1;

import java.util.Scanner;

public class Variable {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        first();
//        second();
//        third();
//        fourth();
//        fiveth();
//        sixth();
//        seventh();
//        eight();
//        nineth();
//        tens();
    }


    public static void first() {
        System.out.println("Your Full Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Hello");
        System.out.println(firstName);
    }

    public static void second() {
        System.out.println("First Number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondNum = scanner.nextInt();

        System.out.println(firstNum + secondNum);
    }

    public static void third() {
        System.out.println("First Number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondNum = scanner.nextInt();

        System.out.println(firstNum / secondNum);
    }


    public static void fourth() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }

    public static void fiveth() {
        System.out.println("First Number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondNum = scanner.nextInt();

        System.out.println(firstNum + " x " + secondNum + " =  " + (firstNum * secondNum));
    }

    public static void sixth() {
        System.out.println("First Number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Second Number: ");
        int secondNum = scanner.nextInt();

        System.out.println(firstNum + " + " + secondNum + " =  " + (firstNum + secondNum));
        System.out.println(firstNum + " - " + secondNum + " =  " + (firstNum - secondNum));
        System.out.println(firstNum + " x " + secondNum + " =  " + (firstNum * secondNum));
        System.out.println(firstNum + " / " + secondNum + " =  " + (firstNum / secondNum));
        System.out.println(firstNum + " mod " + secondNum + " =  " + (firstNum % secondNum));
    }

    public static void seventh() {
        System.out.println("Input Number: ");
        int firstNum = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(firstNum + " x " + i + " =  " + (firstNum * i));
        }
    }


    public static void eight() {
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    public static void nineth() {
        System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    }

    public static void tens() {
        System.out.println(4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    }
}
