package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Ryan
 * @since 05/12/2017
 */
public class CourseScheduleTest {

    @Test
    public void test1() {
        int[][] prerequisites = {
                {1, 0}
        };
        int numCourse = 2;
        CourseSchedule solution = new CourseSchedule();
        int[] actual = solution.findOrder(numCourse, prerequisites);
        assertArrayEquals(new int[]{0, 1},
                actual);

    }

    @Test
    public void test2() {
        int[][] prerequisites = {
                {1, 0},
                {2, 0},
                {3, 1},
                {3, 2}
        };
        int numCourse = 4;
        CourseSchedule solution = new CourseSchedule();
        int[] actual = solution.findOrder(numCourse, prerequisites);
        assertArrayEquals(new int[]{0, 1, 2, 3},
                actual);

    }

    @Test
    public void test3() {
        int[][] prerequisites = {
                {0, 1},
                {0, 6},
                {0, 8},
                {1, 4},
                {1, 6},
                {1, 9},
                {2, 4},
                {2, 6},
                {3, 4},
                {3, 5},
                {3, 8},
                {4, 5},
                {4, 9},
                {7, 8},
                {7, 9}
        };
        int numCourse = 10;
        CourseSchedule solution = new CourseSchedule();
        int[] actual = solution.findOrder(numCourse, prerequisites);
        assertArrayEquals(new int[]{5, 6, 8, 9, 4, 7, 1, 2, 3, 0},
                actual);

    }

    @Test
    public void test4() {
        int[][] prerequisites = {
                {1, 0},
                {2, 1},
                {3, 2},
                {1, 3}
        };
        int numCourse = 4;
        CourseSchedule solution = new CourseSchedule();
        int[] actual = solution.findOrder(numCourse, prerequisites);
        assertArrayEquals(new int[]{},
                actual);
    }

    @Test
    public void test5() {
        int[][] prerequisites = {
                {1, 0},
                {0, 1}
        };
        int numCourse = 2;
        CourseSchedule solution = new CourseSchedule();
        int[] actual = solution.findOrder(numCourse, prerequisites);
        assertArrayEquals(new int[]{},
                actual);
    }

    @Test
    public void test6() {
        int[][] prerequisites = {
                {1, 0}, {2, 6}, {1, 7}, {5, 1}, {6, 4}, {7, 0}, {0, 5}
        };
        int numCourse = 8;
        CourseSchedule solution = new CourseSchedule();
        int[] actual = solution.findOrder(numCourse, prerequisites);
        assertArrayEquals(new int[]{},
                actual);
    }


}