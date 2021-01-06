package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public List<User> findAllByFirstName(String firstName) {
        return userRepository.findAllByFirstName(firstName);
    }

    public User user(Integer id) {
//        return userRepository.findById(id).isPresent() ? userRepository.findById(id).get() : null;

        if (userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public boolean addUser(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty() && lastName != null && !lastName.isEmpty()) {
            User user = new User(null, firstName, lastName, Collections.emptyList());
            userRepository.save(user);
            return true;
        }
        return false;
    }

    public User findById(Integer userId) {
        return userRepository.findById(userId).isPresent() ? userRepository.findById(userId).get() : null;
    }

    public boolean deleteUser(Integer userId) {
        User user = findById(userId);
        if (user != null) {
            userRepository.delete(user);
            return true;
        }
        return false;
    }

    public User editUser(Integer userId, String firstName, String lastName){
        User user = findById(userId);
        if (user != null){
            user.setFirstName(firstName);
            user.setLastName(lastName);
            userRepository.save(user);
        }
        return user;
    }
}
