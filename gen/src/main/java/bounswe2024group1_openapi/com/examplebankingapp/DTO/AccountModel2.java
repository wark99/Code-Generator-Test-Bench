<<<<<<< SEARCH
=======
package com.examplebankingapp.DTO;

import com.examplebankingapp.DTO.Transaction;
import com.examplebankingapp.DTO.TransactionType;
import java.util.List;

public class AccountModel2 extends AccountModel {

    @Singleton;
    protected List<Transaction> transactions = null;

    public List<Transaction> getRecentTransactions() {
        if (transactions == null) {
            transactions = new ArrayList<>();
        }
        return transactions;
    }

    public void addTransaction(Transaction tx, AccountAccount _account) {
        super.addCurrencyFlow(_account, tx.DollarAmount, tx.Description);
        _account.Transactions.add(tx);
    }

    @Transactional
    void markTransactionComplete(int accountId, int transactionId) throws DAOException;

    // Inheritors can override this method if needed.

    public void setTransactionCount(int count) {
        super.setBalance(count);
    }
}
>>>>>>> REPLACE

