package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 14/12/2017
 */
public class LowestCommonAncestorOfABinaryTreeTest {
    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();
        assertEquals(root.left, solution.lowestCommonAncestor(root, root.left, root.left.right.right));

    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);

        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();
        assertEquals(root, solution.lowestCommonAncestor(root, root.left, root.right));

    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(4);

        LowestCommonAncestorOfABinaryTree solution = new LowestCommonAncestorOfABinaryTree();
        assertEquals(root, solution.lowestCommonAncestor(root, root.right, root.left.right));

    }
}