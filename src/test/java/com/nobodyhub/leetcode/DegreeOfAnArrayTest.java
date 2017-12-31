package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class DegreeOfAnArrayTest {
    @Test
    public void test() {
        DegreeOfAnArray solution = new DegreeOfAnArray();
        int[] nums = {1, 2, 2, 3, 1};
        assertEquals(2, solution.findShortestSubArray(nums));
    }

    @Test
    public void test1() {
        DegreeOfAnArray solution = new DegreeOfAnArray();
        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        assertEquals(6, solution.findShortestSubArray(nums));
    }

    @Test
    public void test2() {
        DegreeOfAnArray solution = new DegreeOfAnArray();
        int[] nums = {2, 1};
        assertEquals(1, solution.findShortestSubArray(nums));
    }
}