package Module1;

import java.util.Scanner;

public class IFELSE {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }

    static void first() {

    }

    static double triangleP(int a, int h) {
        double b = Math.sqrt(Math.pow(a / 2, 2) + Math.pow(h, 2));
        /*
            b^2 = (a/2)^2 + h^2
         */
        return b + a + b;
    }
}
