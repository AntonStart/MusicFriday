package com.example.webappv1.controllers;

import com.example.webappv1.dao.UserDao;
import com.example.webappv1.entities.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    Logger logger = LoggerFactory.getLogger("userController");

    private final UserDao userDao;

    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping
    public List<User> getAll(){
        return userDao.getAll();
    }

    @GetMapping("/{id}")
    public User getUserToId(@PathVariable Integer id){
        User user = userDao.getUserToId(id);
        return user;
    }

    @PostMapping("/add")
    public int addUser(@RequestBody User user) {
        if (userDao.getAllEmails().contains(user.getEmail())) {
            return 0;
        } else return userDao.addUser(user.getName(), user.getEmail());
    }

    @DeleteMapping("/delete/{id}")
    public int deleteToId(@PathVariable Integer id) {
        return userDao.deleteToId(id);
    }
}
