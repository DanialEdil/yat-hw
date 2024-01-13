package Module1;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        first("hello world");
        second(12, 15, 225);
        third(123);
        fourth(24);
        fiveth('*', 12, 21);
        sixth(12, 12, 12);
        seventh("Hello");
        eight(12435555);
    }


    static void first(String word) {
        System.out.println("Message: " + word);
    }

    static void second(int a, int b, int c) {
        int min = Math.min(a, Math.min(b, c));
        System.out.println("The smallest number is: " + min);
    }

    static void third(int a) {
        if (a > 0) {
            System.out.println("Positive");
        } else if (a == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Negative");
        }
    }

    static void fourth(int a) {
        System.out.println(Math.sqrt(a));
    }

    static void fiveth(char operation, int a, int b) {
        if (operation == '*') {
            System.out.println(a * b);
        } else if (operation == '/') {
            System.out.println(a / b);
        } else if (operation == '+') {
            System.out.println(a + b);
        } else if (operation == '-') {
            System.out.println(a - b);
        }
    }

    static void sixth(int a, int b, int c) {
        System.out.println((a + b + c) / 3);
    }

    static void seventh(String word) {
        if (word.length() % 2 == 0) {
            char first = word.charAt(word.length() / 2);
            char second = word.charAt((word.length() / 2) - 1);
            System.out.println(String.valueOf(second) + first);
        } else {
            System.out.println(word.charAt(word.length() / 2));
        }
    }

    static void eight(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println(sum);
    }


}
