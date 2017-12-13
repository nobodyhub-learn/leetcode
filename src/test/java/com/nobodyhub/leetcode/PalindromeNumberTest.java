package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 13/12/2017
 */
public class PalindromeNumberTest {
    @Test
    public void test1() {
        PalindromeNumber solution = new PalindromeNumber();
        assertEquals(false, solution.isPalindrome(-2147447412));
    }

    @Test
    public void test2() {
        PalindromeNumber solution = new PalindromeNumber();
        assertEquals(false, solution.isPalindrome2(-2147447412));
    }

    @Test
    public void test3() {
        PalindromeNumber solution = new PalindromeNumber();
        assertEquals(true, solution.isPalindrome2(1234554321));
    }

}