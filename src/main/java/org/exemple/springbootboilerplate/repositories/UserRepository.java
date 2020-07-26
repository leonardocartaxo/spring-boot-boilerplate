package org.exemple.springbootboilerplate.repositories;

import org.exemple.springbootboilerplate.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
