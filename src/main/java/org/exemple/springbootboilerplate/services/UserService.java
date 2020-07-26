package org.exemple.springbootboilerplate.services;

import org.exemple.springbootboilerplate.interfaces.IUser;
import org.exemple.springbootboilerplate.entities.User;
import org.exemple.springbootboilerplate.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUser {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }
}
