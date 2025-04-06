// TransactionHistory.java

package com.example.bankingsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class TransactionHistory {

    @Id
    private Long id;
    private Account account;
    private List<Transaction> transactions;

    // Constructor, getters and setters

    public TransactionHistory() {}

    public TransactionHistory(Account account) {
        this.account = account;
        this.transactions = new java.util.ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
}

