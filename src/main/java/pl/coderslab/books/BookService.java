package pl.coderslab.books;

import java.util.List;

public interface BookService {

    List<Book> getBooks();

    Book findBook(int id);

    Book addBook(String isbn, String title, String author, String publisher,String type);

    List<Book> deleteBook(int id);

    Book updateBook(int id,String isbn, String title, String author, String publisher,String type);


}
