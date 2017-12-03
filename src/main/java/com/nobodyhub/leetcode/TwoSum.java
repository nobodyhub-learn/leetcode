package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @since 02/12/2017
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        for (int inIdx = 0; inIdx < nums.length - 1; inIdx++) {
            for (int outIdx = inIdx + 1; outIdx < nums.length; outIdx++) {
                if (nums[inIdx] + nums[outIdx] == target) {
                    solution[0] = inIdx;
                    solution[1] = outIdx;
                    return solution;
                }
            }
        }
        return solution;
    }

    public int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
