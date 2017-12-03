package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ryan
 * @since 03/12/2017
 */
public class Sum3 {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int idx = 0; idx < nums.length - 2; idx++) {
            if (idx > 0 && nums[idx] == nums[idx - 1]) {
                continue;
            }
            int target = 0 - nums[idx];
            int start = idx + 1;
            int end = nums.length - 1;
            while (start < end) {
                if (nums[start] + nums[end] == target) {
                    result.add(Arrays.asList(nums[idx], nums[start], nums[end]));
                    start++;
                    end--;
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }
                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                } else if (nums[start] + nums[end] > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }


}
