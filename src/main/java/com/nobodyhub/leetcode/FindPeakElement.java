package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class FindPeakElement {
    public int findPeakElement(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }

        int length = nums.length;
        int idx = 0;
        int peekIdx = 0;
        while (idx < length) {
            if (isPeek(nums, idx)) {
                if (nums[peekIdx] < nums[idx]) {
                    peekIdx = idx;
                }
                idx = idx + 2;
            } else {
                idx++;
            }
        }
        return peekIdx;
    }

    private boolean isPeek(int[] nums, int idx) {
        boolean gtPre = true;
        if (idx - 1 >= 0 && nums[idx] < nums[idx - 1]) {
            gtPre = false;
        }

        boolean gtPost = true;
        if (idx + 1 < nums.length && nums[idx] < nums[idx + 1]) {
            gtPre = false;
        }
        return gtPre && gtPost;
    }
}
