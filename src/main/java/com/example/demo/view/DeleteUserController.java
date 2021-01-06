package com.example.demo.view;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeleteUserController {

    @Autowired
    private UserService userService;

    @PostMapping("deleteUser")
    public ModelAndView deleteUser(Integer userId){
        userService.deleteUser(userId);
        return new ModelAndView("redirect:userList");
    }
}
