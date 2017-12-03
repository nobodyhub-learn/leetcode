package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 04/12/2017
 */
public class KdiffPairsInAnArrayTest {

    @Test
    public void test1() {
        int[] nums = {3, 1, 4, 1, 5};
        int k = 2;
        KdiffPairsInAnArray solution = new KdiffPairsInAnArray();
        int numOfPair = solution.findPairs(nums, k);
        assertEquals(2, numOfPair);
    }

    @Test
    public void test2() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 1;
        KdiffPairsInAnArray solution = new KdiffPairsInAnArray();
        int numOfPair = solution.findPairs(nums, k);
        assertEquals(4, numOfPair);
    }

    @Test
    public void test3() {
        int[] nums = {1, 3, 1, 5, 4};
        int k = 0;
        KdiffPairsInAnArray solution = new KdiffPairsInAnArray();
        int numOfPair = solution.findPairs(nums, k);
        assertEquals(1, numOfPair);
    }

    @Test
    public void test4() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;
        KdiffPairsInAnArray solution = new KdiffPairsInAnArray();
        int numOfPair = solution.findPairs(nums, k);
        assertEquals(3, numOfPair);
    }


}