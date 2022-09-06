import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Evgenii Zhuravel created on 05.09.2022
 * @version 1.0
 */
public class CodeTest {

    @Test
    public void testSayHello() {
        Code code = new Code();

        assertEquals("Hello world!", code.sayHello());
    }
}
