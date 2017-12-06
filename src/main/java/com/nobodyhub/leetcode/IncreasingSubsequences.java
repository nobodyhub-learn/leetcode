package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 06/12/2017
 */
public class IncreasingSubsequences {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        Map<String, Integer> base = new HashMap<String, Integer>();
        int idx = 0;
        for (int num : nums) {
            String key = "" + num;
            if (base.get(key) == null) {
                base.put(key, idx);
            }
            idx++;
        }
        Set<String> resultSet = new HashSet<String>();
        getRemaining(base, resultSet, nums);
        for (String result : resultSet) {
            String[] numbers = result.split(":");
            List<Integer> numberList = new ArrayList<Integer>();
            for (String number : numbers) {
                numberList.add(Integer.valueOf(number));
            }
            results.add(numberList);
        }

        return results;

    }

    public void getRemaining(Map<String, Integer> base, Set<String> result, int[] nums) {
        Map<String, Integer> newBase = new HashMap<String, Integer>();

        for (Map.Entry<String, Integer> entry : base.entrySet()) {
            int index = base.get(entry.getKey());
            int maxNum = nums[index];
            for (int idx = index + 1; idx < nums.length; idx++) {
                if (nums[idx] >= maxNum) {
                    String newKey = entry.getKey() + ":" + nums[idx];
                    if (newBase.get(newKey) == null) {
                        newBase.put(newKey, idx);
                    }
                    result.add(newKey);
                }
            }
        }
        if (!newBase.isEmpty()) {
            getRemaining(newBase, result, nums);
        }
    }

}
