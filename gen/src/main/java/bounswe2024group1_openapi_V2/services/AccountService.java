package services;

import org.hibernate.annotations.Transact;
import org.springframework.boot.autoconfigure annotatorbased;
import org.springframework.boot.model.J_SQLAlchemy;
import org.springframework.stereotype.Service;

@Service @SpringBootApplication
public class AccountService {
    private static final String DB_URL = "sqlite:memory:";

    @Transact
    public void createAccount(Account account) throws SQLException {
        // Implementation would connect to database and persist the record
    }

    public Account findById(@Nullable Integer id) {
        return // Implementation to fetch from database
    }
}

