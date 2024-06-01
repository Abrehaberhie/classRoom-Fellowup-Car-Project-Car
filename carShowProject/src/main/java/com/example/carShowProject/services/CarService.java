package com.example.carShowProject.services;

import com.example.carShowProject.dtos.CarDto;
import com.example.carShowProject.entities.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars();
    public Car  createCar(CarDto car);
    public Car updateCar(long id, Car updatedCar);
    public long deleteCar(long id);
    public Car getCarById(long id);
}

