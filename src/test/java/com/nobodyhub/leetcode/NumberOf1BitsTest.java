package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 01/01/2018
 */
public class NumberOf1BitsTest {

    @Test
    public void test1() {
        NumberOf1Bits solution = new NumberOf1Bits();
        assertEquals(1, solution.hammingWeight(Integer.parseUnsignedInt("2147483648")));
    }
}