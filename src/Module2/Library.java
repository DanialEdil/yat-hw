package Module2;

public class Library {
    private Book[] books;
    private int size;
    private int lastIndex;


    public Library(int size) {
        books = new Book[size + 1];
        this.size = size;
        lastIndex = 0;
    }

    public void addBook(Book book) {
        if (book == null) {
            System.out.println("Book is null");
            return;
        }
        if (lastIndex >= size) {
            System.out.println("Library is full");
            return;
        }

        books[lastIndex++] = book;
    }

    public void displayBooks() {
        for (int i = 0; i < lastIndex; i++) {
            System.out.println(books[i]);
        }
    }
}
