package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class NextGreaterElementIITest {
    @Test
    public void test1() {
        int[] input = new int[]{1, 2, 1};
        int[] expected = new int[]{2, -1, 2};
        NextGreaterElementII solution = new NextGreaterElementII();
        assertArrayEquals(expected,
                solution.nextGreaterElements(input));
    }

}