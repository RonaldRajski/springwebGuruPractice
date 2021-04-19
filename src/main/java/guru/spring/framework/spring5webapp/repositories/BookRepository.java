package guru.spring.framework.spring5webapp.repositories;

import guru.spring.framework.spring5webapp.Model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
