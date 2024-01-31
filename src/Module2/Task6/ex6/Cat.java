package Module2.Task6.ex6;

public class Cat extends Animal {


    public Cat(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Meow");
    }
}
