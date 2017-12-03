package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 04/12/2017
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<String, List<String>>();
        for (String str : strs) {
            String code = getCode(str);
            List<String> group = anagrams.get(code);
            if (group == null) {
                group = new ArrayList<String>();
                anagrams.put(code, group);
            }
            group.add(str);
        }
        return new ArrayList<List<String>>(anagrams.values());
    }

    private String getCode(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
