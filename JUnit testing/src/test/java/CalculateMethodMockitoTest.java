import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Evgenii Zhuravel created on 06.09.2022
 * @version 1.0
 */
@ExtendWith(MockitoExtension.class)
public class CalculateMethodMockitoTest {

    @Mock
    CalculateMethods calculateMethods;

    @BeforeEach
    public void setupMocks() {
        Mockito.when(calculateMethods.divide(6, 3)).thenReturn(2.0);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculateMethods.divide(6, 3));
    }
}
