package com.nobodyhub.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 03/12/2017
 */
public class ConvertSortedArrayToBinarySearchTreeTest {
    @Test
    public void test1() {
        int[] nums = {-10, -3, 0, 5, 9};
        ConvertSortedArrayToBinarySearchTree solution = new ConvertSortedArrayToBinarySearchTree();
        TreeNode root = solution.sortedArrayToBST(nums);
        assertEquals(3, height(root));
        checkResult(new Integer[]{0, -10, 5, null, -3, null, 9}, root);
    }

    private void checkResult(Integer[] expected, TreeNode root) {
        Integer[] actual = convertTreeToArray(root);
        assertEquals(expected.length, actual.length);
        for (int idx = 0; idx < expected.length; idx++) {
            assertEquals(expected[idx], actual[idx]);
        }
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    private Integer[] convertTreeToArray(TreeNode root) {
        if (root == null) {
            return new Integer[]{};
        }
        List<Integer> result = new ArrayList<Integer>();
        LinkedList<TreeNode> toCheck = new LinkedList<TreeNode>();
        toCheck.add(root);
        result.add(root.val);
        while (!toCheck.isEmpty()) {
            TreeNode node = toCheck.pop();
            if (node.left != null || node.right != null) {
                if (node.left != null) {
                    toCheck.add(node.left);
                    result.add(node.left.val);
                } else {
                    result.add(null);
                }

                if (node.right != null) {
                    toCheck.add(node.right);
                    result.add(node.right.val);
                } else {
                    result.add(null);
                }
            }
        }
        return result.toArray(new Integer[]{});
    }
}