package com.example.reto3.Repository.CRUD;

import com.example.reto3.Model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}