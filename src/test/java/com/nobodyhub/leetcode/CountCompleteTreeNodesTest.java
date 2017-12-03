package com.nobodyhub.leetcode;

import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 02/12/2017
 */
public class CountCompleteTreeNodesTest {

    @Test
    public void test() {
        int numOfNode = 0;
        TreeNode root = createCompleteTree(numOfNode);
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

        assertEquals(numOfNode, solution.countNodes(root));
    }

    @Test
    public void test1() {
        int numOfNode = 10;
        TreeNode root = createCompleteTree(numOfNode);
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

        assertEquals(numOfNode, solution.countNodes(root));
    }

    @Test
    public void test2() {
        int numOfNode = 11;
        TreeNode root = createCompleteTree(numOfNode);
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

        assertEquals(numOfNode, solution.countNodes(root));
    }

    @Test
    public void test3() {
        int numOfNode = 12;
        TreeNode root = createCompleteTree(numOfNode);
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

        assertEquals(numOfNode, solution.countNodes(root));
    }

    @Test
    public void test4() {
        int numOfNode = 13;
        TreeNode root = createCompleteTree(numOfNode);
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

        assertEquals(numOfNode, solution.countNodes(root));
    }

    @Test
    public void test5() {
        int numOfNode = 14;
        TreeNode root = createCompleteTree(numOfNode);
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

        assertEquals(numOfNode, solution.countNodes(root));
    }

    @Test
    public void test6() {
        int numOfNode = 1023;
        TreeNode root = createCompleteTree(numOfNode);
        CountCompleteTreeNodes solution = new CountCompleteTreeNodes();

        assertEquals(numOfNode, solution.countNodes(root));
    }

    private TreeNode createCompleteTree(int numOfNode) {
        if (numOfNode == 0) {
            return null;
        }
        TreeNode root = new TreeNode(1);
        LinkedList<TreeNode> parents = new LinkedList<TreeNode>();
        parents.add(root);
        int idx = 1;
        while (++idx <= numOfNode) {
            TreeNode top = parents.pop();
            if (top.left == null) {
                top.left = new TreeNode(idx);
                parents.addLast(top.left);
                parents.addFirst(top);
                continue;
            }
            if (top.right == null) {
                top.right = new TreeNode(idx);
                parents.addLast(top.right);
                continue;
            }
        }
        return root;
    }
}

