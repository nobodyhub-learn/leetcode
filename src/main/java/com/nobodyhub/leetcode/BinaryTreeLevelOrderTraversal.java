package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Ryan
 * @since 01/01/2018
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        LinkedList<TreeNode> toVisited = new LinkedList<TreeNode>();
        LinkedList<Integer> levels = new LinkedList<Integer>();
        toVisited.push(root);
        levels.push(0);
        int curLevel = 0;
        List<Integer> levelValues = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(levelValues);
        while (!toVisited.isEmpty()) {
            TreeNode node = toVisited.pop();
            int level = levels.pop();
            if (level != curLevel) {
                levelValues = new ArrayList<Integer>();
                result.add(levelValues);
                curLevel = level;
            }
            levelValues.add(node.val);
            if (node.left != null) {
                toVisited.add(node.left);
                levels.add(level + 1);
            }
            if (node.right != null) {
                toVisited.add(node.right);
                levels.add(level + 1);
            }
        }
        return result;
    }
}
