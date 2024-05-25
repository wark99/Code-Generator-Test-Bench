package com.example.demo.controllers;

import com.example.demo.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class AccountController {

    @PostMapping("/user/accounts")
    public ResponseEntity<ApiResponse<String>> createUserAccount(@RequestBody CreateUserAccountRequest request) {
        // Implement create user account logic
        ApiResponse<String> response = new ApiResponse<>();
        response.setMessage("success create account");
        response.setData("account_info_here");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/accounts")
    public ResponseEntity<ApiResponse<List<Account>>> getAccounts(
        @RequestParam(required = false) String startDate,
        @RequestParam(required = false) String endDate,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) String accountType) {
        // Implement get accounts logic
        ApiResponse<List<Account>> response = new ApiResponse<>();
        response.setMessage("success get accounts");
        response.setData("accounts_here");
        return ResponseEntity.ok(response);
    }
}
