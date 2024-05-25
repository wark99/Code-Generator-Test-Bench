package com.example.demo.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class SignInRequest {

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String password;

    // Getters and Setters
}
