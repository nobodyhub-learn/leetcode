package com.nobodyhub.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class IncreasingSubsequencesTest {

    @Test
    public void test1() {
        int[] nums = {4, 6, 7, 7};
        IncreasingSubsequences solution = new IncreasingSubsequences();
        List<List<Integer>> actual = solution.findSubsequences(nums);
        assertEquals(8, actual.size());
        //[4, 6], [4, 7], [4, 6, 7], [4, 6, 7, 7], [6, 7], [6, 7, 7], [7,7], [4,7,7]
        assertArrayEquals(new Integer[]{4, 6}, actual.get(0).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{4, 7}, actual.get(1).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{6, 7}, actual.get(2).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{7, 7}, actual.get(3).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{6, 7, 7}, actual.get(4).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{4, 7, 7}, actual.get(5).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{4, 6, 7}, actual.get(6).toArray(new Integer[]{}));
        assertArrayEquals(new Integer[]{4, 6, 7, 7}, actual.get(7).toArray(new Integer[]{}));
    }

    @Test
    public void test2() {
        int[] nums = {4, 3, 2, 1};
        IncreasingSubsequences solution = new IncreasingSubsequences();
        List<List<Integer>> actual = solution.findSubsequences(nums);
        assertEquals(0, actual.size());
    }


}