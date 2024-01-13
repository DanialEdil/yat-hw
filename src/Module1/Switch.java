package Module1;

import java.util.Scanner;

public class Switch {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(first());
    }

    static String first() {
        int numMonth = scanner.nextInt();

        return switch (numMonth) {
            case 12, 1, 2 -> {
                String winter = "Winter";
                yield winter;
            }
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "NOT FIND";
        };
    }

    static void second() {
        String gender = scanner.next();

        switch (gender) {
            case "m" -> System.out.println("Male");
            case "f" -> System.out.println("female");
        }
    }

    static void third() {
        int numMonth = scanner.nextInt();

        switch (numMonth) {
            case 1, 3, 5, 7, 9, 12 -> System.out.println("31");
            case 2 -> System.out.println("29");
            case 4, 6, 8, 10, 11 -> System.out.println("30");
        }
    }

    static void fourth() {
        int numOperation = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        switch (numOperation) {
            case 1 -> System.out.println(a + b);
            case 2 -> System.out.println(a - b);
            case 3 -> System.out.println(a * b);
            case 4 -> System.out.println(a / b);
        }
    }

    static void fiveth() {
        int numSize = scanner.nextInt();
        int a = scanner.nextInt();

        switch (numSize) {
            case 1 -> System.out.println(a / 10);
            case 2 -> System.out.println(a * 1000);
            case 3 -> System.out.println(a);
            case 4 -> System.out.println(a / 100);
            case 5 -> System.out.println(a / 1000);
        }
    }

    static void sixth() {
        int numKG = scanner.nextInt();
        int a = scanner.nextInt();

        switch (numKG) {
            case 1 -> System.out.println(a);
            case 2 -> System.out.println(a / 1000000);
            case 3 -> System.out.println(a / 1000);
            case 4 -> System.out.println(a * 1000);
            case 5 -> System.out.println(a * 100);
        }
    }


    static void seventh() {
        int numCircle = scanner.nextInt();
        int a = scanner.nextInt();

        switch (numCircle) {
            case 1 -> {
                int radius = a;
                int diametr = a * 2;
                double length = 2 * Math.PI * a;
                double square = Math.PI * Math.pow(a, 2);
                System.out.println(radius);
                System.out.println(diametr);
                System.out.println(length);
                System.out.println(square);
            }
            case 2 -> {
                int radius = a / 2;
                int diametr = a;
                double length = 2 * Math.PI * radius;
                double square = Math.PI * Math.pow(radius, 2);
                System.out.println(radius);
                System.out.println(diametr);
                System.out.println(length);
                System.out.println(square);
            }
            case 3 -> {
                double radius = a / Math.PI * 2;

                double diameter = radius * 2;
                double length = a;
                double square = Math.PI * Math.pow(a, 2);
                System.out.println(radius);
                System.out.println(diameter);
                System.out.println(length);
                System.out.println(square);
            }
            case 4 -> {
                double radius = Math.sqrt(a / Math.PI);
                double diameter = radius * 2;
                double length = 2 * Math.PI * radius;
                double square = a;
                System.out.println(radius);
                System.out.println(diameter);
                System.out.println(length);
                System.out.println(square);
            }
        }
    }

    static void eight() {
        int numSquare = scanner.nextInt();
        int a = scanner.nextInt();


        /*
            1 — катет a,
            2 — гипотенуза c = a·√2,
            3 — высота h, опущенная на гипотенузу (h = c/2),
            4 — площадь S = c·h/2.
         */
        switch (numSquare) {
            case 1 -> {
                double c = a * Math.sqrt(2);
                double h = c / 2;
                System.out.println(a);
                System.out.println(c);
                System.out.println(a * Math.sqrt(2) / 2);
                System.out.println(c * h / 2);
            }
            case 2 -> {
                double katet = a / Math.sqrt(2);
                int h = a / 2;
                int s = a * h / 2;
                System.out.println(katet);
                System.out.println(a);
                System.out.println(h);
                System.out.println(s);
            }
            case 3 -> {
                int katet = a / 2;
                double hypotenus = Math.sqrt(Math.pow(katet, 2) + Math.pow(katet, 2));

                System.out.println(katet);
                System.out.println(hypotenus);
                System.out.println(a);
                System.out.println(Math.PI * Math.pow(katet, 2));
            }
            case 4 -> {
                double r = Math.sqrt(a / Math.PI);
                System.out.println(r);
                System.out.println(r * 2);
                System.out.println(2 * Math.PI * r);
                System.out.println(a);
            }
        }
    }


}
