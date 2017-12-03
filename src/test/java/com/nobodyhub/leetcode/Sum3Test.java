package com.nobodyhub.leetcode;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 03/12/2017
 */
public class Sum3Test {
    @Test
    public void test() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Sum3 solution = new Sum3();
        List<List<Integer>> actual = solution.threeSum(nums);
        List<List<Integer>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList(-1, -1, 2));
        expected.add(Lists.newArrayList(-1, 0, 1));
        checkResult(expected, actual);
    }

    //[[-2,-1,3],[-2,0,2],[-1,0,1]]
    @Test
    public void test2() {
        int[] nums = {3, 0, -2, -1, 1, 2};
        Sum3 solution = new Sum3();
        List<List<Integer>> actual = solution.threeSum(nums);
        List<List<Integer>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList(-2, -1, 3));
        expected.add(Lists.newArrayList(-2, 0, 2));
        expected.add(Lists.newArrayList(-1, 0, 1));
        checkResult(expected, actual);
    }

    //[[-4,-2,6],[-4,0,4],[-4,1,3],[-4,2,2],[-2,-2,4],[-2,0,2]]
    @Test
    public void test3() {
        int[] nums = {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6};
        Sum3 solution = new Sum3();
        List<List<Integer>> actual = solution.threeSum(nums);
        List<List<Integer>> expected = Lists.newArrayList();
        expected.add(Lists.newArrayList(-4, -2, 6));
        expected.add(Lists.newArrayList(-4, 0, 4));
        expected.add(Lists.newArrayList(-4, 1, 3));
        expected.add(Lists.newArrayList(-4, 2, 2));
        expected.add(Lists.newArrayList(-2, -2, 4));
        expected.add(Lists.newArrayList(-2, 0, 2));
        checkResult(expected, actual);
    }

    private void checkResult(List<List<Integer>> expected,
                             List<List<Integer>> actual) {
        assertEquals(expected.size(), actual.size());
        for (int idx = 0; idx < expected.size(); idx++) {
            compareList(expected.get(idx), actual.get(idx));
        }
    }

    private void compareList(List<Integer> expected, List<Integer> actual) {
        assertEquals(expected.size(), actual.size());
        for (int idx = 0; idx < expected.size(); idx++) {
            assertEquals(expected.get(idx), actual.get(idx));
        }
    }
}