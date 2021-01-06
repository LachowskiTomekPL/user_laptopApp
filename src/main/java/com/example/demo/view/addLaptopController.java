package com.example.demo.view;

import com.example.demo.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addLaptopController {
    @Autowired
    private LaptopService laptopService;

    @GetMapping("addLaptop")
    public ModelAndView addLaptopGet(Integer userId, Model model){
        model.addAttribute("userId", userId);
        return new ModelAndView("addLaptop");
    }

    @PostMapping("addLaptop")
    public ModelAndView addLaptopPost(Integer userId, String laptopName, Double price){

        return new ModelAndView("redirect:addLaptop", "userId", userId);
    }
}
