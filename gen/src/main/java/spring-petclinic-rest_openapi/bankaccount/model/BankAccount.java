package bankaccount.model;
import org.hibernate.annotations column;
import org.hibernate.annotations oneToOne;
import org.hibernate JPA;

public class BankAccount extends JpaRepository <BankAccount> {
    @Column(length = 10)
    public String accountNumber;

    @Column(default = (String) "0000000000")
    @OneToOne
    public BankAccountCard cardHolder;
}

