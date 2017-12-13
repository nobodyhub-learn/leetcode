package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 13/12/2017
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        if (value.startsWith("-")) {
            return false;
//            value = value.substring(1);
        }
        String reversedValue = new StringBuilder(value).reverse().toString();
        return reversedValue.equals(value);
    }


    public boolean isPalindrome2(int x) {
        String[] strs = String.valueOf(x).split("");
        int start = 0, end = strs.length - 1;
        while (start < end) {
            if (!strs[start].equals(strs[end])) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
