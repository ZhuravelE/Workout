import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

/**
 * @author Evgenii Zhuravel created on 05.09.2022
 * @version 1.0
 */

public class BankAccountAssumptionsTest {

    @Test
    @DisplayName("Test activation account after creation")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, 0);

        assumeFalse(bankAccount == null, "Account is null");
        assertTrue(bankAccount.isActive());
    }
}
