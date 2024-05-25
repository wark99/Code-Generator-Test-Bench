package com.example.demo.controllers;

import com.example.demo.models.CustomerObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/get_user_id")
public class CustomerController {

    @PostMapping
    public ResponseEntity<CustomerObject> getCustomerDataByEmail(@RequestParam String email) {
        // Logic to retrieve customer data by email should be implemented here

        // For now, we return a dummy CustomerObject as a placeholder
        CustomerObject customer = new CustomerObject();
        customer.setEmail(email);
        customer.setFirstName("John");
        customer.setLastName("Doe");
        customer.setCustomerId(1L);
        customer.setAcceptsEmailMarketing("Yes");
        customer.setAddress1("123 Main St");
        customer.setCity("Anytown");
        customer.setProvince("Anystate");
        customer.setProvinceCode("AS");
        customer.setCountry("USA");
        customer.setCountryCode("US");
        customer.setZip("12345");
        customer.setPhone("555-1234");
        customer.setAcceptsSmsMarketing("No");
        customer.setTotalSpent(1000.0);
        customer.setTotalOrders(10);
        customer.setTaxExempt("No");

        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
