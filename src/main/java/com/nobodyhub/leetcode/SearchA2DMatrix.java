package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 18/12/2017
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length - 1;
        if (row < 0) {
            return false;
        }
        int col = 0;
        for (; row >= 0; row--) {
            if (col >= matrix[row].length) {
                continue;
            }
            if (matrix[row][0] <= target) {
                break;
            }
        }
        if (row < 0) {
            return false;
        }

        for (; col < matrix[row].length; col++) {
            if (matrix[row][col] == target) {
                return true;
            }
        }
        return false;
    }
}
