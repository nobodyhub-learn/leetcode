package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 01/01/2018
 */
public class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        assertEquals(3, solution.levelOrder(root).size());
        assertEquals(1, solution.levelOrder(root).get(0).size());
        assertEquals(2, solution.levelOrder(root).get(2).size());
        assertEquals(2, solution.levelOrder(root).get(2).size());

    }

}