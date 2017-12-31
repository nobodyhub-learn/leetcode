package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class MinimumMovesToEqualArrayElementsIITest {
    @Test
    public void test1() {
        MinimumMovesToEqualArrayElementsII solution = new MinimumMovesToEqualArrayElementsII();
        int[] nums = {1, 2, 3};
        assertEquals(2, solution.minMoves2(nums));
    }

}