package Module2.FirstLesson;

import java.util.Scanner;


public class MainFirstLesson {


    public static void main(String[] args) {
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

}
