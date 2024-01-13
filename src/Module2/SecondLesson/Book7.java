package Module2.SecondLesson;

import java.util.Arrays;

public class Book7 {


    private String name;
    private Author[] author;
    private double price;
    private int qty;


    public Book7(String name, Author[] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book7(String name, Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author[] getAuthor() {
        return author;
    }

    public void setAuthor(Author[] author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public String getAuthorNames() {
        String result = "";

        for (Author author1 : author) {
            result += author1.getName() + ", ";
        }

        return result;
    }


    @Override
    public String toString() {
        return "Book[" + "name='" + name + '\'' + ", authors{" + Arrays.toString(author) + "}, price=" + price + ", qty=" + qty + ']';
    }

}
