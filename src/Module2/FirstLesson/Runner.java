package Module2.FirstLesson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        firstHW();
//        secondHW();
//        thirdHW();
//        fourthHW();
//        fiftiethHW();
        sixthHW();
    }

    public static void firstHW() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Plane[] planes = new Plane[count];

        for (int i = 0; i < count; i++) {
            String id = scanner.next();
            String leaveTime = scanner.next();
            String arrivalTime = scanner.next();
            Plane plane = new Plane(id, leaveTime, arrivalTime);
            planes[i] = plane;
        }

        for (Plane plane : planes) {
            if (plane.more2Hours()) {
                System.out.println(plane);
            }
        }
    }

    public static void secondHW() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Student1[] students = new Student1[count];
        for (int i = 0; i < count; i++) {
            scanner.next();
            String name = scanner.nextLine();
            int markMath = Integer.parseInt(scanner.next());
            int markEnglish = Integer.parseInt(scanner.next());
            int markProgramming = Integer.parseInt(scanner.next());
            Student1 student = new Student1(name, markMath, markEnglish, markProgramming);
            students[i] = student;
        }

        for (Student1 student : students) {
            if (student.averageMark() >= 4) {
                System.out.println(student.name + " " + student.averageMark());
            }
        }
    }

    public static void thirdHW() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Student2[] students = new Student2[count];
        for (int i = 0; i < count; i++) {
            String name = scanner.next();
            double averageMark = Double.parseDouble(scanner.next());
            double scholarships = Double.parseDouble(scanner.next());
            Student2 student = new Student2(name, averageMark, scholarships);
            students[i] = student;
        }

        for (Student2 student : students) {
            student.studentLogic();
        }
    }

    public static void fourthHW() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        Book1[] books = new Book1[count];
        for (int i = 0; i < count; i++) {
            String nameBook = scanner.next();
            String author = scanner.next();
            double price = Double.parseDouble(scanner.next());
            String type = scanner.next();
            Book1 book = new Book1(nameBook, author, price, type);
            book.calculatePriceBook();
            books[i] = book;
        }

        for (Book1 book : books) {
            System.out.println(book);
        }
    }

    public static void fiftiethHW() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        List<Candidate> candidates = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            scanner.nextLine();
            String fullName = scanner.nextLine();
            String work = scanner.next();
            int income = Integer.parseInt(scanner.next());
            Candidate candidate = new Candidate(fullName, work, income);
            System.out.println(fullName + " " + work + " " + income);
            if (candidate.canParticipatePrivateClub()) {
                candidates.add(candidate);
            }
        }

        System.out.println(candidates);
    }

    public static void sixthHW() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        List<Book2> bookList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            scanner.nextLine();
            String name = scanner.next();
            int price = Integer.parseInt(scanner.next());
            String type = scanner.next();
            int sold = Integer.parseInt(scanner.next());
            Book2 book = new Book2(name, price, type, sold);
            bookList.add(book);
        }

        int totalSum = 0;
        for(Book2 book2: bookList){
            int totalBook = book2.calculateTotalPrice();
            System.out.println(book2.name + ": " + totalBook);
            totalSum += totalBook;
        }

        System.out.println("Total = " + totalSum);
    }


}

