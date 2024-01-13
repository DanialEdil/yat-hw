package Module2.FirstLesson;

public class Book2 {
    String name;
    int price;
    String type;
    int sold;


    public Book2(String name, int price, String type, int sold) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.sold = sold;
    }


    public int calculateTotalPrice() {
        int total = 0;
        int base = 0;

        if (type.equals("Classical")) {
            if (sold > 50) {
                base = sold - 50;
                sold -= base;
            }
            int priceDiscount = (price * 20) / 100;
            total += sold * (price - priceDiscount);
            total += base * price;
        } else if (type.equals("Simple")) {
            if (sold > 50) {
                base = sold - 50;
                sold -= base;
            }

            total += sold * price;
            price += (price * 20) / 100;
            total += base * price;
        }

       return total;
    }


}
