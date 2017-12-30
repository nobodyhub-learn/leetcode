package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Ryan
 * @since 18/12/2017
 */
public class WiggleSortIITest {
    @Test
    public void test1() {
        WiggleSortII solution = new WiggleSortII();
        int[] nums = new int[]{1, 5, 1, 1, 6, 4};
        solution.wiggleSort(nums);
        assertArrayEquals(new int[]{1, 6, 1, 5, 1, 4}, nums);
    }

    @Test
    public void test2() {
        WiggleSortII solution = new WiggleSortII();
        int[] nums = new int[]{1, 3, 2, 2, 3, 1};
        solution.wiggleSort(nums);
        assertArrayEquals(new int[]{2, 3, 1, 3, 1, 2}, nums);
    }

    @Test
    public void test3() {
        WiggleSortII solution = new WiggleSortII();
        int[] nums = new int[]{1, 1, 2, 2, 2, 1};
        solution.wiggleSort(nums);
        assertArrayEquals(new int[]{1, 2, 1, 2, 1, 2}, nums);
    }

    @Test
    public void test4() {
        WiggleSortII solution = new WiggleSortII();
        int[] nums = new int[]{4, 5, 5, 6};
        solution.wiggleSort(nums);
        assertArrayEquals(new int[]{5, 6, 4, 5}, nums);
    }
}