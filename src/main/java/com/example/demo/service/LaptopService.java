package com.example.demo.service;

import com.example.demo.model.Laptop;
import com.example.demo.model.User;
import com.example.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    @Autowired
    private UserService userService;

    public List<Laptop> findAll() {
        return laptopRepository.findAll();
    }

    public List<Laptop> findAllByLaptopName(String laptopName) {
        return laptopRepository.findAllByLaptopName(laptopName);
    }

    public Laptop laptop(Integer id) {


        if (laptopRepository.findById(id).isPresent()) {
            return laptopRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public List<Laptop> findAllByUser(Integer userId) {
        User user = userService.findById(userId);

//        if (user != null){
//            return laptopRepository.findAllByUser(user);
//        }
//        return Collections.emptyList();

        return user != null ? laptopRepository.findAllByUser(user) : Collections.emptyList();
    }

    public Laptop findById(Integer laptopId) {
        return laptopRepository.findById(laptopId).isPresent() ? laptopRepository.findById(laptopId).get() : null;
    }

    public boolean deleteLaptop(Integer laptopId) {
        Laptop laptop = findById(laptopId);
        if (laptop != null) {
            laptopRepository.delete(laptop);
            return true;
        }
        return false;
    }
}
