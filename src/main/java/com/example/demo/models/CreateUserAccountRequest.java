package com.example.demo.models;

import javax.validation.constraints.NotBlank;

public class CreateUserAccountRequest {

    @NotBlank
    private String accountName;

    @NotBlank
    private String accountType;

    // Getters and Setters
}
