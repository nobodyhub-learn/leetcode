package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 09/12/2017
 */
public class SumOfLeftLeavesTest {
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        SumOfLeftLeaves solution = new SumOfLeftLeaves();
        assertEquals(24, solution.sumOfLeftLeaves(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        SumOfLeftLeaves solution = new SumOfLeftLeaves();
        assertEquals(4, solution.sumOfLeftLeaves(root));
    }
}