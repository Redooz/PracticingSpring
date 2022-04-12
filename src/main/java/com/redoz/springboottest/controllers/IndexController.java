package com.redoz.springboottest.controllers;

import com.redoz.springboottest.models.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/list")
    public String list(Model model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("JKL531","Fiat","500","Blue"));
        cars.add(new Car("KFO203","Chevrolet","Corsa","White"));
        cars.add(new Car("MCI104","Hyundai","i25","Green"));
        cars.add(new Car("FPS120","Tesla","Roadster","Red"));

        model.addAttribute("cars",cars);
        return "list";
    }

    @GetMapping("/requests")
    public String requests(){
        return "requests";
    }

    @GetMapping("/string")
    public String param(@RequestParam(defaultValue = "...")String text ,Model model){
        String msg = "Your message is "+(text);

        model.addAttribute("msg",msg);
        return "see";
    }
}
