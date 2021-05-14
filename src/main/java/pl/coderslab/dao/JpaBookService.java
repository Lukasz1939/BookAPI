package pl.coderslab.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import pl.coderslab.dao.BookService;
import pl.coderslab.entity.Book;
import pl.coderslab.repository.BookRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Primary
@Repository
public class JpaBookService implements BookService {
    private final BookRepository bookRepository;
    @PersistenceContext
    private EntityManager entityManager;

    public JpaBookService(BookRepository bookRepository, EntityManager entityManager) {
        this.bookRepository = bookRepository;
        this.entityManager = entityManager;
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }


    @Override
    public Book get(Long id) {
        return bookRepository.findBookById(id);
    }

    @Transactional
    @Override
    public void add(Book book) {
        entityManager.persist(book);
    }

    @Transactional
    @Override
    public void delete(Long id) {
    Book toDel = bookRepository.findBookById(id);
    entityManager.remove(toDel);
    }

    @Transactional
    @Override
    public void update(Book book) {
    entityManager.merge(book);
    }
}
