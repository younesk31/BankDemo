import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    Customer c1;
    Account account;
    int newBalance;



    @BeforeEach
    void setUp() {
        c1 = new Customer("Jon");
        account = new Account(c1);
        newBalance = account.depositAmount(125);

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
        int amout = 25;
        int excpetedAmount =  newBalance - amout;
        int actualAmount = account.withDrawAmount(amout);
        assertEquals(excpetedAmount,actualAmount);
    }

    @Test
    void depositAmount() {
        int amout = 25;
        int excpetedAmount = newBalance + amout;
        int actualAmount = account.depositAmount(amout);
        assertEquals(excpetedAmount,actualAmount);
    }

    @Test
    void getTransactions() {
    }
}