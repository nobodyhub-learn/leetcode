package com.nobodyhub.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ryan
 * @since 11/12/2017
 */
public class LongestUncommonSubsequenceI {
    public int findLUSlength(String a, String b) {
        Set<String> subA = findSubsequence(a, 0);
        Set<String> subB = findSubsequence(b, 0);
        Set<String> subC = new HashSet<String>(subA);
        subA.removeAll(subB);
        subB.removeAll(subC);
        subA.addAll(subB);
        int maxLen = -1;
        for (String sub : subA) {
            if (sub.length() > maxLen) {
                maxLen = sub.length();
            }
        }
        return maxLen;
    }

    protected Set<String> findSubsequence(String str, int start) {
        Set<String> result = new HashSet<String>();
        if (start >= str.length()) {
            Set<String> empty = new HashSet<String>();
            empty.add("");
            return empty;
        } else {
            Set<String> subSet = findSubsequence(str, start + 1);
            result.addAll(subSet);
            for (String sub : subSet) {
                result.add(str.substring(start, start + 1) + sub);
            }
        }
        return result;
    }
}
