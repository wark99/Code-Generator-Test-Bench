package com.example.demo.controllers;

import com.example.demo.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class TransactionController {

    @PostMapping("/send")
    public ResponseEntity<ApiResponse<String>> send(@RequestBody SendRequest sendRequest) {
        // Implement send logic
        ApiResponse<String> response = new ApiResponse<>();
        response.setMessage("success send");
        response.setData("current_balance_and_last_balance_here");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/withdraw")
    public ResponseEntity<ApiResponse<String>> withdraw(@RequestBody WithdrawRequest withdrawRequest) {
        // Implement withdraw logic
        ApiResponse<String> response = new ApiResponse<>();
        response.setMessage("success withdraw");
        response.setData("current_balance_and_last_balance_here");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/transactions")
    public ResponseEntity<ApiResponse<List<Transaction>>> getTransactions(
        @RequestParam(required = false) String startDate,
        @RequestParam(required = false) String endDate,
        @RequestParam(required = false) String status,
        @RequestParam(required = false) String transactionType) {
        // Implement get transactions logic
        ApiResponse<List<Transaction>> response = new ApiResponse<>();
        response.setMessage("success get transactions");
        response.setData("transactions_here");
        return ResponseEntity.ok(response);
    }
}
