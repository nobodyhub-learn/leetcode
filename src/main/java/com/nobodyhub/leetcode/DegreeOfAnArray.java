package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> degrees = new HashMap<Integer, int[]>(); //num => degree, startIdx, endIdx
        int numDegree = 0;
        for (int idx = 0; idx < nums.length; idx++) {
            int num = nums[idx];
            int[] degree = degrees.get(num);
            if (degree == null) {
                degree = new int[]{0, idx, idx};
            }
            degree[0] = degree[0] + 1;
            degree[2] = idx;
            if (degree[0] > numDegree) {
                numDegree = degree[0];
            }
            degrees.put(num, degree);
        }
        int minLength = nums.length;
        for (Map.Entry<Integer, int[]> entry : degrees.entrySet()) {
            if (entry.getValue()[0] != numDegree) {
                continue;
            }

            int length = entry.getValue()[2] - entry.getValue()[1] + 1;
            if (length < minLength) {
                minLength = length;
            }
        }
        return minLength;
    }
}
