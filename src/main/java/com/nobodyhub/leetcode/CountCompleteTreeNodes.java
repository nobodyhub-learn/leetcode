package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 02/12/2017
 */
public class CountCompleteTreeNodes {
    /**
     * @param root
     * @return -1 for null root
     * 0 for root only
     * 1,2,3...
     */
    int depth(TreeNode root) {
        return root == null ? -1 : 1 + depth(root.left);
    }

    public int countNodes(TreeNode root) {
        int depth = depth(root);
        if (depth < 0) {
            return 0;
        } else {
            if (depth(root.right) == depth - 1) {
                // left if complete
                return (1 << depth) + countNodes(root.right);
            } else {
                // depth-1 is complete
                return (1 << depth - 1) + countNodes(root.left);
            }
        }
    }
}




