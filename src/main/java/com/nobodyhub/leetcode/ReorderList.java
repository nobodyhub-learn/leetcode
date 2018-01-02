package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 01/01/2018
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        int length = length(head);
        ListNode midNode = getMid(head, length);
        ListNode curNode = head;
        ListNode tailNode = truncTail(midNode);
        while (tailNode != null) {
            insertAfter(curNode, tailNode);
            curNode = curNode.next.next;
            tailNode = truncTail(midNode);
        }
    }

    protected ListNode truncTail(ListNode midNode) {
        if (midNode.next == null) {
            return null;
        }
        ListNode pre = midNode;
        ListNode next = midNode.next;
        while (next.next != null) {
            pre = next;
            next = next.next;
        }
        pre.next = null;
        return next;
    }

    protected void insertAfter(ListNode node, ListNode newNode) {
        newNode.next = node.next;
        node.next = newNode;
    }

    protected int length(ListNode head) {
        if (head == null) {
            return 0;
        }
        int length = 1;
        ListNode next = head.next;
        while (next != null) {
            next = next.next;
            length++;
        }
        return length;
    }

    protected ListNode getMid(ListNode head, int length) {
        int halfLength = length / 2;
        ListNode next = head;
        while (halfLength > 0) {
            next = next.next;
            halfLength--;
        }
        return next;
    }
}
