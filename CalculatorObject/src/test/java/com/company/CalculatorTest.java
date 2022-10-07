package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    private static Calculator calc = new Calculator();

    @Test
    public void shouldReturnSumOfTwoInts() {
        String failMessage = "Calc is expected to handle some basic addition.";
        assertEquals(failMessage, 2, calc.add(1, 1));

    }

    @Test
    public void shouldReturnSumOfTwoDoubles() {
        Double actualResult = calc.add(2.3, 3.4);
        Double expectedResult = 5.69;
    }

    @Test
    public void shouldReturnSubtractionOfTwoInts() {
        String failMessage = "Subtraction";
        assertEquals(failMessage, -29, calc.subtract(23, 52));
    }

    @Test
    public void shouldReturnSubtractionOfTwoDoubles() {
        Double actualResult = calc.subtract(5.5, 0.5);
        Integer expectedResult = 5;
    }

    @Test
    public void shouldReturnMultiplicationOfTwoInts() {
        String failMessage = "Multiplication";
        assertEquals(failMessage, 68, calc.multiply(34, 2));
    }
}
//    @Test
//    public void
//}