package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yan_h
 * @since 2018/7/25
 */
public class StringToIntegerTest {
    @Test
    public void test() {
        StringToInteger solution = new StringToInteger();
        assertEquals(-5, solution.myAtoi("-5-"));
        assertEquals(0, solution.myAtoi("-   234"));
        assertEquals(-2147483648, solution.myAtoi("-6147483648"));
        assertEquals(2147483647, solution.myAtoi("2147483648"));
        assertEquals(0, solution.myAtoi("   +0 123"));
        assertEquals(0, solution.myAtoi("+-2"));
        assertEquals(1, solution.myAtoi("+1"));
        assertEquals(-2147483648, solution.myAtoi("-91283472332"));
        assertEquals(0, solution.myAtoi("words and 987"));
        assertEquals(4193, solution.myAtoi("4193 with words"));
        assertEquals(-42, solution.myAtoi("   -42"));
        assertEquals(42, solution.myAtoi("42"));
    }

}