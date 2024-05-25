package com.example.inventory.controllers;

import com.example.inventory.models.Customer;
import com.example.inventory.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = customerRepository.save(customer);
        return ResponseEntity.status(201).body(savedCustomer);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Integer id) {
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.map(ResponseEntity::ok)
            .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(@PathVariable Integer id, @RequestBody Customer customerDetails) {
        return customerRepository.findById(id).map(customer -> {
            customer.setName(customerDetails.getName());
            customer.setEmail(customerDetails.getEmail());
            Customer updatedCustomer = customerRepository.save(customer);
            return ResponseEntity.ok(updatedCustomer);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Customer> partiallyUpdateCustomer(@PathVariable Integer id, @RequestBody Customer customerDetails) {
        return customerRepository.findById(id).map(customer -> {
            if (customerDetails.getEmail() != null) {
                customer.setEmail(customerDetails.getEmail());
            }
            Customer updatedCustomer = customerRepository.save(customer);
            return ResponseEntity.ok(updatedCustomer);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable Integer id) {
        return customerRepository.findById(id).map(customer -> {
            customerRepository.delete(customer);
            return ResponseEntity.ok().build();
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
