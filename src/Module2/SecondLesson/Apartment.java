package Module2.SecondLesson;

public class Apartment {
    String title; // название
    int smet; //количество квадратных метров
    String type;

    public Apartment(String title, int smet, String type) {
        this.title = title;
        this.smet = smet;
        this.type = type;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSmet() {
        return smet;
    }

    public void setSmet(int smet) {
        this.smet = smet;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int calculateApartment(int smetPrice) {
        int total = smetPrice * this.smet;
        if (type.equals("Cyberbricks")) {
            total *= 1.5;
        }
        if (type.equals("Carbonpanel")) {
            total *= 0.8;
        }

        return total;
    }
}
