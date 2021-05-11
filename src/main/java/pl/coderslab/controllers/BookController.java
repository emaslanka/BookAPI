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
    public Book addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }




    @DeleteMapping("/{id}")
    public List<Book> deleteBook(@PathVariable int id){
        return bookService.deleteBook(id);

    }

    @PutMapping("")
    public Book updateBook(@RequestBody Book book){
        System.out.println(book);
        bookService.updateBook(book);
        return book;

    }
}

