package Module2.SecondLesson;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person() {
        this.name = "Danial";
        this.age = 20;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public String toString() {
        return "Person[" +
                "name='" + name + '\'' +
                ", age=" + age +
                ']';
    }
}
