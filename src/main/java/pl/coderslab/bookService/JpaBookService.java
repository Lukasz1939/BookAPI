//package pl.coderslab.bookService;
//
//import pl.coderslab.repository.BookRepository;
//
//import javax.persistence.EntityManager;
//import javax.transaction.Transactional;
//import java.awt.print.Book;
//@Transactional
//public class JpaBookService implements BookService{
//    private BookRepository bookRepository;
//    private EntityManager em;
//
//    @Override
//    public Book get(Long id) {
//        return bookRepository.findBookById(id);
//    }
//
//    @Override
//    public void add(Book book) {
//        em.persist(book);
//    }
//
//    @Override
//    public void delete(Long id) {
//    Book toDel = bookRepository.findBookById(id);
//    em.remove(toDel);
//    }
//
//    @Override
//    public void update(Book book) {
//
//    }
//}
