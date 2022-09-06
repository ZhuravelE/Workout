import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Evgenii Zhuravel created on 05.09.2022
 * @version 1.0
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BankAccountBeforeAndAfterTest {

    static BankAccount bankAccount;

    @BeforeAll
    public void prepTest() {
        System.out.println("Hi!");
        bankAccount = new BankAccount(500, 0);
    }

    @Test
    public void testWithdraw() {
        bankAccount.withdraw(300);

        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    public void testDeposit() {
        bankAccount.deposit(500);

        assertEquals(700, bankAccount.getBalance());
    }

    @AfterAll
    public void endTest() {
        System.out.println("Bye!");
    }
}
