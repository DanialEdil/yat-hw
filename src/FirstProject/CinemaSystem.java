package FirstProject;

import java.util.Scanner;

public class CinemaSystem {
    static Scanner scanner = new Scanner(System.in);
    static boolean[][] seatsCinema;
    static int totalIncome = 0;
    static int isNotFreeSeats = 0;
    static int allSeatsCount = 0;

    public static void main(String[] args) {
        createRoom();
        printSeats();
        showMenu();
    }

    private static void showMenu() {
        int menuNumber = 1;
        while (menuNumber != 0) {
            System.out.println("1. Print seats\n" + "2. Buy a ticket\n" + "3. Show Statistics\n" + "0. Exit");
            menuNumber = scanner.nextInt();

            switch (menuNumber) {
                case 1 -> printSeats();
                case 2 -> buyTicket();
                case 3 -> showStatistics();
            }
        }

    }

    private static void createRoom() {
        System.out.println("Enter rows number:");
        int rows = scanner.nextInt();
        System.out.println("Enter seats number:");
        int seats = scanner.nextInt();
        seatsCinema = new boolean[rows][seats];

        allSeatsCount = rows * seats;
        totalIncome = allSeatsCount * 10;
    }


    private static void printSeats() {
        int rows = seatsCinema.length;
        int seats = seatsCinema[0].length;

        System.out.println("Cinema:");
        System.out.print(" ");

        for (int i = 1; i <= seats; i++) {
            System.out.print(" " + i);
        }

        System.out.println();

        for (int i = 0; i < rows; i++) {
            System.out.print((i + 1) + " ");

            for (int j = 0; j < seats; j++) {
                if (!seatsCinema[i][j]) {
                    System.out.print("S ");
                } else {
                    System.out.print("B ");
                }
            }
            System.out.println();
        }

    }

    private static void buyTicket() {
        System.out.println("Enter row:");
        int row = scanner.nextInt();
        System.out.println("Enter seat:");
        int seat = scanner.nextInt();
        System.out.println("Price 10$");

        row -= 1;
        seat -= 1;
        if (checkExistSeat(row, seat)) {
            if (!seatsCinema[row][seat]) {
                seatsCinema[row][seat] = true;
                isNotFreeSeats++;
            } else {
                System.out.println("This seat is already booked!");
                buyTicket();
            }
        } else {
            System.out.println("Such seat doesn't exist");
            buyTicket();
        }
    }

    private static void showStatistics() {
        System.out.println("Current income: " + (isNotFreeSeats * 10) + "$");
        System.out.println("Total income: " + totalIncome + "$");
        System.out.println("Number of free seats: " + (allSeatsCount - isNotFreeSeats));
        System.out.println("Total number of seats: " + allSeatsCount);
    }

    private static boolean checkExistSeat(int i, int j) {
        return i >= 0 && i < seatsCinema.length && j >= 0 && j < seatsCinema[i].length;
    }
}
