package com.example.reto3.Repository.CRUD;

import com.example.reto3.Model.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer> {
}
