package com.nobodyhub.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author yan_h
 * @since 2018/7/23
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int size = s.length();
        int pos = 0;
        int maxCount = 0;
        while (pos < size) {
            int curPos = pos;
            Set<Character> exist = new HashSet<>();
            int count = 0;
            while (curPos < size) {
                char c = s.charAt(curPos);
                if (exist.contains(c)) {
                    break;
                } else {
                    count++;
                    exist.add(c);
                }
                curPos++;
            }
            if (count > maxCount) {
                maxCount = count;
            }
            pos++;
        }
        return maxCount;
    }
}
