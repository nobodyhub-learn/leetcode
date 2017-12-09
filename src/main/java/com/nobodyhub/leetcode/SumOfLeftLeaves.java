package com.nobodyhub.leetcode;

import java.util.LinkedList;

/**
 * @author Ryan
 * @since 09/12/2017
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> toVisit = new LinkedList<TreeNode>();
        toVisit.add(root);
        int totalLeft = 0;
        while (!toVisit.isEmpty()) {
            TreeNode curNode = toVisit.pop();
            if (curNode.left != null) {

                toVisit.add(curNode.left);
                if (curNode.left.right == null && curNode.left.left == null) {
                    totalLeft += curNode.left.val;
                }
            }
            if (curNode.right != null) {
                toVisit.add(curNode.right);
            }
        }
        return totalLeft;
    }
}
