package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dao.BookService;
import pl.coderslab.dao.JpaBookService;
import pl.coderslab.entity.Book;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    private BookService bookService;

    public BookController(BookService jpaBookService) {
        this.bookService = jpaBookService;
    }


    @RequestMapping("/helloBook")
    public String helloBook() {
        bookService.add(new Book("9788324631766", "Thinking in Java", "Bruce Eckel",
                "Helion", "programming"));
        return "/all";
    }
    @GetMapping("/home")
    public String home() {
        return "/books/home";
    }
    @GetMapping("/all")
    public String showBooks() {
        List<Book> books = bookService.getBooks();
        return "/books/all";
    }
    @GetMapping("/get/{id}")
    public String getBook(@PathVariable long id, Model model){
        List<Book> book = new ArrayList<>();
        book.add(bookService.get(id));
        model.addAttribute("book", book);
        return "/books/oneBook";
    }
    @GetMapping("add")
    public String addBookGet(Model model){
        model.addAttribute("book", new Book());
        return "/books/form";
    }
    @PostMapping("add")
    public String addBook(@ModelAttribute Book book) {
        bookService.add(book);
        return "books/home";
    }

    @GetMapping("/edit/{id}")
    public String editBookGet(@PathVariable long id, Model model){
        Book toEdit = bookService.get(id);
        model.addAttribute("book", toEdit);
        return "/books/form";
    }

    @PostMapping("edit/{id}")
    public String editBook(@ModelAttribute Book book) {
        bookService.update(book);
        return "books/home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id){
        bookService.delete(id);
        return "books/home";
    }

    @ModelAttribute("books")
    public List<Book> books(){
        List<Book> books = bookService.getBooks();
        return books;
    }
}
