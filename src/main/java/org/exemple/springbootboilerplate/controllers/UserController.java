package org.exemple.springbootboilerplate.controllers;

import org.exemple.springbootboilerplate.interfaces.IUser;
import org.exemple.springbootboilerplate.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(path = "api/users")
public class UserController {

    private final IUser userService;

    public UserController(IUser userService) {
        this.userService = userService;
    }

    @GetMapping("/findAll")
    public Iterable<User> findAll() {
        return userService.findAll();
    }

    @PostMapping()
    public User save(@RequestBody User user) {
        return userService.save(user);
    }
}
