<<<<<<< SEARCH
=======
package com.examplebankingapp.Controllers;

import com.examplebankingapp.DTO.AccountModel;
import com.examplebankingapp.DTO.Transaction;
import com.examplebankingapp.DTO.TransactionType;
import com.examplebankingapp.Locales.Usen;
import com.examplebankingapp.UserService DAO;

public class AccountController2 implements AccountController {

    @Autowired
    private AccountDAO accountDao;

    public AccountList getAccountsWithRecentTransactions(AccountAccount account) {
        return account.DaoList.getAccountsWithRecentTransactions(account);
    }

    public void markTransactionComplete(Transaction tx, AccountAccount _account) {
        tx.Status = TransactionType.COMPLETED;
        account.DaoUpdate.saveTransaction(tx);
    }
}
>>>>>>> REPLACE

