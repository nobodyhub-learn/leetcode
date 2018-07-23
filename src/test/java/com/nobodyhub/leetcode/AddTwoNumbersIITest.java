package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yan_h
 * @since 2018/7/23
 */
public class AddTwoNumbersIITest {
    @Test
    public void test() {
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode rst = new AddTwoNumbersII().addTwoNumbers(l1, l2);
        assertEquals(7, rst.val);
        assertEquals(8, rst.next.val);
        assertEquals(0, rst.next.next.val);
        assertEquals(7, rst.next.next.next.val);
    }

    @Test
    public void test1() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);

        ListNode rst = new AddTwoNumbersII().addTwoNumbers(l1, l2);
        assertEquals(1, rst.val);
        assertEquals(9, rst.next.val);
        assertEquals(8, rst.next.next.val);
    }
}