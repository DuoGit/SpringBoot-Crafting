package com.experiment.examination.service.impl;

import com.experiment.examination.dao.UserDao;

import com.experiment.examination.entity.Person;
import com.experiment.examination.entity.User;
import com.experiment.examination.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Primary
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public List<? extends User> findAllUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserByUserId(Long userId) {
        return userDao.findById(userId).orElseThrow(RuntimeException::new);
    }

    @Override
    public <T extends User> void  createNewUser(T user) {
        userDao.save((Person) user);
    }

    @Override
    public <T extends User> void updateUsername(Long userId, T user) {
        String newUsername = ((Person) user).getPersonName();
        Person person = (Person) findUserByUserId(userId);
        person.setPersonName(newUsername);
        userDao.save(person);
    }

    @Override
    public void deleteUser(Long userId) {
        userDao.deleteById(userId);
    }

    @Override
    public void deleteAllUsers() {
        userDao.deleteAll();
    }
}
