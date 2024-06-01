package com.example.carShowProject.dtos;

import com.example.carShowProject.entities.Owner;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CarDto {

    @NotNull(message = "Brand should not be null")
    private String brand;
    @NotNull(message = "Model should not be null")
    private String model;
    @NotNull(message = "Color should not be null")
    private String color;
    private String registerNumber;
    @NotNull(message = "Year should not be null")
    @Min(value = 1990, message = "Year should not be less than 1990")
    private int year;
    private double price;
    private Owner owner;
}
