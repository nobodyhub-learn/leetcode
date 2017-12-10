package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class NextGreaterElementII {
    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        for (int idx = 0; idx < nums.length; idx++) {
            int nextIdx = (idx + 1) % nums.length;
            while (nextIdx != idx) {
                if (nums[nextIdx] > nums[idx]) {
                    result[idx] = nums[nextIdx];
                    break;
                }
                nextIdx = (nextIdx + 1) % nums.length;
            }
            if (nextIdx == idx) {
                result[idx] = -1;
            }
        }
        return result;
    }
}
