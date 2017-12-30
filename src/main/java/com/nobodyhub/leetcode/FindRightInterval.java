package com.nobodyhub.leetcode;

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

        for (int idx = 0; idx < intervals.length; idx++) {
            Interval interval = intervals[idx];
            int smallIdx = -1;
            for (int cmpIdx = 0; cmpIdx < intervals.length; cmpIdx++) {
                Interval cmpInterval = intervals[cmpIdx];
                if (interval == cmpInterval) {
                    continue;
                }
                if (cmpInterval.start >= interval.end) {
                    if (smallIdx == -1 || intervals[smallIdx].start > cmpInterval.start) {
                        smallIdx = cmpIdx;
                    }
                }
                indices[idx] = smallIdx;
            }
        }
        return indices;
    }
}
