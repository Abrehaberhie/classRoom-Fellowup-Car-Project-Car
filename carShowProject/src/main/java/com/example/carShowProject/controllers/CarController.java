package com.example.carShowProject.controllers;

import com.example.carShowProject.dtos.CarDto;
import com.example.carShowProject.entities.Car;
import com.example.carShowProject.exceptions.CarNotFoundException;
import com.example.carShowProject.services.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/car")
@Profile(value = "dev")
public class CarController {
    @Autowired
    private CarService carService;




    @GetMapping("/list")
    public ResponseEntity<List<Car>> getAllCars(){
        return new ResponseEntity<>(carService.getAllCars(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable("id") Integer id) throws CarNotFoundException {
        return new ResponseEntity<>(carService.getCarById(id), HttpStatus.OK);
    }


    @PostMapping("/create")
    public ResponseEntity<Car> createCar(@Valid @RequestBody CarDto car){
        return new ResponseEntity<>(carService.createCar(car), HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<Car> updateCar(@PathVariable Integer id, @RequestBody Car updatedCar){
        return new ResponseEntity<>(carService.updateCar(id,updatedCar),HttpStatus.ACCEPTED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Long> deleteCar(@PathVariable Integer id){
        return new ResponseEntity<>(carService.deleteCar(id), HttpStatus.ACCEPTED);
    }


}
