package Module2.ThirdLesson.ex9;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    // Constructors
    public MyRectangle() {
        this.topLeft = new MyPoint();
        this.bottomRight = new MyPoint();
    }

    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getters and setters
    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Method to calculate the area of the rectangle
    public double getArea() {
        double width = Math.abs(bottomRight.getX() - topLeft.getX());
        double height = Math.abs(topLeft.getY() - bottomRight.getY());
        return width * height;
    }
}
