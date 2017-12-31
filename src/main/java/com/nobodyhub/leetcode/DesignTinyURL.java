package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class DesignTinyURL {
    public String service(String path) {
        int[] slots = new int[6];
        for (int ch : path.toCharArray()) {
            int idx = ch % 6;
            slots[idx] = slots[idx] + 1;
        }
        return convert(slots);
    }

    protected String convert(int[] slots) {
        StringBuilder sb = new StringBuilder();
        int mul = 13;
        for (int count : slots) {
            int num = (count * mul) % 62;
            if (num < 10) {
                sb.append(Character.toString((char) ('0' + num)));
            } else if (num >= 10 && num < 36) {
                sb.append(Character.toString((char) ('a' + num - 10)));
            } else if (num >= 36 && num < 62) {
                sb.append(Character.toString((char) ('A' + num - 36)));
            }
            mul = mul * 13;
        }
        return sb.toString();
    }
}
