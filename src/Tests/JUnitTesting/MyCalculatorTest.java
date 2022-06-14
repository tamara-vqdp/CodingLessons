package JUnitTesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCalculatorTest {
    @Test
    void TwoPlusTwoShouldEqualFour() {
        var cal = new MyCalculator();
        assertEquals(4,cal.add(2,2));
    }

    @Test
    void TwoPlusThreeShouldEqualFive() {
        var cal = new MyCalculator();
        assertEquals(5, cal.add(2,3));
    }

    @Test
    void SixDividedByThreeShouldEqualTwo() {
        var cal = new MyCalculator();
        assertEquals(2,cal.divide(6,3));
    }

}