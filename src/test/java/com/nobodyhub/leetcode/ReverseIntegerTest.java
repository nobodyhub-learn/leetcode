package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yan_h
 * @since 2018/7/24
 */
public class ReverseIntegerTest {
    @Test
    public void test() {
        ReverseInteger solution = new ReverseInteger();
        assertEquals(321, solution.reverse(123));
        assertEquals(-321, solution.reverse(-123));
        assertEquals(21, solution.reverse(120));
        assertEquals(109, solution.reverse(901000));
        assertEquals(0, solution.reverse(1534236469));
        assertEquals(86723, solution.reverse(32768));
        assertEquals(0, solution.reverse(2147483647));
    }

}