package Module2;

public class Car {
    private int speed;

    public Car() {
        this.speed = 0;
    }

    public void start() {
        this.speed = 0;
    }

    public void accelerate(int value) {
        this.speed += value;
    }

    public int getSpeed() {
        return speed;
    }
}
