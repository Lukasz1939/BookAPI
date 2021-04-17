package pl.coderslab.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService implements BookService {
    private List<Book> bookList;

    public MockBookService() {
        bookList = new ArrayList<>();
        bookList.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        bookList.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        bookList.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }

    public List<Book> getBooks() {
        return bookList;
    }

    public Book bookById(Long id) {
        Book book = null;
        for (Book b : bookList) {
            if (b.getId() == id) {
                book = b;
            }
        }
        return book;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void editBook(Long id, String isbn, String title, String author, String publisher, String type) {
        for (Book b : bookList) {
            if (b.getId() == id) {
                b.setIsbn(isbn);
                b.setTitle(title);
                b.setAuthor(author);
                b.setPublisher(publisher);
                b.setType(type);
            }
        }
    }

    public Book deleteBook(Long id) {
        Book book = null;
        for (Book b : bookList) {
            if (id == b.getId()) {
                bookList.remove(b);
                book = b;
            }
        }
        return book;
    }
}