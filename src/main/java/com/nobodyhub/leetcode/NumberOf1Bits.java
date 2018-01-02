package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 01/01/2018
 */
public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int counter = 0;
        while (n != 0) {
            counter = counter + (n & 1);
            n = n >>> 1;
        }
        counter = counter + n;
        return counter;
    }
}
