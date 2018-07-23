package com.nobodyhub.leetcode;

/**
 * @author yan_h
 * @since 2018/7/23
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int size = nums1.length + nums2.length;
        int[] nums = new int[size];
        int pos1 = 0;
        int pos2 = 0;
        int pos = 0;
        while (pos1 < nums1.length && pos2 < nums2.length) {
            if (nums1[pos1] < nums2[pos2]) {
                nums[pos] = nums1[pos1];
                pos1++;
            } else {
                nums[pos] = nums2[pos2];
                pos2++;
            }
            pos++;
        }
        while (pos1 < nums1.length) {
            nums[pos] = nums1[pos1];
            pos1++;
            pos++;
        }

        while (pos2 < nums2.length) {
            nums[pos] = nums2[pos2];
            pos2++;
            pos++;
        }


        if (size % 2 != 0) {
            return (double) nums[(size - 1) / 2];
        } else {
            int mid = (size - 1) / 2;
            return (nums[mid] + nums[mid + 1]) / 2.0;
        }
    }
}
