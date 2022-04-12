package com.redoz.springboottest.controllers;

import com.redoz.springboottest.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(Model model, Car car){
        car.setLicensePlate("ABC123");
        car.setBrand("Ford");
        car.setName("Explorer");
        car.setColor("Black");

        model.addAttribute("car",car);
        return "index";
    }
}
