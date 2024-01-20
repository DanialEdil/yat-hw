package Module2.ThirdLesson.ex4;

public class CustomerSecond {
    private int id;
    private String name;
    private GENDER gender;

    public CustomerSecond(int id, String name, GENDER gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public GENDER getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + "(" + id + ")";
    }

    enum GENDER {
        MALE,
        FEMALE,
        NON_BINARY
    }
}
