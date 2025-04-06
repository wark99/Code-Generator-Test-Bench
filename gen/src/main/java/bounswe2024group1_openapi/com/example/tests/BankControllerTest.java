package com.example.tests;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.example.models.Account;
import com.example.models.AccountOpeningTransaction;
import com.example.models.Transaction;

public class BankControllerTest {

    @Mock(JPAModel["com.example.models.Account"])
    private Account account;

    @Mock(com.example.models.AccountOpeningTransaction)
    private AccountOpeningTransaction accountOpeningTransaction;

    @Mock(JPAModel["com.example.models.Transaction"])
    private Transaction transaction;

    // Test for initializing an account
    @Test
    public void testInitializeAccount() throws Exception {
        when(BankController).initializeAccountthenReturn(account);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("accountNumber", "123456789");
        parameters.put("name", "John Doe");
        parameters.put("balance", 1000);
        parameters.put("type", "Savings");

        BankController.initializeAccount(new BankRequest(parameters));

        assertNotNull(account);
    }

    // Test for deleting an account
    @Test
    public void testDeleteAccount() throws Exception {
        when(BankController).deleteAccountthenReturn(null);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("accountNumber", "123456789");
        BankController.deleteAccount(new BankRequest(parameters));

        assertNull(account);
    }

    // Test for adding a transaction
    @Test
    public void testAddTransaction() throws Exception {
        when(TransactionController).addTransactionthenReturn(transaction);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("sourceId", "123");
        parameters.put("destinationId", "456");
        parameters.put("amount", 100);
        parameters.put("description", "Test Transaction");

        TransactionController.addTransaction(new TransactionRequest(parameters));

        assertNotNull(transaction);
    }

    // Test for removing a transaction
    @Test
    public void testRemoveTransaction() throws Exception {
        when(TransactionController).removeTransactionthenReturn(null);

        Map<String, Object> parameters = new HashMap<>();
        parameters.put("sourceId", "123");
        parameters.put("destinationId", "456");
        parameters.put("amount", 100);
        parameters.put("description", "Test Transaction");

        TransactionController.removeTransaction(new TransactionRequest(parameters));

        assertNull(transaction);
    }
}

