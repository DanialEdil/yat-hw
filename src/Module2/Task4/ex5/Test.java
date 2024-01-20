package Module2.Task4.ex5;

public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        Shape shape3 = new Shape();
        shape3.setColor("green");
        System.out.println("Color: " + shape3.getColor());

        // Test Set Filled
        Shape shape4 = new Shape();
        shape4.setFilled(false);
        System.out.println("Filled: " + shape4.isFilled());

        // Test To String
        Shape shape5 = new Shape("yellow", true);
        System.out.println(shape5);
    }
}
