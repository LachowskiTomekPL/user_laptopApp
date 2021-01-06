package com.example.demo.view;

import com.example.demo.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LaptopController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping("laptopList")
    public ModelAndView laptopList(Integer userId, Model model) {
        model.addAttribute("laptopList", laptopService.findAllByUser(userId));
        return new ModelAndView("laptopList");
    }

}