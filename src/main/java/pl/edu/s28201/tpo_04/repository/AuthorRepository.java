package pl.edu.s28201.tpo_04.repository;

import org.springframework.data.repository.CrudRepository;
import pl.edu.s28201.tpo_04.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
