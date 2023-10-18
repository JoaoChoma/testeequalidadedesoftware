import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryIntegrationTest {
    @Test
    public void testBookBorrowing() {
        Library library = new Library();
        Member member = new Member("John");
        Book book = new Book("The Great Gatsby");

        library.addBook(book);

        assertTrue(library.borrowBook(book)); // O livro deve ser emprestado com sucesso
        assertTrue(!book.isAvailable()); // O livro não deve estar disponível na biblioteca
        //assertTrue(member.borrowedBooks.contains(book)); // O membro deve ter o livro em sua lista de empréstimos

        // Tentativa de empréstimo de um livro já emprestado
        assertFalse(library.borrowBook(book)); // O livro não pode ser emprestado novamente

        // Devolução do livro
        member.returnBook(book);
        //assertTrue(book.isAvailable()); // O livro deve estar disponível novamente
        assertFalse(member.borrowedBooks.contains(book)); // O membro não deve mais ter o livro em sua lista de empréstimos
    }
}

