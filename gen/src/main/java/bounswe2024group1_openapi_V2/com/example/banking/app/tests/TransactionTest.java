package com.example.banking.app.tests;

import com.example.banking.app.models.TransactionModel;
import com.example.banking.app.tests.Mockito;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class TransactionTest extends Test {

    @BeforeEach
    void setUp() {
        transaction = new Transaction();
    }

    @Test
    void whenDepositToTxn_thenAmountIncreases() throws BusinessException {
        // Arrange
        double amount = 100.0;
        transaction.depositToTxn(amount);

        // Act & Assert
        assertEquals(amount, transaction.getAmount());
    }

    @Test
    void whenWithdrawFromTxn_thenAmountDecreases() throws BusinessException {
        // Arrange
        double originalAmount = 200.0;
        transaction.withdrawFromTxn(50.0);

        // Act & Assert
        assertEquals(originalAmount - 50.0, transaction.getAmount());
    }
}

