package com.nobodyhub.leetcode;

/**
 * @author yan_h
 * @since 2018/7/23
 */
public class AddTwoNumbersII {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sizeL1 = getSize(l1);
        int sizeL2 = getSize(l2);
        final int size = sizeL1 > sizeL2 ? sizeL1 : sizeL2;
        while (size > sizeL1) {
            ListNode aliNode = new ListNode(0);
            aliNode.next = l1;
            l1 = aliNode;
            sizeL1++;
        }
        while (size > sizeL2) {
            ListNode aliNode = new ListNode(0);
            aliNode.next = l2;
            l2 = aliNode;
            sizeL2++;
        }
        int[] carry = new int[size + 1];
        int carryPos = 1;
        ListNode rstHeader = new ListNode(0);
        ListNode curRst = rstHeader;
        while (l1 != null || l2 != null) {
            int sum = l1.val + l2.val;
            curRst.next = new ListNode(sum % 10);
            carry[carryPos - 1] = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            curRst = curRst.next;
            carryPos++;
        }

        boolean hasCarry = true;
        while (hasCarry) {
            hasCarry = false;
            ListNode cur = rstHeader.next;
            int pos = 1;
            while (pos < size) {
                int sum = cur.val + carry[pos];
                if (carry[pos] > 0) {
                    cur.val = sum % 10;
                    carry[pos - 1] = carry[pos - 1] + sum / 10;
                    hasCarry = true;
                    carry[pos] = 0;
                }
                pos++;
                cur = cur.next;
            }
        }
        if (carry[0] != 0) {
            rstHeader.val = carry[0];
            return rstHeader;
        } else {
            return rstHeader.next;
        }

    }

    private int getSize(ListNode l) {
        int length = 0;
        while (l != null) {
            length++;
            l = l.next;
        }
        return length;
    }
}
