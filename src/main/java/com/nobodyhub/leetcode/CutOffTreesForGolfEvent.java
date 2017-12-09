package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 09/12/2017
 */
public class CutOffTreesForGolfEvent {
    class Point implements Comparable<Point> {
        Point(int row, int col, int height) {
            this.row = row;
            this.col = col;
            this.height = height;
        }

        int row;
        int col;
        int height;

        @Override
        public String toString() {
            return String.format("[" + row + ":" + col + "]=>" + height);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Point point = (Point) o;

            if (row != point.row) return false;
            return col == point.col;
        }

        @Override
        public int hashCode() {
            int result = row;
            result = 31 * result + col;
            return result;
        }

        @Override
        public int compareTo(Point o) {
            return this.height - o.height;
        }
    }

    protected int numRows;
    protected int numCols;
    //    protected List<Integer> numSteps = new ArrayList<Integer>();
    protected int totalNumSteps;
    protected List<Point> trees = new ArrayList<Point>();

    protected List<List<Integer>> forest = new ArrayList<List<Integer>>();


    public int cutOffTree(List<List<Integer>> forest) {
        this.forest = forest;

        List<Point> preTree = new ArrayList<Point>();
        numRows = forest.size();
        numCols = forest.get(0).size();
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int height = forest.get(row).get(col);
                if (height != 0) {
                    preTree.add(new Point(row, col, height));
                }
            }
        }
        Collections.sort(preTree);
        trees.add(new Point(0, 0, forest.get(0).get(0)));
        trees.addAll(preTree);
        boolean found = findNextTree(0);
//        int totalSteps = 0;
//        for (int num : numSteps) {
//            totalSteps = totalSteps + num;
//        }

        return found ? totalNumSteps : -1;
    }

    protected boolean findNextTree(int startIdx) {
        Point start = trees.get(startIdx);
        Point target;
        if (startIdx + 1 < trees.size()) {
            target = trees.get(startIdx + 1);
        } else {
            return true;
        }

        LinkedList<Point> toVisit = new LinkedList<Point>();
        toVisit.add(start);
        Map<Point, Integer> distance = new HashMap<Point, Integer>();
        distance.put(start, 0);

        Map<Point, Boolean> visitMark = new HashMap<Point, Boolean>();

        boolean found = false;
        while (!toVisit.isEmpty()) {
            Point curPoint = toVisit.pop();
            Boolean visited = visitMark.get(curPoint);
            if (visited == null || !visited) {
                visitMark.put(curPoint, true);
                if (curPoint.equals(target)) {
                    found = true;
                    break;
                }
                findNextStep(curPoint, toVisit, distance);
            }
        }
        if (!found) {
            return false;
        } else {
            totalNumSteps = totalNumSteps + distance.get(target);
//            numSteps.add(distance.get(target));
            return findNextTree(startIdx + 1);
        }
    }

    protected void findNextStep(Point point, LinkedList<Point> toVisit, Map<Point, Integer> distance) {
        int row = point.row;
        int col = point.col;
        int currentDistance = distance.get(point);

        if (row + 1 < numRows) {
            Point next = new Point(row + 1, col, this.forest.get(row + 1).get(col));
            if (next.height != 0) {
                toVisit.add(next);
                if (!distance.containsKey(next)) {
                    distance.put(next, currentDistance + 1);
                }
            }
        }

        if (row - 1 >= 0) {
            Point next = new Point(row - 1, col, this.forest.get(row - 1).get(col));
            if (next.height != 0) {
                toVisit.add(next);
                if (!distance.containsKey(next)) {
                    distance.put(next, currentDistance + 1);
                }
            }
        }

        if (col + 1 < numCols) {
            Point next = new Point(row, col + 1, this.forest.get(row).get(col + 1));
            if (next.height != 0) {
                toVisit.add(next);
                if (!distance.containsKey(next)) {
                    distance.put(next, currentDistance + 1);
                }
            }
        }

        if (col - 1 >= 0) {
            Point next = new Point(row, col - 1, this.forest.get(row).get(col - 1));
            if (next.height != 0) {
                toVisit.add(next);
                if (!distance.containsKey(next)) {
                    distance.put(next, currentDistance + 1);
                }
            }
        }
    }
}
