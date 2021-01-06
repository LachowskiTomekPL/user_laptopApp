package com.example.demo.view;

import com.example.demo.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DeleteLaptopController {

    @Autowired
    private LaptopService laptopService;

    @PostMapping("deleteLaptop")
    public ModelAndView deleteLaptopPost(Integer userId, Integer laptopId) {

        laptopService.deleteLaptop(laptopId);

        return new ModelAndView("redirect:laptopList", "userId", userId);
//        return new ModelAndView("redirect:laptopList");
    }
}
