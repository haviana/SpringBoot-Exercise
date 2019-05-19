package com.multicert.app.controller;

import com.multicert.app.Entity.Car;
import com.multicert.app.Entity.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/cars")
public class carController {
    /*@Autowired
    CarService cService;*/

    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private CarRepository carRepository;


    @GetMapping("/all")
    public Iterable<com.multicert.app.Entity.Car> getAll(){
        return carRepository.findAll();
    }

    @RequestMapping("{id}")
    public Optional<Car> getCar(@PathVariable final Integer id){

        return carRepository.findById(id);
    }
    @RequestMapping("/")
    public String home(){
        return "Hello World!";
    }
    @PostMapping("/")
    public String processForm(CarRepository car) {

        return "showMessage";
    }
    @GetMapping("/findCar")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Car());
        return "greeting";
    }

    @PostMapping("/findCar")
    public String greetingSubmit(@ModelAttribute Car car) {
        return "result";
    }

}
