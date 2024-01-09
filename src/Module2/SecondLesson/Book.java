package Module2.SecondLesson;

import Module2.Author;

public class Book {
    private String title;
    private Author author;
    private int publicationYear;


    public Book() {
    }

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book[" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publicationYear=" + publicationYear +
                ']';
    }
}