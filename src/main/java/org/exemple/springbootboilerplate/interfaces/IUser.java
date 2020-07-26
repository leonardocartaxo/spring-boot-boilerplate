package org.exemple.springbootboilerplate.interfaces;

import org.exemple.springbootboilerplate.entities.User;

public interface IUser {
    public Iterable<User> findAll();
    public User save(User user);
}
