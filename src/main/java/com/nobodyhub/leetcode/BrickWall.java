package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan
 * @since 11/12/2017
 */
public class BrickWall {
//    class BrickEdge {
//        BrickEdge(int width, int pos) {
//            this.width = width;
//            this.pos = pos;
//        }
//
//        int width;
//        int pos;
//    }

    public int leastBricks(List<List<Integer>> wall) {
        if (wall == null || wall.isEmpty()) {
            return 0;
        }
        List<int[]> brickEdges = new ArrayList<int[]>();
        for (int row = 0; row < wall.size(); row++) {
            brickEdges.add(new int[]{wall.get(row).get(0), 0});
        }
        int totalWidth = 0;
        for (int idx = 0; idx < wall.get(0).size(); idx++) {
            totalWidth += wall.get(0).get(idx);
        }
        int maxCross = wall.size();
        int col = 1;
        while (col < totalWidth) {
            int cross = 0;
            int step = totalWidth;
            for (int row = 0; row < brickEdges.size(); row++) {
                int[] brickEdge = brickEdges.get(row);
                if (brickEdge[0] <= col) {
                    int newPos = brickEdge[1] + 1;
                    int offset = wall.get(row).get(newPos);
                    if (offset < step) {
                        step = offset;
                    }
                    if (newPos < wall.get(row).size()) {
                        brickEdge[0] = brickEdge[0] + wall.get(row).get(newPos);
                        brickEdge[1] = newPos;
                    }
                } else {
                    int curWidth = brickEdge[0];
                    int offset = curWidth - col;
                    if (offset < step) {
                        step = offset;
                    }
                    cross++;
                }
            }
            if (cross < maxCross) {
                maxCross = cross;
            }
            col = col + step;
        }
        return maxCross;
    }
}
