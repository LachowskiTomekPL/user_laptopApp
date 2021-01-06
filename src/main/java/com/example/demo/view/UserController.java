package com.example.demo.view;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // adres www.springTest.com/userList
    @GetMapping("userList")   // pobiera cos  z serwera
    public ModelAndView home(Model model) {

        model.addAttribute("userList", userService.findAll());

        return new ModelAndView("userList"); // nazwa html w templates
    }

    //@PostMapping // tworzy cos po stronie serwera

    //@PutMapping // aktualizuje cos po stronie serwera

    //@DeleteMapping // usuwa cos po stronie serwera
}
