package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 02/12/2017
 */
public class PalindromeLinkedListTest {
    @Test
    public void test1() {
        int[] list = {1, 2, 3, 3, 2, 1};
        PalindromeLinkedList solution = new PalindromeLinkedList();
        assertEquals(true, solution.isPalindrome(creatList(list)));
    }

    @Test
    public void test2() {
        int[] list = {1, -2, 3, -2, 1};
        PalindromeLinkedList solution = new PalindromeLinkedList();
        assertEquals(true, solution.isPalindrome(creatList(list)));
    }

    @Test
    public void test3() {
        int[] list = {1, 3, 0, 2};
        PalindromeLinkedList solution = new PalindromeLinkedList();
        assertEquals(false, solution.isPalindrome(creatList(list)));
    }

    @Test
    public void test4() {
        int[] list = {1, 0, 0};
        PalindromeLinkedList solution = new PalindromeLinkedList();
        assertEquals(false, solution.isPalindrome(creatList(list)));
    }

    @Test
    public void test5() {
        int[] list = {1, 0, 1};
        PalindromeLinkedList solution = new PalindromeLinkedList();
        assertEquals(true, solution.isPalindrome(creatList(list)));
    }


    private ListNode creatList(int[] list) {
        ListNode head = new ListNode(Integer.MIN_VALUE);
        ListNode curNode = head;
        for (int val : list) {
            curNode.next = new ListNode(val);
            curNode = curNode.next;
        }
        return head.next;
    }

}