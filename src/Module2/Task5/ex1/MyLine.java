package Module2.Task5.ex1;

public class MyLine extends MyPoint {
    private MyPoint end;

    public MyLine(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    public MyLine(MyPoint begin, MyPoint end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public MyPoint getBegin() {
        return new MyPoint(super.getY(), super.getX());
    }

    public void setBegin(MyPoint begin) {
        super.setXY(begin.getX(), begin.getY());
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX() {
        return super.getX();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    //
    public int getBeginY() {
        return super.getY();
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    //
    public int getEndX() {
        return this.end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }


    public int[] getBeginXY() {
        return super.getXY();
    }

    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }

    public int[] getEndXY() {
        return this.end.getXY();
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public double getLength() {
        return super.distance(end);
    }

    public double getGradient() {
        return Math.atan2(super.getY() - end.getY(), super.getX() - end.getX());
    }

    @Override
    public String toString() {
        return "MyLine[" +
                "begin=" + super.toString() +
                ", end=" + end +
                ']';
    }
}
