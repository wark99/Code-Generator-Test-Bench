// AccountService.java

package com.example.bankingsystem.service;

import com.example.bankingsystem.model.Account;
import com.example.bankingsystem.model.Transaction;
import com.example.bankingsystem.model.TransactionHistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final TransactionRepository transactionRepository;
    private final TransactionHistoryRepository transactionHistoryRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository, TransactionRepository transactionRepository, TransactionHistoryRepository transactionHistoryRepository) {
        this.accountRepository = accountRepository;
        this.transactionRepository = transactionRepository;
        this.transactionHistoryRepository = transactionHistoryRepository;
    }

    public List<Account> getAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {
        return accountRepository.findById(id).orElse(null);
    }

    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(Long id, Account account) {
        Account existingAccount = getAccountById(id);
        if (existingAccount != null) {
            existingAccount.setAccountNumber(account.getAccountNumber());
            existingAccount.setBalance(account.getBalance());
            return accountRepository.save(existingAccount);
        } else {
            return null;
        }
    }

    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    // Get transactions for a specific account
    public List<Transaction> getTransactionsForAccount(Long accountId, Long fromAccountId, Double amount) {
        Account account = getAccountById(accountId);
        Transaction fromAccount = null;
        if (fromAccountId != null) {
            fromAccount = getAccountById(fromAccountId);
        }
        return transactionRepository.findTransactionsByFromAccountAndAmount(account, fromAccount, amount);
    }

    // Create a new transaction
    public Transaction createTransaction(Long fromAccountId, Long toAccountId, Double amount) {
        Account fromAccount = getAccountById(fromAccountId);
        Account toAccount = getAccountById(toAccountId);
        if (fromAccount != null && toAccount != null) {
            return transactionRepository.save(new Transaction(fromAccount, toAccount, amount));
        } else {
            return null;
        }
    }

    // Create a new transaction history
    public TransactionHistory createTransactionHistory(Long accountId) {
        Account account = getAccountById(accountId);
        if (account != null) {
            return transactionHistoryRepository.save(new TransactionHistory(account));
        } else {
            return null;
        }
    }
}

