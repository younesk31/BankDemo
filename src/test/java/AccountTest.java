import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Customer c1;
    Account account;

    @BeforeEach
    void setUp() {
        c1 = new Customer("Jon");
        account = new Account(c1);
        int newBalance = account.depositAmount(125);
    }

    @Test
    void getCustomer() {
    }

    @Test
    void getBalance() {
        assertEquals(125,account.getBalance());
    }

    @Test
    void withDrawAmount() {
        int expectedAmount = account.getBalance() - 75;
        int actuallyAmount = account.withDrawAmount(75);
        assertEquals(expectedAmount, actuallyAmount);
    }

    @Test
    void depositAmount() {
        int expectedAmount = account.getBalance() - 50;
        int actuallyAmount = account.withDrawAmount(50);
        assertEquals(expectedAmount, actuallyAmount);
    }
}