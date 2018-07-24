package com.nobodyhub.leetcode;

/**
 * @author yan_h
 * @since 2018/7/24
 */
public class LongestPalindromicSubstring {
    int start = 0;
    int maxLength = 0;

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        String longest = "";
        for (int start = 0; start < s.length(); start++) {
            for (int end = s.length(); end >= start; end--) {
                String str = s.substring(start, end);
                if (isPalindrome(str)) {
                    if (str.length() > longest.length()) {
                        longest = str;
                        break;
                    }
                }
            }
        }
        return longest;
    }


    public String longestPalindrome1(String s) {
        if (s.length() <= 1) {
            return s;
        }
        start = 0;
        maxLength = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            extraPalindrome(s, i, i);
            extraPalindrome(s, i, i + 1);
        }
        return s.substring(this.start, this.start + this.maxLength);
    }

    private void extraPalindrome(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        start++;
        end--;

        if (maxLength < end - start + 1) {
            this.start = start;
            this.maxLength = end - start + 1;
        }
    }


    private boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
