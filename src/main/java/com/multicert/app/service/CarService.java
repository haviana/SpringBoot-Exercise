package com.multicert.app.service;

import com.multicert.app.models.Car;
import org.springframework.stereotype.Service;

import java.util.Hashtable;

@Service
public class CarService {
    Hashtable<Integer,Car> cars= new Hashtable<Integer, Car>();

    public CarService(Hashtable<Integer,Car> cars) {
        this.cars = cars;
    }
    public CarService() {
        Car car = new Car();
        car.setConsumo(1f);
        car.setMarca("Ford");
        car.setMatricula("10-92-BF");
        car.setModelo("KA");
        cars.put(1,car);

        Car car2 = new Car();
        car2.setConsumo(2f);
        car2.setMarca("Ford2");
        car2.setMatricula("11-92-BF");
        car2.setModelo("KA2");
        cars.put(2,car2);
    }
    public Car getCar(Integer id){
        if (cars.containsKey(id)){
            return cars.get(id);
        }
        return null;
    }
    public Hashtable<Integer,Car> getAll(){
        return cars;
    }
}
