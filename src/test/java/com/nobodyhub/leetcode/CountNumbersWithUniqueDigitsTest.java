package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 03/01/2018
 */
public class CountNumbersWithUniqueDigitsTest {
    @Test
    public void test1() {
        CountNumbersWithUniqueDigits solution = new CountNumbersWithUniqueDigits();
        assertEquals(91, solution.countNumbersWithUniqueDigits(2));
    }
}