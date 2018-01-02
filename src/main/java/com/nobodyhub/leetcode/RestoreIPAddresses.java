package com.nobodyhub.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan
 * @since 01/01/2018
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        if (s.length() > 12) {
            return new ArrayList<>();
        }
        List<String> rst = new ArrayList<>();
        for (int i = 1; i < s.length() - 2 && i < 4; i++) {
            for (int j = i + 1; j < s.length() - 1 && j < i + 4; j++) {
                for (int k = j + 1; k < s.length() && k < j + 4; k++) {
                    String s1 = s.substring(0, i);
                    String s2 = s.substring(i, j);
                    String s3 = s.substring(j, k);
                    String s4 = s.substring(k);
                    if (isValid(s1)
                            && isValid(s2)
                            && isValid(s3)
                            && isValid(s4)
                            ) {
                        rst.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        return rst;
    }

    protected boolean isValid(String s) {

        if (s.length() == 0
                || (s.startsWith("0") && s.length() > 1)
                || Integer.parseInt(s) > 255
                ) {
            return false;
        }
        return true;
    }
}
