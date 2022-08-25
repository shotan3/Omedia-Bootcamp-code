package dev.omedia.restwebservice.controller;

import dev.omedia.restwebservice.config.datasource.book.BookJpaProperties;
import dev.omedia.restwebservice.model.user.User;
import dev.omedia.restwebservice.repo.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RestController
public class UserController {
    @Autowired
    UserRepository repository;

    @PersistenceContext(unitName = BookJpaProperties.UNIT_NAME)
    EntityManager em;

    @PostMapping("/user")
    void post(@RequestBody User user) {
        repository.save(user);
    }

    @GetMapping("/user")
    Object getAll() {
        return em.createQuery("from book s").getResultList();
    }

}
