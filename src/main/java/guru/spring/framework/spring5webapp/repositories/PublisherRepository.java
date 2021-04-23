package guru.spring.framework.spring5webapp.repositories;

import guru.spring.framework.spring5webapp.Model.Book;
import guru.spring.framework.spring5webapp.Model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher, Long>{

}
