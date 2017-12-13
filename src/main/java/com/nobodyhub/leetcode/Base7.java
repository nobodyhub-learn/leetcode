package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Ryan
 * @since 13/12/2017
 */
public class Base7 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        int rest = num;
        boolean sign = false;
        if (num < 0) {
            sign = true;
            rest = rest * -1;
        }
        ArrayList<String> bits = new ArrayList<String>();
        while (rest >= 7) {
            int reminder = rest % 7;
            rest = rest / 7;
            bits.add(reminder + "");
        }
        if (rest != 0) {
            bits.add(rest + "");
        }
        Collections.reverse(bits);
        StringBuilder sb = new StringBuilder();
        if (sign) {
            sb.append("-");
        }
        for (String bit : bits) {
            sb.append(bit);
        }
        return sb.toString();
    }
}
