package Module2.idkLessson;

public class Dog extends Pet {
    String breed;

    public Dog(String name, String livingPlace) {
        super(name, livingPlace);
    }

    public Dog(String name, String livingPlace, String breed) {
        super(name, livingPlace);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                super.toString() +
                '}';
    }

    @Override
    public void hello() {
        System.out.println("hello");
    }
}
