package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yan_h
 * @since 2018/7/25
 */
public class StringToInteger {

    public int myAtoi(String str) {
        int indice = 0;
        int result = 0;
        int sign = 1;
        boolean hasSign = false;
        boolean digitStart = false;
        List<Integer> digits = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (' ' == ch
                    || '-' == ch
                    || '+' == ch
                    || '0' <= ch && '9' >= ch) {
                if (' ' == ch) {
                    if (digitStart) {
                        break;
                    }
                    continue;
                }
                if ('-' == ch) {
                    if (hasSign) {
                        break;
                    }
                    if (digitStart) {
                        break;
                    }
                    sign = -1;
                    hasSign = true;
                    digitStart = true;
                }
                if ('+' == ch) {
                    if (hasSign) {
                        break;
                    }
                    if (digitStart) {
                        break;
                    }
                    sign = 1;
                    hasSign = true;
                    digitStart = true;
                }
                if ('0' <= ch && '9' >= ch) {
                    digitStart = true;
                    digits.add((ch - '0'));
                    indice++;
                }
            } else {
                break;
            }
        }
        int size = digits.size() - 1;
        double exact = 0;
        for (int i = 0; i <= digits.size() - 1; i++) {
            exact = exact + digits.get(i) * Math.pow(10, size);
            result = result + digits.get(i) * (int) Math.pow(10, size);
            size--;
        }
        exact = exact * sign;
        if (exact < -2147483648) {
            return -2147483648;
        }
        if (exact > 2147483647) {
            return 2147483647;
        }
        return result * sign;
    }
}
