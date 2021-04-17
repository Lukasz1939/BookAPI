package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.model.Book;
import pl.coderslab.model.BookService;
import pl.coderslab.model.MockBookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private BookService mBS;
    @Autowired
    public BookController(BookService bs){
        this.mBS = bs;
    }
    @RequestMapping("/helloBook")
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming");
    }
    @GetMapping("")
    public List<Book> allBooks(){
        return mBS.getBooks();
    }
}
