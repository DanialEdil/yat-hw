package Module2.FirstLesson;

import java.util.Arrays;

public class Person {
    String firstname;
    String lastname;
    int age;
    String sex;
    String[] interests;

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", interests=" + Arrays.toString(interests) +
                '}';
    }
}
