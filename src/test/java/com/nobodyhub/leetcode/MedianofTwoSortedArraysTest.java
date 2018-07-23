package com.nobodyhub.leetcode;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * @author yan_h
 * @since 2018/7/23
 */
public class MedianofTwoSortedArraysTest {
    @Test
    public void test() {
        MedianofTwoSortedArrays solution = new MedianofTwoSortedArrays();
        assertEquals(2.0, solution.findMedianSortedArrays(
                new int[]{1, 3},
                new int[]{2}
        ));

        assertEquals(2.5, solution.findMedianSortedArrays(
                new int[]{1, 2},
                new int[]{3, 4}
        ));
    }
}