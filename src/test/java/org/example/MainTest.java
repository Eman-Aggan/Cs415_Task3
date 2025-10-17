package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    void testSum() {
        int result = Main.sum(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    void testMultiply() {
        int result = Main.multiply(5, 3);
        assertEquals(15, result, "5 * 3 should equal 15");
    }
}


