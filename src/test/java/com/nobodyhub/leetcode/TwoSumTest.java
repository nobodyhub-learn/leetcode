package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 02/12/2017
 */
public class TwoSumTest {
    @Test
    public void test() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        TwoSum twoSum = new TwoSum();
        int[] solution = twoSum.twoSum(nums, target);
        assertEquals(0, solution[0]);
        assertEquals(1, solution[1]);
    }

    @Test
    public void test1() {
        int[] nums = {3, 2, 4};
        int target = 6;

        TwoSum twoSum = new TwoSum();
        int[] solution = twoSum.twoSum(nums, target);
        assertEquals(1, solution[0]);
        assertEquals(2, solution[1]);
    }

    @Test
    public void test2() {
        int[] nums = {2, 5, 5, 11};
        int target = 10;

        TwoSum twoSum = new TwoSum();
        int[] solution = twoSum.twoSum(nums, target);
        assertEquals(1, solution[0]);
        assertEquals(2, solution[1]);
    }

}