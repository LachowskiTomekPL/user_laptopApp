//package com.example.demo.service;
//
//import com.example.demo.model.Laptop;
//import com.example.demo.model.User;
//import com.example.demo.repository.LaptopRepository;
//import com.example.demo.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.PostConstruct;
//import java.util.Collections;
//
//@Service
//public class InitDataLoaderService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    private LaptopRepository laptopRepository;
//
////    @Autowired
////    private LaptopRepository
//
//    @PostConstruct
//    public void initialize() {
//        // Users
//        User user = new User(null, "user1", "user1", Collections.emptyList());
//        userRepository.save(user);
//
//        user = new User(null, "user2", "user2", Collections.emptyList());
//        userRepository.save(user);
//
//        user = new User(null, "user3", "user3", Collections.emptyList());
//        userRepository.save(user);
//
//        user = new User(null, "user4", "user4", Collections.emptyList());
//        userRepository.save(user);
//
//        userRepository.save(new User(null, "user5", "user5", Collections.emptyList()));
//
//        // Laptops
//        Laptop laptop = new Laptop(null, "latop1", 200, user);
//        laptopRepository.save(laptop);
//
//        laptopRepository.save(new Laptop(null, "latop2", 450, user));
//
//        laptopRepository.save(new Laptop(null, "latop3", 500, user));
//
//        laptopRepository.save(new Laptop(null, "latop4", 999, user));
//    }
//}
