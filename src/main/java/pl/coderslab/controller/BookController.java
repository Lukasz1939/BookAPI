package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.entity.Book;
import pl.coderslab.repository.BookRepository;

import javax.persistence.EntityManager;
import java.util.List;

@Transactional
@RestController
@RequestMapping("/books")
public class BookController {
    private EntityManager em;
    private BookRepository br;



    @RequestMapping("/helloBook")
    @ResponseBody
    public String helloBook() {
        em.persist(new Book("9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        return "hello";
    }
    @GetMapping("")
    public List<Book> allBooks(){
        return br.findAll();
    }

    @GetMapping("/{id}")
    public Book book(@PathVariable("id") long id){
        return br.findBookById(id);
    }

    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        em.persist(book);
    }
    @PutMapping
    @ResponseBody
    public void updateBook(@RequestBody Book book){
        em.merge(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id){
        Book toDel = br.findBookById(id);
        em.remove(em.contains(toDel)?toDel:em.merge(toDel));
    }
}
