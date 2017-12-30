package com.nobodyhub.leetcode;

import java.util.TreeMap;

/**
 * @author Ryan
 * @since 30/12/2017
 */
public class FindRightInterval {
    public int[] findRightInterval(Interval[] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return new int[]{-1};
        }
        int[] indices = new int[intervals.length];

        TreeMap<Integer, Integer> indexMap = new TreeMap<Integer, Integer>();
        for (int idx = 0; idx < intervals.length; idx++) {
            indexMap.put(intervals[idx].start, idx);
        }
        for (int idx = 0; idx < intervals.length; idx++) {
            Integer key = indexMap.ceilingKey(intervals[idx].end);
            indices[idx] = key == null ? -1 : indexMap.get(key);
        }
        return indices;
    }
}
