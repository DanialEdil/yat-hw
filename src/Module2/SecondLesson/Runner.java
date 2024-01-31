package Module2.SecondLesson;

import Module2.FirstLesson.Candidate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
//        firstHW();
//        secondHW();
//        thirdHW();
//        fourthHW();
//        sixthHW();
//        fourthHW();
        fivethHW();
//        sevenHW();
    }


    public static void firstHW() {
        // Test constructor and toString()
        Date d1 = new Date(1, 2, 2014);
        System.out.println(d1);  // toString()

        // Test Setters and Getters
        d1.setMonth(12);
        d1.setDay(9);
        d1.setYear(2099);
        System.out.println(d1);  // toString()
        System.out.println("Month: " + d1.getMonth());
        System.out.println("Day: " + d1.getDay());
        System.out.println("Year: " + d1.getYear());

        // Test setDate()
        d1.setDate(3, 4, 2016);
        System.out.println(d1);  // toString()
    }

    public static void secondHW() {
        // Test constructors and toString()
        Time t1 = new Time(1, 2, 3);
        System.out.println(t1);  // toString()

        // Test Setters and Getters
        t1.setHour(4);
        t1.setMinute(5);
        t1.setSecond(6);
        System.out.println(t1);  // toString()
        System.out.println("Hour: " + t1.getHour());
        System.out.println("Minute: " + t1.getMinute());
        System.out.println("Second: " + t1.getSecond());

        // Test setTime()
        t1.setTime(23, 59, 58);
        System.out.println(t1);  // toString()

        // Test nextSecond();
        System.out.println(t1.nextSecond());
        System.out.println(t1.nextSecond().nextSecond());

        // Test previousSecond()
        System.out.println(t1.previousSecond());
        System.out.println(t1.previousSecond().previousSecond());
    }


    public static void thirdHW() {
        Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
        System.out.println(ball);  // toString()

        // Test Setters and Getters
        ball.setX(80.0f);
        ball.setY(35.0f);
        ball.setRadius(5);
        ball.setXDelta(4.0f);
        ball.setYDelta(6.0f);
        System.out.println(ball);  // toString()
        System.out.println("x is: " + ball.getX());
        System.out.println("y is: " + ball.getY());
        System.out.println("radius is: " + ball.getRadius());
        System.out.println("xDelta is: " + ball.getXDelta());
        System.out.println("yDelta is: " + ball.getYDelta());

        // Bounce the ball within the boundary
        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;
        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();
            // Check boundary value to bounce back
            if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }
    }

    public static void fourthHW() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        List<Colony> colonyList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            scanner.nextLine();
            String name = scanner.next();
            int smetPrice = Integer.parseInt(scanner.next());
            int countAparts = Integer.parseInt(scanner.next());
            List<Apartment> apartments = new ArrayList<>();
            for (int j = 0; j < countAparts; j++) {
                scanner.nextLine();
                String apartTitle = scanner.next();
                int smet = Integer.parseInt(scanner.next());
                String type = scanner.next();
                Apartment apartment = new Apartment(apartTitle, smet, type);
                apartments.add(apartment);
            }

            Colony colony = new Colony(name, smetPrice, count, apartments);
            colonyList.add(colony);
        }
        int minColony = colonyList.get(0).calculatePrice().calculateApartment(colonyList.get(0).smetPrice);
        Apartment minColonyApart = colonyList.get(0).calculatePrice();
        for (Colony colony : colonyList) {
            if (minColony > colony.calculatePrice().calculateApartment(colony.smetPrice)) {
                minColonyApart = colony.calculatePrice();
                minColony = minColonyApart.calculateApartment(colony.smetPrice);
            }
        }


        System.out.println(minColonyApart);

    }

    public static void fivethHW() {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        School[] schoolList = new School[count];
        for (int i = 0; i < count; i++) {
            scanner.nextLine();
            String name = scanner.next();
            String type = scanner.next();
            int countAparts = Integer.parseInt(scanner.next());
            Esper[] espers = new Esper[countAparts];
            for (int j = 0; j < countAparts; j++) {
                scanner.nextLine();
                String firstName = scanner.next();
                int mighty = Integer.parseInt(scanner.next());
                String typeEsper = scanner.next();
                Esper esper = new Esper(firstName, mighty, typeEsper);
                espers[j] = esper;
            }

            School school = new School(name, type, count, espers);
            schoolList[i] = school;
        }

        int specialSchool = 0;
        for (School school : schoolList) {
            school.calculateEspers();
            specialSchool += school.acceptSpecialSchool;
            System.out.println(school.title + " " + school.acceptEspersList);
        }
        System.out.println("Special School - " + specialSchool);
    }

    public static void sixthHW() {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());     // Test getter
        System.out.println("eamil is: " + ahTeck.getEmail());   // Test getter
        System.out.println("gender is: " + ahTeck.getGender()); // Test gExerciseOOP_MyPolynomial.pngetter

        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);  // Test Book's Constructor
        System.out.println(dummyBook);  // Test Book's toString()

// Test Getters and Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("Author is: " + dummyBook.getAuthor());  // Author's toString()
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

// Use an anonymous instance of Author to construct a Book instance
        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // toString()
    }


    public static void sevenHW() {
        // Declare and allocate an array of Authors
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

// Declare and allocate a Book instance
        Book7 javaDummy = new Book7("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // toString()

        System.out.println(javaDummy.getAuthorNames());
    }


}