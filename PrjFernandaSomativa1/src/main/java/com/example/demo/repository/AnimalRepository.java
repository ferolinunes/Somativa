package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Animal;


public interface AnimalRepository extends JpaRepository<Animal, Long> {

}
