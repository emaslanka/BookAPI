package pl.coderslab.controllers;

import org.springframework.web.bind.annotation.*;
import pl.coderslab.books.Book;
import pl.coderslab.books.BookService;
import pl.coderslab.books.MemoryBookService;

import java.util.List;


@RequestMapping("/books")
@RestController
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/helloBook")
    @ResponseBody
    public Book helloBook() {
        return new Book(1L, "9788324631766", "Thinking in Java",
                "Bruce Eckel", "Helion", "programming");
    }

    @GetMapping("")
    @ResponseBody

    public List<Book> getList() {

        return bookService.getBooks();

    }

    @GetMapping("/{id}")
    @ResponseBody
    public Book getBook(@PathVariable int id) {
        return bookService.findBook(id);

    }


    @PostMapping("")
    public Book getAndAdd(@RequestParam String isbn, @RequestParam String title, @RequestParam String author , @RequestParam String publisher, @RequestParam String type ){
        return bookService.addBook(isbn,title,author,publisher,type);
    }


    @DeleteMapping("/{id}")
    public List<Book> deleteBook(@PathVariable int id){

        return bookService.deleteBook(id);
    }
}

