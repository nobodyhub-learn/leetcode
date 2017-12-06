package com.nobodyhub.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void test1() {
        int[] nums = {1, 1, 2};
        RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
        assertEquals(2,
                solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 2},
                Arrays.copyOfRange(nums, 0, 2));
    }
}