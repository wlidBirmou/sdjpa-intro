package guru.springframework.sdjpaintro;

import guru.springframework.sdjpaintro.domain.Book;
import guru.springframework.sdjpaintro.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner  {

    private BookRepository bookRepository;


    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public BookRepository getBookRepository() {
        return bookRepository;
    }
    @Override
    public void run(String... args) throws Exception {
        Book book1=new Book(" first book title","123345","publisher1");
        Book book2=new Book(" second book title","1233fdsf45","publisher2");

        System.out.println(book1.toString());
        this.bookRepository.save(book1);
        this.bookRepository.save(book2);
        System.out.println(book1.toString());
        System.out.println("###########################################");
        this.bookRepository.findAll().forEach(s->System.out.println(s.toString()));
    }
}
