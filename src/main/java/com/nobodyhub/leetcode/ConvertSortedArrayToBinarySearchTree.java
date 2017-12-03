package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 03/12/2017
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode createBST(int[] nums, int start, int end) {
        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(nums[mid]);
        if (start < mid) {
            node.left = createBST(nums, start, mid - 1);
        }
        if (mid < end) {
            node.right = createBST(nums, mid + 1, end);
        }
        return node;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return createBST(nums, 0, nums.length - 1);
    }

}


