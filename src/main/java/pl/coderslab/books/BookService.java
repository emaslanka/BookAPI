package pl.coderslab.books;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    Book findBook(long id);

    Book addBook(Book book);

    List<Book> deleteBook(long id);

    Book updateBook(Book book);


}
