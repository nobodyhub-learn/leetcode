package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 04/12/2017
 */
public class ReverseVowelsOfAStringTest {
    @Test
    public void test() {
        String s = "hello";
        String expected = "holle";
        ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
        assertEquals(expected, solution.reverseVowels(s));
    }

    @Test
    public void test1() {
        String s = "leetcode";
        String expected = "leotcede";
        ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
        assertEquals(expected, solution.reverseVowels(s));
    }

    @Test
    public void test2() {
        String s = "aA";
        String expected = "Aa";
        ReverseVowelsOfAString solution = new ReverseVowelsOfAString();
        assertEquals(expected, solution.reverseVowels(s));
    }
}