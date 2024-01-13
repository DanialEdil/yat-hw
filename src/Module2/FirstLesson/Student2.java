package Module2.FirstLesson;

public class Student2 {
    String name;
    double averageMark;
    double scholarship;

    public Student2(String name, double averageMark, double scholarship) {
        this.name = name;
        this.averageMark = averageMark;
        this.scholarship = scholarship;
    }

    public void studentLogic() {
        if (this.averageMark > 4.5) {
            this.scholarship += (this.scholarship * 30) / 100;
            System.out.println(this.name + " will take " + this.scholarship + "(" + this.averageMark + ")");
            return;
        }
        if (this.averageMark > 2.0) {
            this.scholarship += (this.scholarship * 10) / 100;
            System.out.println(this.name + " will take " + this.scholarship + "(" + this.averageMark + ")");
        }
    }


}
