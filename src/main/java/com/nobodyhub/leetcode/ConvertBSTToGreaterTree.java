package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class ConvertBSTToGreaterTree {
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        List<TreeNode> allNodes = new ArrayList<TreeNode>();
        LinkedList<TreeNode> toVisist = new LinkedList<TreeNode>();
        toVisist.add(root);
        while (!toVisist.isEmpty()) {
            TreeNode curNode = toVisist.pop();
            allNodes.add(curNode);
            if (curNode.left != null) {
                toVisist.add(curNode.left);
            }

            if (curNode.right != null) {
                toVisist.add(curNode.right);
            }
        }
        Collections.sort(allNodes, new Comparator<TreeNode>() {
            @Override
            public int compare(TreeNode o1, TreeNode o2) {
                return o1.val - o2.val;
            }
        });
        for (int i = allNodes.size() - 2; i >= 0; i--) {
            TreeNode curNode = allNodes.get(i);
            TreeNode preNode = allNodes.get(i + 1);
            curNode.val = curNode.val + preNode.val;
        }
        return root;
    }
}
