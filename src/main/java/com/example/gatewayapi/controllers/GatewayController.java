package com.example.gatewayapi.controllers;

import com.example.gatewayapi.models.GatewayBody;
import com.example.gatewayapi.models.NewsletterResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/email")
public class GatewayController {

    @PostMapping("/newsletter")
    public ResponseEntity<NewsletterResponse> sendMonthlyNewsletterByEmail(@RequestBody GatewayBody gatewayBody) {
        NewsletterResponse response = new NewsletterResponse();
        try {
            // Simulating processing of the request
            String messageHash = "a95582bcff5be7bd1613350681160406673498ca9ddad51aa97d16cd7b3ca221";
            response.setUserId(gatewayBody.getUserId());
            response.setMessageHash(messageHash);
            response.setErrorMessage("");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setErrorMessage("An error occurred while processing the request.");
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
