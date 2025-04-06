package checkingaccount.service;
import org.junit.jupiter.api.Test;

...

public class CheckingAccountController extends Controller<CheckingAccount> {
    @Inject
    private CheckingAccountModel model;

    @PreparedRequest
    public Checker accountChecker(String accountHolder, String cardHolder) {
        return new Checker(accountHolder, cardHolder);
    }

    // Other methods...
}

