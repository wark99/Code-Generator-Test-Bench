package com.example.demo.controllers;

import com.example.demo.models.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class AuthController {

    @PostMapping("/signup")
    public ResponseEntity<ApiResponse<String>> signUp(@RequestBody SignUpRequest signUpRequest) {
        // Implement sign up logic
        ApiResponse<String> response = new ApiResponse<>();
        response.setMessage("success signup");
        response.setData("access_token_and_refresh_token_here");
        return ResponseEntity.ok(response);
    }

    @PostMapping("/signin")
    public ResponseEntity<ApiResponse<String>> signIn(@RequestBody SignInRequest signInRequest) {
        // Implement sign in logic
        ApiResponse<String> response = new ApiResponse<>();
        response.setMessage("success signin");
        response.setData("access_token_and_refresh_token_here");
        return ResponseEntity.ok(response);
    }
}
