package com.nobodyhub.leetcode;

/**
 * @author yan_h
 * @since 2018/7/23
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curL1 = l1;
        ListNode curL2 = l2;
        int carry = 0;
        ListNode rstHeader = new ListNode(-1);
        ListNode curResult = rstHeader;
        while (curL1 != null || curL2 != null) {
            int val1 = 0;
            if (curL1 != null) {
                val1 = curL1.val;
            }
            int val2 = 0;
            if (curL2 != null) {
                val2 = curL2.val;
            }
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            curResult.next = new ListNode(sum % 10);
            curResult = curResult.next;
            if (curL1 != null) {
                curL1 = curL1.next;
            }
            if (curL2 != null) {
                curL2 = curL2.next;
            }
        }
        if (carry != 0) {
            curResult.next = new ListNode(carry);
        }
        return rstHeader.next;
    }
}
