package mockito;

import org.example.mockito.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Excercise4 {
    private static Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
        System.out.println("Setting up test");
    }

    @AfterAll
    static void afterAll() {
        calculator = null;
        System.out.println("Tear down");
    }

    @Test
    void test() {
        assertEquals(10, calculator.add(10, 0));
    }

    @Test
    void test2() {
        assertFalse(10 == calculator.add(10, 10));
    }

    @Test
    void test3() {
        assertTrue(19 == calculator.add(8, 11));
    }

    @Test
    void test4() {
        assertTrue(5 == calculator.div(10, 2));
    }
}
