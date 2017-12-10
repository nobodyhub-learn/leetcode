package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class ComplexNumberMultiplicationTest {
    @Test
    public void test1() {
        ComplexNumberMultiplication solution = new ComplexNumberMultiplication();
        assertEquals("0+2i",
                solution.complexNumberMultiply("1+1i", "1+1i"));
    }

    @Test
    public void test2() {
        ComplexNumberMultiplication solution = new ComplexNumberMultiplication();
        assertEquals("0+-2i",
                solution.complexNumberMultiply("1+-1i", "1+-1i"));
    }

}