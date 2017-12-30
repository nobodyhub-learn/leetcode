package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 30/12/2017
 */
public class KthLargestElementInAnArrayTest {
    @Test
    public void test() {
        KthLargestElementInAnArray solution = new KthLargestElementInAnArray();
        int[] nums = {3, 2, 1, 5, 6, 4};
        assertEquals(5, solution.findKthLargest(nums, 2));

    }
}