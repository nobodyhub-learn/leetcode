package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l1Next = l1;
        ListNode l2Next = l2;
        ListNode root = new ListNode(-1);
        ListNode rootNext = root;
        while (l1Next != null && l2Next != null) {
            if (l1Next.val < l2Next.val) {
                rootNext.next = l1Next;
                l1Next = l1Next.next;
            } else {
                rootNext.next = l2Next;
                l2Next = l2Next.next;
            }
            rootNext = rootNext.next;
        }
        if (l1Next != null) {
            rootNext.next = l1Next;
        } else if (l2Next != null) {
            rootNext.next = l2Next;
        }
        return root.next;
    }
}
