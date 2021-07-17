package com.example.springboot.repositories;

import com.example.springboot.entity.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalRepository extends CrudRepository<Animal, Integer> {

}
