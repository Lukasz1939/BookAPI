package pl.coderslab.dao;


import pl.coderslab.entity.Book;

import java.util.List;

public interface BookService {
    public List<Book> getBooks();
    public Book get(Long id);
    public void add(Book book);
    public void delete(Long id);
    public void update(Book book);
}
