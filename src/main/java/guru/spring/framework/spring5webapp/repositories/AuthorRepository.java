package guru.spring.framework.spring5webapp.repositories;

import guru.spring.framework.spring5webapp.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
