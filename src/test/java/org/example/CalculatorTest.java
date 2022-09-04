package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void twoPlusTwoShouldBeFour(){
        var obj = new Calculator();
        assertEquals(4, obj.add(2,2));

    }

    @Test
    void threePlusSevenShouldEqualTen(){
        var obj = new Calculator();
        assertEquals(10, obj.add(3,7));

    }

    @Test
    void fiftynineSholudReturnF(){
        var obj = new Calculator();
        assertEquals('F', obj.determineGrade(59));
    }

    @Test
    void sixtynineSholudReturnD(){
        var obj = new Calculator();
        assertEquals('D', obj.determineGrade(69));
    }

    @Test
    void seventynineSholudReturnC(){
        var obj = new Calculator();
        assertEquals('C', obj.determineGrade(79));
    }

    @Test
    void eightynineSholudReturnB(){
        var obj = new Calculator();
        assertEquals('B', obj.determineGrade(89));
    }
    @Test
    void ninetynineSholudReturnA(){
        var obj = new Calculator();
        assertEquals('A', obj.determineGrade(99));
    }

}