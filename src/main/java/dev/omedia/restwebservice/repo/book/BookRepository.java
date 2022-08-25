package dev.omedia.restwebservice.repo.book;

import dev.omedia.restwebservice.model.book.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
}
