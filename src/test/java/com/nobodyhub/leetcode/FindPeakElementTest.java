package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class FindPeakElementTest {

    @Test
    public void test1() {
        int[] nums = {1, 2, 3, 1};
        FindPeakElement solution = new FindPeakElement();
        assertEquals(2,
                solution.findPeakElement(nums));
    }

    @Test
    public void test2() {
        int[] nums = {2, 1};
        FindPeakElement solution = new FindPeakElement();
        assertEquals(0,
                solution.findPeakElement(nums));
    }

    @Test
    public void test3() {
        int[] nums = {1, 2};
        FindPeakElement solution = new FindPeakElement();
        assertEquals(1,
                solution.findPeakElement(nums));
    }

}