package com.nobodyhub.leetcode;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 11/12/2017
 */
public class BrickWallTest {
    @Test
    public void test1() {
        List<Integer> row1 = Lists.newArrayList(1, 2, 2, 1);
        List<Integer> row2 = Lists.newArrayList(3, 1, 2);
        List<Integer> row3 = Lists.newArrayList(1, 3, 2);
        List<Integer> row4 = Lists.newArrayList(2, 4);
        List<Integer> row5 = Lists.newArrayList(3, 1, 2);
        List<Integer> row6 = Lists.newArrayList(1, 3, 1, 1);
        List<List<Integer>> wall = Lists.newArrayList(
                row1,
                row2,
                row3,
                row4,
                row5,
                row6
        );

        BrickWall solution = new BrickWall();
        assertEquals(2, solution.leastBricks(wall));
    }

    @Test
    public void test2() {
        List<Integer> row1 = Lists.newArrayList(100000000);
        List<List<Integer>> wall = Lists.newArrayList();
        wall.add(row1);

        BrickWall solution = new BrickWall();
        assertEquals(1, solution.leastBricks(wall));
    }

}