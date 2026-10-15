package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Calculator cal = new Calculator();

    @Test
    void testAdd(){
        assertEquals(12, cal.add(10,2));
    }
    @Test
    void testSubtract(){
        assertEquals(8, cal.subtract(10,2));
    }
    @Test
    void testMultiply(){
        assertEquals(20, cal.multiply(10,2));
    }
    @Test
    void testDivide(){
        assertEquals(5, cal.divide(10,2));
    }
    @Test
    void testDivideByZero(){
        assertThrows(ArithmeticException.class,()->cal.divide(10,0));
    }
}