package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class LongestUnivaluePath {
    int max = 0;

    public int longestUnivaluePath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        largestUnivalueNodes(root);
        return max;
    }

    protected int largestUnivalueNodes(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftCnt = largestUnivalueNodes(node.left);
        int rightCnt = largestUnivalueNodes(node.right);
        int leftTtl = node.left != null && node.left.val == node.val ? leftCnt + 1 : 0;
        int rightTtl = node.right != null && node.right.val == node.val ? rightCnt + 1 : 0;
        max = Math.max(max, rightTtl + leftTtl);
        return Math.max(rightTtl, leftTtl);
    }
}
