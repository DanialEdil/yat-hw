package Module2.ThirdLesson.ex8;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter() {
        return this.v1.distance() + this.v2.distance() + this.v3.distance();
    }

    public String getType() {
        if (this.v1.distance(this.v2) == 0 && this.v2.distance(this.v3) == 0 && this.v1.distance(this.v3) == 0) {
            return "equilateral";
        } else if (this.v1.distance(this.v2) != 0 && this.v2.distance(this.v3) != 0 && this.v1.distance(this.v3) != 0) {
            return "scalene";
        } else {
            return "isosceles";
        }
    }


    @Override
    public String toString() {
        return "MyTriangle[" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 +
                ']';
    }
}
