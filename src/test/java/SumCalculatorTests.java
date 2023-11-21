import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTests {

    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    void calculatorSumNumber1Test() {
        int actual = calculator.sum(1);
        int expected = 1;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void calculatorSumNumber3Test() {
        int actual = calculator.sum(3);
        int expected = 6;
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void testExpectedException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}
