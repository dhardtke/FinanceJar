package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FinanceJarTest {
    @Test
    void testMain() {
        assertThrows(UnsupportedOperationException.class, () -> FinanceJar.main(new String[0]));
    }
}
