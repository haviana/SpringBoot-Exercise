package com.multicert.app.controller;

import com.multicert.app.Entity.Car;
import com.multicert.app.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

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


    @GetMapping("/addCar")
    public String sendForm(Car car) {

        return "addCar";
    }

    @PostMapping("/addCar")
    public String processForm(Car car) {
        carRepository.save(car);
        return "showMessage";
    }

    @GetMapping("/delCar")
    public String sendDelForm(Car car) {

        return "delCar";
    }

    @PostMapping("/delCar/{id}")
    public String processDelForm(@PathVariable Integer id) {
       Car car = carRepository.findById(id).get();
        carRepository.delete(car);
        return "showDelMessage";
    }



}
