package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class FindModeInBinarySearchTreeTest {
    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);

        FindModeInBinarySearchTree solution = new FindModeInBinarySearchTree();
        assertArrayEquals(new int[]{2}, solution.findMode(root));
    }

}