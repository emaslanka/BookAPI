package pl.coderslab.books;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Component
public class MemoryBookService implements BookService {


    private List<Book> list;
    private static Long nextId = 4L;

    public MemoryBookService() {
        list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thiniking	in	Java", "Bruce	Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9788324627738", "Rusz	glowa	Java.", "Sierra	Kathy,	Bates	Bert", "Helion",
                "programming"));
        list.add(new Book(3L, "9780130819338", "Java	2.	Podstawy", "Cay	Horstmann,	Gary	Cornell", "Helion",
                "programming"));
    }



    @GetMapping
    public List<Book> getBooks(){

      return this.list;
    };

    @Override
    public Book findBook(int id){
    Book toFind = null;

        for (Book b:this.list
             ) {
            if(b.getId()== id){
                toFind=b;
            }
        }
        return toFind;
    };



    @Override
    public Book addBook(String isbn, String title, String author, String publisher,String type ) {

        Book b = new Book(this.nextId, isbn,title,author,publisher,type);
        list.add(b);
        this.nextId = this.nextId + 1;

        return b;
    }


    @Override
    public  List<Book> deleteBook(int id){
        Book toDelete = findBook(id);
        list.remove(toDelete);

        return list;


    }

    @Override
    public Book updateBook(int id,String isbn, String title, String author, String publisher,String type) {

        Book toUpdate = findBook(id);
        toUpdate.setIsbn(isbn);
        toUpdate.setTitle(title);
        toUpdate.setAuthor(author);
        toUpdate.setPublisher(publisher);
        toUpdate.setType(type);

        return toUpdate;
    }








}
