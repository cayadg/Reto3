package com.example.reto3.Repository.CRUD;

import com.example.reto3.Model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarCrudRepository extends CrudRepository<Car, Integer> {
}
