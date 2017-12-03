package com.nobodyhub.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @since 02/12/2017
 */
public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] rst = new int[nums1.length];
        Arrays.fill(rst, -1);
        Map<Integer, Integer> data2 = new HashMap<Integer, Integer>();
        for (int idx = 0; idx < nums2.length; idx++) {
            data2.put(nums2[idx], idx);
        }

        for (int idx = 0; idx < nums1.length; idx++) {
            for (int idx2 = data2.get(nums1[idx]) + 1; idx2 < nums2.length; idx2++) {
                if (nums2[idx2] > nums1[idx]) {
                    rst[idx] = nums2[idx2];
                    break;
                }
            }
        }
        return rst;
    }
}
