package com.test.calculatorTest;
import org.junit.jupiter.api.Test;
import com.test.calculator.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculator {
    @Test
    public void testAdd(){

        int actualResult = Calculator.add(3,4);
        int expectedResult = 7;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSubtract(){
        int actualResult = Calculator.subtract(3,4);
        int expectedResult = -1;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMultiply(){
        int actualResult = Calculator.multiply(3,4);
        int expectedResult = 12;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testDivide(){
        int actualResult = Calculator.divide(3,4);
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }
}
