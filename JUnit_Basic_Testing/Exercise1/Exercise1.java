package mockito;


import org.example.mockito.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise1 {
    @Test
    void exercise1() {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.add(5, 5));
    }
   
}