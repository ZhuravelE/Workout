import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Evgenii Zhuravel created on 05.09.2022
 * @version 1.0
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountOrderingExecution {

    static BankAccount bankAccount = new BankAccount(0, 0);

    @Test
    @Order(2)
    public void testWithdraw() {
        bankAccount.withdraw(300);

        assertEquals(200, bankAccount.getBalance());
    }

    @Test
    @Order(1)
    public void testDeposit() {
        bankAccount.deposit(500);

        assertEquals(500, bankAccount.getBalance());
    }
}
