package com.experiment.examination.controller;

import com.experiment.examination.entity.Person;
import com.experiment.examination.entity.User;
import com.experiment.examination.service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    List<? extends User> getUsers() {
        return userService.findAllUsers();
    }

//    @GetMapping("/user")
//    <T extends User> T getUser(@Validated @RequestParam(value = "userId", defaultValue = "1") Long userId) {
//        return userService.findUserByUserId(userId);
//    }

    @GetMapping("/users/{userId}")
    <T extends User> T getUser(@PathVariable("userId") Long userId) {
        return userService.findUserByUserId(userId);
    }

    @PostMapping("/users")
    void createUser(@NotNull @RequestBody Person person) {
        userService.createNewUser(person);
    }

    @PutMapping("/users/{userId}")
    void updateUsername(@PathVariable("userId") Long userId, @NotNull @RequestBody Person person) {
        System.out.format("Username: %s - UserId: %d", person.getPersonName(), userId);
        userService.updateUsername(userId, person);
    }

    @DeleteMapping("/users/{userId}")
    void deleteUser(@PathVariable(value = "userId") Long userId) {
        userService.deleteUser(userId);
    }

}
