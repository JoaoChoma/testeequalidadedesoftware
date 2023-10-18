import java.util.ArrayList;
import java.util.List;

// Classe Library representa a biblioteca
public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrowBook();
            return true;
        } else {
            return false;
        }
    }
}