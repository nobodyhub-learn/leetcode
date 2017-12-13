package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 11/12/2017
 */
public class LongestUncommonSubsequenceITest {

    @Test
    public void test1() {
        LongestUncommonSubsequenceI solution = new LongestUncommonSubsequenceI();
        assertEquals(3, solution.findLUSlength("aba", "cdc"));
    }

    @Test
    public void test2() {
        LongestUncommonSubsequenceI solution = new LongestUncommonSubsequenceI();
        assertEquals(-1, solution.findLUSlength("aaa", "aaa"));
    }

    @Test
    public void test3() {
        LongestUncommonSubsequenceI solution = new LongestUncommonSubsequenceI();
        assertEquals(30,
                solution.findLUSlength(
                        "horbxeemlgqpqbujbdagizcfairalg",
                        "iwvtgyojrfhyzgyzeikqagpfjoaeen"));
    }
}