package com.example.banking.app.controllers;

import com.example.banking.app.DTOmodel.TransactionsDTO;
import com.example.banking.app.models.TransactionModel;
import com.example.banking.app.servlet.*)_JSP;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet JSP;

public class TransactionController @JSP("transaction.html") {
    @Autowired
    private TransactionModel transactionService;

    public @Request(allowed = {DepthRequest, UserDepthRequest})
    public @Transactional
    void depositToTxn(double amount) throws BusinessException {

        // Implementation to add a new transaction to the database
        transactionService.depositToTxn(amount);
    }

    public @Request(allowed = {DepthRequest, UserDepthRequest})
    public @Transactional
    void withdrawFromTxn(double amount) throws BusinessException {
        // Implementation to subtract from an existing transaction
        transactionService.withdrawFromTxn(amount);
    }
}

