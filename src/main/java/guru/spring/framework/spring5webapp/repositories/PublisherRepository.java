package guru.spring.framework.spring5webapp.repositories;

import guru.spring.framework.spring5webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository <Publisher, Long>{

}
