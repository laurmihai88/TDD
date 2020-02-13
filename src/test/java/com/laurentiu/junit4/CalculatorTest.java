package com.laurentiu.junit4;

import com.laurentiu.Calculator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    Calculator calculator = new Calculator();

    @Test
    public void whenAdd_returnOk() {

        int expected = 5;
        int actual = calculator.add(2, 3);
        assertEquals(expected, actual);
    }

    @Test
    public void whenSubstract_returnOk() {
        int expected = 6;
        int actual = calculator.subtract(20, 14);
        assertEquals(expected, actual);
    }

    @Test
    public void whenDivide_returnOk() {
        expectedException.expect(ArithmeticException.class);
        expectedException.expectMessage("/ by zero");
        int number = new Random().nextInt();

        calculator.divide(number,0);
    }

    @Test
    public void whenMultiply_returnOk(){
        int expected = 20;
        int actual = calculator.multiply(4,5);

        assertEquals(expected,actual);
    }

}
