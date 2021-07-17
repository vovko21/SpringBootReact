package com.example.springboot.loader;

import com.example.springboot.entity.Animal;
import com.example.springboot.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final AnimalRepository animalRepository;

    @Autowired
    public DatabaseLoader(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Override
    public void run(String... args) throws Exception{
        if(this.animalRepository.count() == 0){
            this.animalRepository.save(new Animal("Dog"));
            this.animalRepository.save(new Animal("Cat"));
            this.animalRepository.save(new Animal("Krol"));
        }
    }
}
