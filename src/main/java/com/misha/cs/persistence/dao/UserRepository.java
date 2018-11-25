package com.misha.cs.persistence.dao;

import org.springframework.data.repository.CrudRepository;
import com.misha.cs.persistence.model.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findById(Long id);

    User save(User user);

    void deleteById(Long id);

    boolean existsById(Long id);
}
