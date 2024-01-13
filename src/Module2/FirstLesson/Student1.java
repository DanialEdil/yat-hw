package Module2.FirstLesson;

public class Student1 {
    String name;
    int markMath;
    int markEnglish;
    int markProgramming;

    public Student1(String name, int markMath, int markEnglish, int markProgramming) {
        this.name = name;
        this.markMath = markMath;
        this.markEnglish = markEnglish;
        this.markProgramming = markProgramming;
    }

    public double averageMark() {
        double averageMark = markEnglish + markMath + markProgramming;

        return Math.round((averageMark / 3) * 100.0) / 100.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", markMath=" + markMath +
                ", markEnglish=" + markEnglish +
                ", markProgramming=" + markProgramming +
                '}';
    }
}
