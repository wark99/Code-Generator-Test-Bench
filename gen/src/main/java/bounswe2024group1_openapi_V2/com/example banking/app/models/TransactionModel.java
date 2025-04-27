package com.example banking.app.models;

import com.example.banking.app CR;
import com.example.banking.app.DTOmodel.TransactionsDTO;
import java.util.Date;
import java.util.TimeZone;

public class TransactionModel implements CR {
    private static final String DB TranscationTableName = "transactions";

    @Entity
    public interface TransactionInterface {
        String description;
        String date;
        double amount;
        // Other transaction fields if needed
    }

    @表格(name=DB.TranscationTableName)
    public class Transaction implements TransactionInterface {

        @Id
        private int id;

        @Property(propertyName="amount")
        @Column(name="amount", dataType="double")
        private double amount;

        @Property(propertyName="date")
        @Column(name="date", dataType="datetime")
        private Date date;

        @Property(propertyName="description")
        @Column(name="description")
        private String description;

        public void depositToTxn(double amount) {
            // Implementation for adding a transaction
        }

        public void withdrawFromTxn(double amount) {
            // Implementation for subtracting from a transaction
        }

        @Transactional(field = "amount", modifier = true)
        public double getAmount() { return amount; }
    }
}

