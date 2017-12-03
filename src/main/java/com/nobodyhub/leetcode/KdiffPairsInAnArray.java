package com.nobodyhub.leetcode;

import java.util.Arrays;

/**
 * @author Ryan
 * @since 04/12/2017
 */
public class KdiffPairsInAnArray {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int curIdx = 0;
        while (curIdx < nums.length) {
            int pairIdx = curIdx + 1;
            while (pairIdx < nums.length && nums[pairIdx] - nums[curIdx] < k) {
                pairIdx++;
            }
            if (pairIdx < nums.length && nums[pairIdx] - nums[curIdx] == k) {
                count++;
            }
            curIdx++;
            while (curIdx < nums.length && nums[curIdx - 1] == nums[curIdx]) {
                curIdx++;
            }
        }
        return count;
    }
}
