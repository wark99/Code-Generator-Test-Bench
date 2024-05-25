package com.example.demo.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class WithdrawRequest {

    @NotNull
    private Double amountTransfer;

    @NotBlank
    private String currency;

    @NotBlank
    private String fromAccountCode;

    @NotBlank
    private String targetAccountCode;

    // Getters and Setters
}
