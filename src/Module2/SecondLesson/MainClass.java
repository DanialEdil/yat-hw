package Module2.SecondLesson;

public class MainClass {
    public static void main(String[] args) {
        Student student1 = new Student("Danial", "7777777", new String[]{"3", "4", "5"});
        Student student2 = new Student("Aruzhan", "1111111", new String[]{"5", "5", "5"});

        student1.printStudent();
        student2.printStudent();
        Person person1 = new Person("Aruzhan", 22);
    }


}
