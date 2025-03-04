package main.java.com.controllers;

import main.java.com.persistence.UsersRepository;
import main.java.com.exceptions.UserAlreadyExistsException;
import main.java.com.services.UserService;

public class UserController {
    private UsersRepository usersRepository;
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    public void addUser(String name, char gender, int age) throws UserAlreadyExistsException {
        userService.addUser(name, gender, age);
//        User user = new User(name,gender,age);
//        usersManager.addUser(user);
    }

    public void printStats() {
        userService.printStats();
    }
}
