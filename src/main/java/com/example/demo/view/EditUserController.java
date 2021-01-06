package com.example.demo.view;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EditUserController {

    @Autowired
    private UserService userService;

    @GetMapping("editUser")
    public ModelAndView editUser(Integer userId, Model model){
        model.addAttribute("user", userService.findById(userId));
        return new ModelAndView("editUser");
    }

    @PostMapping("editUser")
    public ModelAndView editUser(Integer userId, String firstName, String lastName){
        userService.editUser(userId, firstName, lastName);
        return new ModelAndView("redirect:editUser", "userId", userId);
    }
}
