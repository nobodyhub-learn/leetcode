package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author Ryan
 * @since 13/12/2017
 */
public class LowestCommonAncestorOfABinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Map<TreeNode, LinkedList<TreeNode>> ancestorSets = new HashMap<TreeNode, LinkedList<TreeNode>>();
        LinkedList<TreeNode> toVisit = new LinkedList<TreeNode>();
        toVisit.add(root);
        boolean pFound = false;
        boolean qFound = false;
        while (!toVisit.isEmpty() && !(pFound && qFound)) {
            TreeNode curNode = toVisit.pop();

            LinkedList<TreeNode> ancestors = ancestorSets.get(curNode);
            if (ancestors == null) {
                ancestors = new LinkedList<TreeNode>();
                ancestorSets.put(curNode, ancestors);
            }
            ancestors.add(curNode);

            if (curNode.left != null) {
                toVisit.add(curNode.left);
                LinkedList<TreeNode> childAncestor = new LinkedList<TreeNode>();
                childAncestor.addAll(ancestors);
                ancestorSets.put(curNode.left, childAncestor);
            }

            if (curNode.right != null) {
                toVisit.add(curNode.right);
                LinkedList<TreeNode> childAncestor = new LinkedList<TreeNode>();
                childAncestor.addAll(ancestors);
                ancestorSets.put(curNode.right, childAncestor);
            }
            if (curNode.equals(p)) {
                pFound = true;
            }
            if (curNode.equals(q)) {
                qFound = true;
            }

        }

        List<TreeNode> ancestorP = ancestorSets.get(p);
        List<TreeNode> ancestorQ = ancestorSets.get(q);
        int size = ancestorP.size();
        if (size > ancestorQ.size()) {
            size = ancestorQ.size();
        }
        TreeNode lowestAncestor = null;
        for (int idx = 1; idx < size; idx++) {
            if (!ancestorP.get(idx).equals(ancestorQ.get(idx))) {
                lowestAncestor = ancestorP.get(idx - 1);
                break;
            }
        }
        if (lowestAncestor == null) {
            lowestAncestor = ancestorP.get(size - 1);
        }
        return lowestAncestor;
    }
}
