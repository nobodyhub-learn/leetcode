package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> result = new ArrayList<Integer>();
        for (int idx = 1; idx < nums.length; idx++) {
            if (nums[idx] == nums[idx - 1]) {
                result.add(nums[idx]);
                idx = idx + 1;
            }
        }
        return result;
    }
}
