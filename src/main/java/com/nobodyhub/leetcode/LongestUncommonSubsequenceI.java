package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 11/12/2017
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
