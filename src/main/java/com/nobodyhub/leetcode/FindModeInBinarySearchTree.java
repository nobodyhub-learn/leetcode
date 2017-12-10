package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class FindModeInBinarySearchTree {
    class Mode implements Comparable<Mode> {
        int val;
        int frequency;

        Mode(int val) {
            this.val = val;
            this.frequency = 1;
        }

        void inc() {
            this.frequency = this.frequency + 1;
        }

        @Override
        public int compareTo(Mode o) {
            return o.frequency - this.frequency;
        }
    }


    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }

        Map<Integer, Mode> counter = new HashMap<Integer, Mode>();
        LinkedList<TreeNode> toVisit = new LinkedList<TreeNode>();
        toVisit.add(root);
        while (!toVisit.isEmpty()) {


            TreeNode curNode = toVisit.pop();
            Mode mode = counter.get(curNode.val);
            if (mode == null) {
                counter.put(curNode.val, new Mode(curNode.val));
            } else {
                mode.inc();
            }

            if (curNode.left != null) {
                toVisit.add(curNode.left);
            }
            if (curNode.right != null) {
                toVisit.add(curNode.right);
            }
        }
        List<Mode> modes = new ArrayList<Mode>(counter.values());
        Collections.sort(modes);
        List<Mode> maxMode = new ArrayList<Mode>();
        int maxFreq = modes.get(0).frequency;
        for (Mode mode : modes) {
            if (mode.frequency == maxFreq) {
                maxMode.add(mode);
            } else {
                break;
            }
        }

        int[] result = new int[maxMode.size()];
        for (int i = 0; i < maxMode.size(); i++) {
            result[i] = maxMode.get(i).val;
        }
        return result;
    }
}
