package Module2.SecondLesson;

import java.util.Arrays;

public class Student {
    String name;
    String ID;
    String[] grades = new String[3];

    public Student(String name, String ID, String[] grades) {
        if (grades.length > 3) {
            return;
        }
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }


    public void printStudent() {
        System.out.println("name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("grades: " + Arrays.toString(grades));
        System.out.println();
    }
}
