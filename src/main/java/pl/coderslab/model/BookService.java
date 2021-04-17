package pl.coderslab.model;

import java.util.List;

public interface BookService {
    List<Book> getBooks();
    Book bookById(Long id);
    void addBook(Book book);
    void editBook(Long id, String isbn, String title, String author, String publisher, String type);
    Book deleteBook(Long id);
}
