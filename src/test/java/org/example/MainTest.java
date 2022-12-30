package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testSum() {
        assertEquals(3, Main.sum(1, 2));
        assertEquals(5, Main.sum(5, 0));
        assertEquals(2, Main.sum(1, 1));
    }
}
