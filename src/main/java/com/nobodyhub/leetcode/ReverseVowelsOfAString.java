package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ryan
 * @since 04/12/2017
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<Character>() {
        };
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        char[] chars = s.toCharArray();
        List<Integer> idxList = new ArrayList<Integer>();
        for (int idx = 0; idx < chars.length; idx++) {
            if (vowels.contains(chars[idx])) {
                idxList.add(idx);
            } else {
                idxList.add(-1);
            }
        }
        int start = 0;
        int end = idxList.size() - 1;
        char[] result = s.toCharArray();
        while (start < end) {
            while (start < end && idxList.get(start) == -1) {
                start++;
            }
            while (start < end && idxList.get(end) == -1) {
                end--;
            }
            result[start] = chars[end];
            result[end] = chars[start];
            start++;
            end--;
        }
        return new String(result);
    }
}
