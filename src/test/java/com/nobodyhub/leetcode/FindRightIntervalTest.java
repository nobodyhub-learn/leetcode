package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Ryan
 * @since 30/12/2017
 */
public class FindRightIntervalTest {
    @Test
    public void test1() {
        Interval[] intervals = new Interval[]{
                new Interval(1, 2)

        };
        FindRightInterval solution = new FindRightInterval();
        assertArrayEquals(new int[]{-1}, solution.findRightInterval(intervals));
    }

    @Test
    public void test2() {
        Interval[] intervals = new Interval[]{
                new Interval(3, 4),
                new Interval(2, 3),
                new Interval(1, 2)

        };
        FindRightInterval solution = new FindRightInterval();
        assertArrayEquals(new int[]{-1, 0, 1}, solution.findRightInterval(intervals));
    }

    @Test
    public void test3() {
        Interval[] intervals = new Interval[]{
                new Interval(1, 4),
                new Interval(2, 3),
                new Interval(3, 4)

        };
        FindRightInterval solution = new FindRightInterval();
        assertArrayEquals(new int[]{-1, 2, -1}, solution.findRightInterval(intervals));
    }
}