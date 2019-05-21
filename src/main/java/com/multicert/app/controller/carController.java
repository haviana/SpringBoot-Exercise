package com.multicert.app.controller;

import com.multicert.app.Entity.Car;
import com.multicert.app.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@CrossOrigin
@RestController
public class carController {


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
        return "Bem Vindo!";
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Car> deleteCar(@PathVariable(value = "id") Integer id) {
        Car car = carRepository.findById(id).get();

        carRepository.delete(car);

        return ResponseEntity.ok().build();
    }


    @PostMapping("/add")
    public Car createCar(@Valid @RequestBody Car car) {
        return carRepository.save(car);
    }
}
