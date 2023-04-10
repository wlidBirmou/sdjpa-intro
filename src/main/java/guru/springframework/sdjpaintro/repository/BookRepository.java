package guru.springframework.sdjpaintro.repository;

import guru.springframework.sdjpaintro.domain.Book;
import jakarta.persistence.EntityManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {


}
