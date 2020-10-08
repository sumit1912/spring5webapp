package sumit.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import sumit.springframework.spring5webapp.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
