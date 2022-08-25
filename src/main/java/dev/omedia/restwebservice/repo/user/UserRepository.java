package dev.omedia.restwebservice.repo.user;

import dev.omedia.restwebservice.model.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
