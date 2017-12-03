package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 02/12/2017
 */
public class NextGreaterElementITest {

    @Test
    public void test1() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] expected = {-1, 3, -1};

        NextGreaterElementI solution = new NextGreaterElementI();
        int[] actual = solution.nextGreaterElement(nums1, nums2);
        checkResult(actual, expected);
    }

    @Test
    public void test2() {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};
        int[] expected = {3, -1};

        NextGreaterElementI solution = new NextGreaterElementI();
        int[] actual = solution.nextGreaterElement(nums1, nums2);
        checkResult(actual, expected);
    }

    @Test
    public void test3() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 2, 3, 4};
        int[] expected = {-1, 2, 3};

        NextGreaterElementI solution = new NextGreaterElementI();
        int[] actual = solution.nextGreaterElement(nums1, nums2);
        checkResult(actual, expected);
    }

    @Test
    public void test4() {
        int[] nums1 = {1, 3, 5, 2, 4};
        int[] nums2 = {6, 5, 4, 3, 2, 1, 7};
        int[] expected = {7, 7, 7, 7, 7};

        NextGreaterElementI solution = new NextGreaterElementI();
        int[] actual = solution.nextGreaterElement(nums1, nums2);
        checkResult(actual, expected);
    }

    private void checkResult(int[] actual, int[] expected) {
        assertEquals(expected.length, actual.length);
        for (int idx = 0; idx < expected.length; idx++) {
            assertEquals(expected[idx], actual[idx]);
        }
    }


}