package com.nobodyhub.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinct = new HashSet<Integer>();
        for (int num : nums) {
            distinct.add(num);
        }
        return !(distinct.size() == nums.length);
    }
}
