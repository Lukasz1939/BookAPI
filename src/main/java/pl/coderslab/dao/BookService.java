package pl.coderslab.bookService;

import java.awt.print.Book;

public interface BookService {
    public Book get(Long id);
    public void add(Book book);
    public void delete(Long id);
    public void update(Book book);
}
