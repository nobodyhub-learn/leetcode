package com.nobodyhub.leetcode;

import java.util.Arrays;

/**
 * @author Ryan
 * @since 18/12/2017
 */
public class WiggleSortII {
    public void wiggleSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        Arrays.sort(nums);
        int[] copy = Arrays.copyOf(nums, nums.length);
        int low = nums.length / 2 - 1, high = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i % 2 == 0 ? copy[low--] : copy[high--];
        }
    }
}
