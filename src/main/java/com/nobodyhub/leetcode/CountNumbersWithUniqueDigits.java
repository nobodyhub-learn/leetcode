package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 02/01/2018
 */
public class CountNumbersWithUniqueDigits {
    public int countNumbersWithUniqueDigits(int n) {
        int count = 0;
        while (n >= 0) {
            count += countUniqueDigits(n);
            n--;
        }
        return count;
    }

    protected int countUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 9;
        } else {
            int remains = n - 1;
            int count = 9;
            int mutiplier = 9;
            while (remains >= 1) {
                count = count * mutiplier;
                mutiplier--;
                remains--;
            }
            return count;
        }
    }
}
