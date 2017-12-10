package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class TwoSumIVInputIsABST {
    public boolean findTarget(TreeNode root, int k) {
        Map<Integer, TreeNode> valueMap = new HashMap<Integer, TreeNode>();
        LinkedList<TreeNode> toVisit = new LinkedList<TreeNode>();
        toVisit.add(root);
        while (!toVisit.isEmpty()) {
            TreeNode curNode = toVisit.pop();
            valueMap.put(curNode.val, curNode);

            if (curNode.left != null) {
                toVisit.add(curNode.left);
            }
            if (curNode.right != null) {
                toVisit.add(curNode.right);
            }
        }
        for (Map.Entry<Integer, TreeNode> node : valueMap.entrySet()) {
            int offset = k - node.getKey();
            if (valueMap.containsKey(offset) && offset != node.getKey()) {
                return true;
            }
        }
        return false;
    }
}
