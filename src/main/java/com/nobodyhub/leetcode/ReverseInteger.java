package com.nobodyhub.leetcode;

/**
 * @author yan_h
 * @since 2018/7/24
 */
public class ReverseInteger {
    public int reverse(int x) {
        if (x >= 2147483647) {
            return 0;
        }
        if (x <= -2147483648) {
            return 0;
        }
        int origin = x;
        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = x * sign;
        }
        int[] indices = new int[11];
        for (int i = 0; i <= 10; i++) {
            int base = (int) Math.pow(10, 10 - i);
            indices[i] = x / base;
            x = x % base;
        }
        int result = 0;
        int power = 0;
        for (int i = 0; i < indices.length; i++) {
            if (indices[i] == 0 && power == 0) {
                continue;
            }
            int additional = (int) (indices[i] * Math.pow(10, power));
            result = additional + result;
            power++;
        }
        if (result < 0) {
            return 0;
        }
        return sign * result;
    }
}
