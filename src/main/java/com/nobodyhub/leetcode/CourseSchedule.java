package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 05/12/2017
 */
public class CourseSchedule {

    Map<Integer, List<Integer>> depends = new HashMap<Integer, List<Integer>>();
    List<Course> courses = new ArrayList<Course>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            courses.add(new Course(i, 0));
        }
        int[] startPoint = findStartPoint(numCourses, prerequisites);
        int noStart = 0;
        try {
            for (int idx = 0; idx < numCourses; idx++) {
                if (startPoint[idx] == 0) {
                    //not start point
                    continue;
                }
                noStart++;
                countDepend(idx);
            }
            if (noStart == 0) {
                return new int[]{};
            }
        } catch (StackOverflowError e) {
            return new int[]{};
        }
        Collections.sort(courses);
        int[] result = new int[numCourses];
        int idx = 0;
        int zeroWeight = 0;
        for (Course course : courses) {
            result[idx++] = course.index;
            if (course.weight == 0) {
                zeroWeight++;
            }
        }
        if (zeroWeight > noStart) {
            return new int[]{};
        } else {
            return result;
        }
    }

    private void countDepend(int start) {
        List<Integer> depend = depends.get(start);
        if (depend == null || depend.isEmpty()) {
            return;
        } else {
            for (int idx : depend) {
                int startWeight = courses.get(start).weight;
                int dependWeight = courses.get(idx).weight;
                if (dependWeight <= courses.get(start).weight) {
                    courses.get(idx).weight = startWeight + 1;
                }
                countDepend(idx);
            }
        }
    }

    private int[] findStartPoint(int numCourses, int[][] prerequisites) {
        int[] startPoints = new int[numCourses];
        Arrays.fill(startPoints, 1);
        for (int idx = 0; idx < prerequisites.length; idx++) {
            List<Integer> depend = depends.get(prerequisites[idx][1]);
            if (depend == null) {
                depend = new ArrayList<Integer>();
                depends.put(prerequisites[idx][1], depend);
            }
            depend.add(prerequisites[idx][0]);
            startPoints[prerequisites[idx][0]] = 0;
        }
        return startPoints;
    }

    class Course implements Comparable<Course> {
        int index;
        int weight;

        Course(int index, int weight) {
            this.index = index;
            this.weight = weight;
        }

        @Override
        public int compareTo(Course that) {
            int rst = this.weight - that.weight;
            if (rst == 0) {
                rst = this.index - that.index;
            }
            return rst;
        }


        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Course) {
                Course that = (Course) obj;
                return this.weight == that.weight && this.index == that.index;
            }
            return false;
        }

        @Override
        public int hashCode() {
            int result = index;
            result = 31 * result + weight;
            return result;
        }
    }
}



