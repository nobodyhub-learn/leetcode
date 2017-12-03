package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 02/12/2017
 */
public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        int a2z = 0;
        int z2a = 0;
        ListNode currentNode = head;
        int idx = 1;
        while (currentNode != null) {
            int val = currentNode.val;
            if (val == 0) {
                val = idx;
            }
            a2z = a2z + val * idx;
            currentNode = currentNode.next;
            ++idx;
        }
        idx--;
        currentNode = head;
        while (currentNode != null) {
            int val = currentNode.val;
            if (val == 0) {
                val = idx;
            }
            z2a = z2a + val * idx;
            currentNode = currentNode.next;
            --idx;
        }
        return a2z == z2a;
    }
}


