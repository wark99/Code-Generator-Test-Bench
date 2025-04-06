// AccountControllerTest.java

package com.example.bankingsystem.controller;

import com.example.bankingsystem.model.Account;
import com.example.bankingsystem.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AccountControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private AccountService accountService;

    // Test createAccount
    @Test
    public void testCreateAccount() throws Exception {
        Account account = new Account();
        account.setAccountNumber("123456789");
        account.setBalance(100.0);

        mockMvc.perform(post("/api/accounts")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(account)))
                .andExpect(status().isCreated());
    }

    // Test getAccounts
    @Test
    public void testGetAccounts() throws Exception {
        Account account = new Account();
        account.setAccountNumber("123456789");
        account.setBalance(100.0);

        mockMvc.perform(get("/api/accounts"))
                .andExpect(status().isOk())
                .andExpect(status().isOk());
    }

    // Test updateAccount
    @Test
    public void testUpdateAccount() throws Exception {
        Account account = new Account();
        account.setAccountNumber("123456789");
        account.setBalance(100.0);

        mockMvc.perform(post("/api/accounts")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(account)))
                .andExpect(status().isCreated());

        Account updatedAccount = new Account();
        updatedAccount.setAccountNumber("987654321");

        mockMvc.perform	put("/api/accounts/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(updatedAccount))
                .andExpect(status().isOk());
    }

    // Test deleteAccount
    @Test
    public void testDeleteAccount() throws Exception {
        Account account = new Account();
        account.setAccountNumber("123456789");
        account.setBalance(100.0);

        mockMvc.perform(post("/api/accounts")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(account)))
                .andExpect(status().isCreated());

        mockMvc.perform(delete("/api/accounts/1"))
                .andExpect(status().isOk());
    }

    private String asJsonString(Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

