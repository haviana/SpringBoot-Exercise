package com.multicert.app.Repository;

import com.multicert.app.Entity.Car;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomCarRepository extends CrudRepository<Car, Integer> {
    List<Car> findByMarca(String marca);
}
