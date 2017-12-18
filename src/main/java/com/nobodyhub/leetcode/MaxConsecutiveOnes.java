package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 18/12/2017
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int numMaxConsecutive = 0;
        int numConsecutive = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                numConsecutive++;
            } else {
                if (numConsecutive > numMaxConsecutive) {
                    numMaxConsecutive = numConsecutive;
                }
                numConsecutive = 0;
            }
        }
        if (numConsecutive > numMaxConsecutive) {
            numMaxConsecutive = numConsecutive;
        }
        return numMaxConsecutive;
    }
}
