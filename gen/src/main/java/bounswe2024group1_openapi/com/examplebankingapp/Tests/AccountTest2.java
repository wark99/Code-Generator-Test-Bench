<<<<<<< SEARCH
=======
package com.examplebankingapp.Tests;

import com.examplebankingapp.DTO.Account;
import com.examplebankingapp.DTO.AccountModel;
import com.examplebankingapp.DTO.Transaction;
import com.examplebankingapp.DTO.TransactionType;
import com.examplebankingapp.Locales.Usen;
import com.junit.jupiter.api.BeforeEach;
import com.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class AccountTest2 extends AccountTest {

    @BeforeEach
    void setUp() {
        super.setUp();

        // Create some test data
        AccountModel model = new AccountModel2();
        account1 = model.createAccount("TEST_ACCOUNT_1", 0);
        
        // Add sample transaction for testing purposes
        Transaction tx = new Transaction(USD, 100.00, "Test Transaction");
        account1.addTransaction(tx);

        // Save to mock DAO
        verify(accountDao).addTransactionToAccount(Usen.PROVIDER, account1.getId()).thenReturn(tx);
    }

    @Test
    void listRecentTransactions_ShouldReturnRecentTransaction() {
        Account<?> account = new Account("TEST_ACCOUNT_1");
        
        List<Transaction<?>> recentTransactions = accountListerService.getAccountsWithRecentTransactions(account);

        assertEquals(1, recentTransactions.size());
        assertEquals(tx, recentTransactions.get(0));
    }

    @Test
    void markTransactionComplete_ShouldUpdateTransactionStatus() {
        Transaction tx = new Transaction(Currency.DOLLAR, 50.00, "Marking as complete");
        Account<?> account = new Account("TEST_ACCOUNT_1");

        tx.Status = TransactionType.COMPLETED;
        account.addTransaction(tx);
        account.DaoUpdate.saveTransaction(tx);

        account.markTransactionComplete(1, tx.getId());

        tx,status expected = when(tx).thenReturn(TransactionType.COMPLETED)).thenReturn(status);
    }
}
>>>>>>> REPLACE

