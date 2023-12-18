package Module1;

import java.util.Scanner;

public class Condition {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        first();
//        second();
//        third();
//        foutrh();
//        fiveth();
//        sixth();
//        seventh();
//        nine();
//        ten();
        eleven();
    }

    public static void first() {
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        System.out.println(Math.max(first, second));
    }

    public static void second() {
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();

        System.out.println(Math.max(third, Math.max(first, second)));
    }

    public static void third() {
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }

    public static void fourth() {
        int number = scanner.nextInt();

        if (number % 5 == 0 || number % 11 == 0) {
            System.out.println("DIVISIBLE");
        } else {
            System.out.println("NOT DIVISIBLE");
        }
    }

    public static void fiveth() {
        int number = scanner.nextInt();


        if (number % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    public static void sixth() {
        int year = scanner.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("IS LEAP");
        } else if (year % 400 == 0) {
            System.out.println("IS LEAP");
        } else {
            System.out.println("IS NOT LEAP");
        }
    }

    public static void seventh() {
        char letter = scanner.next().charAt(0);
//        Character.
        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
            System.out.println("is alphabet");
        } else {
            System.out.println("is not alphabet");
        }
    }

    public static void nine() {
        char letter = scanner.next().charAt(0);
//        Character.
        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
            System.out.println("is alphabet");
        } else if (letter >= '0' && letter <= '9') {
            System.out.println("is digit");
        } else {
            System.out.println("special character");
        }
    }

    public static void ten() {
        char letter = scanner.next().charAt(0);

        if ((letter >= 'a' && letter <= 'z')) {
            System.out.println("is lower calse");
        } else if ((letter >= 'A' && letter <= 'Z')) {
            System.out.println("is uppercase");
        } else {
            System.out.println("is not alphabet");
        }
    }

    public static void eleven() {
        int weekNumber = scanner.nextInt();

        if (weekNumber == 1) {
            System.out.println("Понедельник");
        } else if (weekNumber == 2) {
            System.out.println("Вторник");
        } else if (weekNumber == 3) {
            System.out.println("Среда");
        } else if (weekNumber == 4) {
            System.out.println("Четверг");
        } else if (weekNumber == 5) {
            System.out.println("Пятница");
        } else if (weekNumber == 6) {
            System.out.println("Суббота");
        } else if (weekNumber == 7) {
            System.out.println("Воскресенье");
        } else {
            System.out.println("Такого дня недели нет");
        }
//
//        switch (weekNumber) {
//            case 1 -> System.out.println("hello");
//
//        }
    }

    public static void twelve() {
        int monthNumber = scanner.nextInt();

        if (monthNumber == 1) {
            System.out.println("Январь");
        } else if (monthNumber == 2) {
            System.out.println("Февраль");
        } else if (monthNumber == 3) {
            System.out.println("Март");
        } else if (monthNumber == 4) {
            System.out.println("Апрель");
        } else if (monthNumber == 5) {
            System.out.println("Май");
        } else if (monthNumber == 6) {
            System.out.println("Июнь");
        } else if (monthNumber == 7) {
            System.out.println("Июль");
        } else if (monthNumber == 8) {
            System.out.println("Август");
        } else if (monthNumber == 9) {
            System.out.println("Сентябрь");
        } else if (monthNumber == 10) {
            System.out.println("Октябрь");
        } else if (monthNumber == 11) {
            System.out.println("Ноябрь");
        } else if (monthNumber == 12) {
            System.out.println("Декабрь");
        } else {
            System.out.println("Такого месяца нет");
        }
    }


    static void thirteen() {
        int amount = scanner.nextInt();
        int[] denominations = {2000, 1000, 500, 100, 50, 20, 5};
        int totalNotes = 0;

        for (int note : denominations) {
            if (amount >= note) {
                int count = amount / note;
                totalNotes += count;
                amount -= count * note;
            }
        }

        System.out.println(totalNotes);
    }


}
