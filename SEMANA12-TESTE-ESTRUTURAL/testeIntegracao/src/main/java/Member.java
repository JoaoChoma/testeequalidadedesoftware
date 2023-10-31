import java.util.ArrayList;
import java.util.List;

// Classe Member representa um membro da biblioteca
public class Member {
    private String name;
    List<Book> borrowedBooks;

    public Member(String name) {
        this.name = name;
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}