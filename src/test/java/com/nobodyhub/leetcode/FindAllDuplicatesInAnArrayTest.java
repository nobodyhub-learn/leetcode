package com.nobodyhub.leetcode;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class FindAllDuplicatesInAnArrayTest {
    @Test
    public void test1() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        FindAllDuplicatesInAnArray solution = new FindAllDuplicatesInAnArray();
        List<Integer> actual = solution.findDuplicates(nums);
        assertEquals(2, actual.size());
        assertEquals(Integer.valueOf(2), actual.get(0));
        assertEquals(Integer.valueOf(3), actual.get(1));

    }


}