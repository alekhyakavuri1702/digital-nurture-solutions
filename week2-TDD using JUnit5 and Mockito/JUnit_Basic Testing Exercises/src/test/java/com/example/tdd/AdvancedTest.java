package com.example.tdd;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedTest {

    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
        System.out.println("BeforeEach: Setup done");
    }

    @AfterEach
    void tearDown() {
        System.out.println("AfterEach: Teardown");
    }

    @Test
    void testAdditionAAA() {
        int result = calc.add(10, 20);
        assertEquals(30, result);
    }

    @Test
    void testMultiplicationAAA() {
        int result = calc.multiply(4, 3);
        assertEquals(12, result);
    }
}
