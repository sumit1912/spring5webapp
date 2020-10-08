package sumit.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import sumit.springframework.spring5webapp.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
