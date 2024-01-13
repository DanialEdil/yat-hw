package Module2.FirstLesson;

public class Book1 {
    String name;
    String author;
    Double price;
    String type;/// may be “Simple”, “Classical”, “Bestseller”

    public Book1(String name, String author, Double price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public void calculatePriceBook() {
        if (this.type.equals("Classical")) {
            this.price -= (this.price * 10) / 100;
        }

        if (this.type.equals("Bestseller")) {
            this.price += (this.price * 20) / 100;
        }
    }

    @Override
    public String toString() {
        return name + " " + author + " " + price;
    }
}
