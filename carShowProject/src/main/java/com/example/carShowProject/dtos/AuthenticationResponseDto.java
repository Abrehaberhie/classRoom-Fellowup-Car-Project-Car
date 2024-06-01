package com.example.carShowProject.dtos;

import lombok.Getter;

@Getter
public class AuthenticationResponseDto {
    private final String token;

    public AuthenticationResponseDto(String token) {
        this.token = token;
    }
}
