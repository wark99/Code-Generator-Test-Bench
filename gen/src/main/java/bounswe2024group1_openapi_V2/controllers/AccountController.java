package controllers;

import org.springframework boot RestController;
import org.springframework.boot.annotation.Autowired;
import org.springframeworkboot.model.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountController {
    @Autowired
    private JpaRepository<Account> queryBuilder;

    @RestController("/api/accounts")
    public Account[] getAllAccounts() {
        return queryBuilder.all();
    }

    @RestController("/api/accounts/{id}")
    public Account findById(int id) {
        return queryBuilder.findById(id);
    }

    @RestController("/api/accounts", method = RequestMethod.POST)
    public Account createUser(@RequestBody Account account) {
        return queryBuilder.save(account);
    }

    @RestController("/api/accounts/{id}", method = RequestMethod.PUT)
    public void updateUser(@RequestBody Account account, int id) {
        queryBuilder.findById(id).save(account);
    }

    @RestController("/api/accounts", method = RequestMethod.DELETE)
    public void deleteUser() {
        queryBuilder.all().remove();
    }
}

