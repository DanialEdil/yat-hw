package Module2.idkLessson;

public abstract class Pet extends Animal {
    String livingPlace;


    public Pet(String name, String livingPlace) {
        super(name);
        this.livingPlace = livingPlace;
    }

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "livingPlace='" + livingPlace + '\'' +
                super.toString() +
                '}';
    }


    protected void hello(){
        System.out.println("hELLO WORLD");
    }

}
