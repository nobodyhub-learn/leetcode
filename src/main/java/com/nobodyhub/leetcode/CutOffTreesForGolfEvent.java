package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 09/12/2017
 */
public class CutOffTreesForGolfEvent {
//    class Point implements Comparable<Point> {
//        Point(int row, int col, int height) {
//            this.row = row;
//            this.col = col;
//            this.height = height;
//        }
//
//        int row;
//        int col;
//        int height;
//
//        @Override
//        public String toString() {
//            return String.format("[" + row + ":" + col + "]=>" + height);
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//
//            Point point = (Point) o;
//
//            if (row != point.row) return false;
//            return col == point.col;
//        }
//
//        @Override
//        public int hashCode() {
//            int result = row;
//            result = 31 * result + col;
//            return result;
//        }
//
//        @Override
//        public int compareTo(Point o) {
//            return this.height - o.height;
//        }
//    }

    protected int numRows;
    protected int numCols;
    //    protected List<Integer> numSteps = new ArrayList<Integer>();
    protected int totalNumSteps;
    protected List<int[]> trees = new ArrayList<int[]>();

    protected List<List<Integer>> forest = new ArrayList<List<Integer>>();


    public int cutOffTree(List<List<Integer>> forest) {
        this.forest = forest;

        List<int[]> preTree = new ArrayList<int[]>();
        numRows = forest.size();
        numCols = forest.get(0).size();
        for (int row = 0; row < numRows; row++) {
            for (int col = 0; col < numCols; col++) {
                int height = forest.get(row).get(col);
                if (height != 0) {
                    preTree.add(new int[]{row, col, height});
                }
            }
        }
        Collections.sort(preTree, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[2] - o2[2];
            }
        });
        trees.add(new int[]{0, 0, forest.get(0).get(0)});
        trees.addAll(preTree);
        boolean found = findNextTree(0);
//        int totalSteps = 0;
//        for (int num : numSteps) {
//            totalSteps = totalSteps + num;
//        }

        return found ? totalNumSteps : -1;
    }

    protected boolean findNextTree(int startIdx) {
        int[] start = trees.get(startIdx);
        int[] target;
        if (startIdx + 1 < trees.size()) {
            target = trees.get(startIdx + 1);
        } else {
            return true;
        }

        LinkedList<int[]> toVisit = new LinkedList<int[]>();
        toVisit.add(start);

        Boolean[][] visitMark = new Boolean[numRows][numCols];
        int step = 0;
        boolean found = false;
        while (!toVisit.isEmpty()) {
            int lengh = toVisit.size();
            for (int idx = 0; idx < lengh; idx++) {
                int[] curPoint = toVisit.pop();
                Boolean visited = visitMark[curPoint[0]][curPoint[1]];
                if (visited == null || !visited) {
                    visitMark[curPoint[0]][curPoint[1]] = true;
                    if (curPoint[0] == target[0] && curPoint[1] == target[1]) {
                        found = true;
                        break;
                    }
                    findNextStep(curPoint, toVisit);
                }
            }
            if (found) {
                break;
            } else {
                step++;
            }

        }
        if (!found) {
            return false;
        } else {
            totalNumSteps = totalNumSteps + step;
//            numSteps.add(distance.get(target));
            return findNextTree(startIdx + 1);
        }
    }

    protected void findNextStep(int[] point, LinkedList<int[]> toVisit) {
        int row = point[0];
        int col = point[1];

        if (row + 1 < numRows) {
            int[] next = new int[]{row + 1, col, this.forest.get(row + 1).get(col)};
            if (next[2] != 0) {
                toVisit.add(next);
            }
        }

        if (row - 1 >= 0) {
            int[] next = new int[]{row - 1, col, this.forest.get(row - 1).get(col)};
            if (next[2] != 0) {
                toVisit.add(next);
            }
        }

        if (col + 1 < numCols) {
            int[] next = new int[]{row, col + 1, this.forest.get(row).get(col + 1)};
            if (next[2] != 0) {
                toVisit.add(next);
            }
        }

        if (col - 1 >= 0) {
            int[] next = new int[]{row, col - 1, this.forest.get(row).get(col - 1)};
            if (next[2] != 0) {
                toVisit.add(next);
            }
        }
    }
}
