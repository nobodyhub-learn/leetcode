package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class ReconstructOriginalDigitsFromEnglish {
    String[] numChars = new String[]{
            "zero",
            "two",
            "six",
            "eight",
            "four",
            "three",
            "five",
            "nine",
            "seven",
            "one"
    };

    String[] numbers = new String[]{
            "0", "2", "6", "8", "4", "3", "5", "9", "7", "1"
    };


    Map<String, Integer> letters = new HashMap<String, Integer>();

    public String originalDigits(String s) {
        String[] strs = s.split("");
        for (String str : strs) {
            Integer count = letters.get(str);
            if (count == null) {
                letters.put(str, 1);
            } else {
                letters.put(str, count + 1);
            }
        }

        List<String> result = new ArrayList<String>();
        int idx = 0;
        for (String number : numChars) {
            while (tryNumber(number)) {
                result.add(numbers[idx]);
            }
            idx++;
        }
        Collections.sort(result);
        StringBuilder sb = new StringBuilder();
        for (String str : result) {
            sb.append(str);
        }
        return sb.toString();
    }

    protected boolean tryNumber(String number) {
        Map<String, Integer> needed = new HashMap<String, Integer>();
        String[] nums = number.split("");
        for (String str : nums) {
            Integer count = needed.get(str);
            if (count == null) {
                needed.put(str, 1);
            } else {
                needed.put(str, count + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : needed.entrySet()) {
            int countNeeded = entry.getValue();
            Integer remains = letters.get(entry.getKey());
            if (!(remains != null && remains >= countNeeded)) {
                return false;
            }
        }

        for (Map.Entry<String, Integer> entry : needed.entrySet()) {
            int countNeeded = entry.getValue();
            Integer remains = letters.get(entry.getKey());
            letters.put(entry.getKey(), remains - countNeeded);
        }
        return true;
    }

}
