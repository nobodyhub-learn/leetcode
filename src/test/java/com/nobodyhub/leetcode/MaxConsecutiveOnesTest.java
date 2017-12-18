package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 18/12/2017
 */
public class MaxConsecutiveOnesTest {

    @Test
    public void test1() {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        assertEquals(3, solution.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
    }

}