package com.multicert.app.controller;

import com.multicert.app.Entity.Car;
import com.multicert.app.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/findCarTest")
    public String findCarTest() {
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String submit(@ModelAttribute("car") Car car, Model model) {
        Car car1 = new Car("01-02-FD","Ford","Ka",1);
        carRepository.save(car1);
        model.addAttribute("cars",carRepository.findAll());
        return "index";
    }

    @GetMapping("/addUser")
    public String sendForm(Car car) {

        return "addUser";
    }

    @PostMapping("/addUser")
    public String processForm(Car car) {
        carRepository.save(car);
        return "showMessage";
    }

}
