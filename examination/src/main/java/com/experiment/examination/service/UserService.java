package com.experiment.examination.service;

import com.experiment.examination.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<? extends User> findAllUsers();

    <T extends User> T findUserByUserId(Long userId);

    <T extends User> void createNewUser(T user);

    <T extends User> void updateUsername(Long userId, T user);

    void deleteUser(Long userId);

    void deleteAllUsers();
}
