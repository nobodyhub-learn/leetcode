package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yan_h
 * @since 2018/7/23
 */
public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void test() {
        LongestSubstringWithoutRepeatingCharacters solution =
                new LongestSubstringWithoutRepeatingCharacters();
        assertEquals(3, solution.lengthOfLongestSubstring("abc"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

}