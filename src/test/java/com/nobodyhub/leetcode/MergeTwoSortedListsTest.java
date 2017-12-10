package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class MergeTwoSortedListsTest {
    @Test
    public void test() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode expected = new ListNode(1);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(2);
        expected.next.next.next = new ListNode(3);
        expected.next.next.next.next = new ListNode(4);
        expected.next.next.next.next.next = new ListNode(4);

        MergeTwoSortedLists solution = new MergeTwoSortedLists();
        assertEquals(true, compareList(expected,
                solution.mergeTwoLists(l1, l2)));

    }

    private boolean compareList(ListNode expected, ListNode actual) {
        ListNode expectedNext = expected.next;
        ListNode actualNext = actual.next;
        while (actualNext != null && expectedNext != null) {
            if (actualNext.val != expectedNext.val) {
                return false;
            } else {
                actualNext = actualNext.next;
                expectedNext = expectedNext.next;
            }
        }
        return actualNext == expectedNext;
    }


}