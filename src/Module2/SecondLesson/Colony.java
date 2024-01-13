package Module2.SecondLesson;

import java.util.Arrays;
import java.util.List;

public class Colony {
    String name; //название
    int smetPrice; //стоимость за квадратный метр
    int apCount; //количество апартаментов
    Apartment[] aparts; //Список апартаментов

    public Colony(String name, int smetPrice, int apCount, Apartment[] aparts) {
        this.name = name;
        this.smetPrice = smetPrice;
        this.apCount = apCount;
        this.aparts = aparts;
    }


    public Apartment calculatePrice() {
        int min = aparts[0].calculateApartment(this.smetPrice);
        Apartment minAparts = aparts[0];
        for (Apartment apartment : aparts) {
            if (min > apartment.calculateApartment(this.smetPrice)) {
                minAparts = apartment;
                min = apartment.calculateApartment(this.smetPrice);
            }
        }

        return minAparts;
    }

    @Override
    public String toString() {
        Apartment minApart = this.calculatePrice();
        return minApart.title + " - " + minApart.calculateApartment(this.smetPrice) + " - " + this.name;
    }
}
