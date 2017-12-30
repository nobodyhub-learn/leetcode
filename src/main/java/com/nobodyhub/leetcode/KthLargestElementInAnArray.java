package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 29/12/2017
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return Integer.MAX_VALUE;
        }
        qsort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }

    public void qsort(int[] nums, int head, int tail) {
        if (head >= tail || nums == null || nums.length == 0) {
            return;
        }
        int i = head, j = tail, pivot = nums[(head + tail) / 2];
        while (i < j) {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }
            if (i < j) {
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j--;
            } else if (i == j) {
                i++;
            }
        }
        qsort(nums, head, j);
        qsort(nums, i, tail);
    }
}
