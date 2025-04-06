// AccountRepository.java

package com.example.bankingsystem.repository;

import com.example.bankingsystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

}

// TransactionRepository.java

package com.example.bankingsystem.repository;

import com.example.bankingsystem.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findTransactionsByFromAccountAndAmount(Account fromAccount, Account toAccount, Double amount);
}

// TransactionHistoryRepository.java

package com.example.bankingsystem.repository;

import com.example.bankingsystem.model.TransactionHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionHistoryRepository extends JpaRepository<TransactionHistory, Long> {

}

