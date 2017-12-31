package com.nobodyhub.leetcode;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class MinimumMovesToEqualArrayElementsII {
    public int minMoves2(int[] nums) {
        int total = 0;
        TreeMap<Integer, Integer> frequencies = new TreeMap<Integer, Integer>();
        for (int num : nums) {
            total = total + num;
            int frequency = frequencies.get(num) == null ? 1 : frequencies.get(num) + 1;
            frequencies.put(num, frequency);
        }
        int midFrequency = nums.length / 2;
        int accFreq = 0;
        int midValue = 0;
        for (Map.Entry<Integer, Integer> frequency : frequencies.entrySet()) {
            accFreq += frequency.getValue();
            if (accFreq > midFrequency) {
                midValue = frequency.getKey();
                break;
            }
        }
        int numMoves = 0;
        for (Map.Entry<Integer, Integer> frequency : frequencies.entrySet()) {
            numMoves += Math.abs(frequency.getKey() - midValue) * frequency.getValue();
        }
        return numMoves;
    }
}
