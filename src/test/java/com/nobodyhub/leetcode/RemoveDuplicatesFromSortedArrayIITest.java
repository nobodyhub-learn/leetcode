package com.nobodyhub.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class RemoveDuplicatesFromSortedArrayIITest {
    @Test
    public void test1() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        assertEquals(5,
                solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 1, 2, 2, 3},
                Arrays.copyOfRange(nums, 0, 5));
    }

    @Test
    public void test2() {
        int[] nums = {1, 1, 1, 2};
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        assertEquals(3,
                solution.removeDuplicates(nums));
        assertArrayEquals(new int[]{1, 1, 2},
                Arrays.copyOfRange(nums, 0, 3));
    }
}