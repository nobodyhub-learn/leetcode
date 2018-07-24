package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yan_h
 * @since 2018/7/24
 */
public class ZigZagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        Map<Integer, List<String>> rst = new HashMap<>();
        int row = 0;
        int step = 1;
        for (int idx = 0; idx < s.length(); idx++) {
            String ch = s.substring(idx, idx + 1);
            List<String> col = rst.get(row);
            if (col == null) {
                col = new ArrayList<>();
                rst.put(row, col);
            }
            col.add(ch);
            row = row + step;
            if (row == 0) {
                step = 1;
            } else if (row == numRows - 1) {
                step = -1;
            }

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            List<String> col = rst.get(i);
            if (col != null) {
                for (String ch : col) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}
