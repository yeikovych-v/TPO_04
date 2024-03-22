package pl.edu.s28201.tpo_04.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import pl.edu.s28201.tpo_04.model.Book;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

    @NonNull
    List<Book> findAll();
}
