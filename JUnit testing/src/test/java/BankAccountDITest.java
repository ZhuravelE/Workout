import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Evgenii Zhuravel created on 05.09.2022
 * @version 1.0
 */
@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDITest {

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(BankAccount bankAccount) {
        bankAccount.deposit(500);

        assertEquals(500, bankAccount.getBalance());
    }
}
