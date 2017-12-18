package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 18/12/2017
 */
public class SearchA2DMatrixTest {

    @Test
    public void test1() {
        int[][] matric = new int[][]{
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        SearchA2DMatrix solution = new SearchA2DMatrix();
        assertEquals(true, solution.searchMatrix(matric, 3));
    }

    @Test
    public void test2() {
        int[][] matric = new int[][]{{}};
        SearchA2DMatrix solution = new SearchA2DMatrix();
        assertEquals(true, solution.searchMatrix(matric, 1));
    }

}