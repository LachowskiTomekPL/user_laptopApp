package com.example.demo.view;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddUserController {

    @Autowired
    private UserService userService;

    @GetMapping("addUser")
    public ModelAndView addUserGet(){
        return new ModelAndView("addUser"); // zwraca html
    }

    @PostMapping("addUser")
    public ModelAndView addUserPost(String firstName, String lastName){
        userService.addUser(firstName, lastName);
        return new ModelAndView("addUser");
    }
}
