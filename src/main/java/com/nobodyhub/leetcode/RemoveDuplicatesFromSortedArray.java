package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        int offset = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            int num = nums[idx];
            Integer count = counts.get(num);
            if (count == null) {
                counts.put(num, 1);
                nums[idx - offset] = nums[idx];
            } else {
                offset++;
            }
        }
        return nums.length - offset;
    }
}
