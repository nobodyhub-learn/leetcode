package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        List<String> aStr = Arrays.asList(a.split(""));
        Collections.reverse(aStr);
        List<String> bStr = Arrays.asList(b.split(""));
        Collections.reverse(bStr);

        List<String> result = new ArrayList<String>();
        int i = 0;
        int carry = 0;
        while (i < aStr.size() && i < bStr.size()) {
            int aInt = Integer.parseInt(aStr.get(i));
            int bInt = Integer.parseInt(bStr.get(i));
            int total = aInt + bInt + carry;
            switch (total) {
                case 0: {
                    result.add("0");
                    carry = 0;
                    break;
                }
                case 1: {
                    result.add("1");
                    carry = 0;
                    break;
                }
                case 2: {
                    result.add("0");
                    carry = 1;
                    break;
                }
                case 3: {
                    result.add("1");
                    carry = 1;
                    break;
                }
            }
            i++;
        }

        List<String> restStr = new ArrayList<String>();
        if (i < aStr.size()) {
            restStr = aStr;
        } else if (i < bStr.size()) {
            restStr = bStr;
        }


        while (i < restStr.size()) {
            int aInt = Integer.parseInt(restStr.get(i));
            int total = aInt + carry;
            switch (total) {
                case 0: {
                    result.add("0");
                    carry = 0;
                    break;
                }
                case 1: {
                    result.add("1");
                    carry = 0;
                    break;
                }
                case 2: {
                    result.add("0");
                    carry = 1;
                    break;
                }
            }
            i++;
        }

        if (carry != 0) {
            result.add("" + carry);
        }

        Collections.reverse(result);
        StringBuilder sb = new StringBuilder();
        for (String ch : result) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
