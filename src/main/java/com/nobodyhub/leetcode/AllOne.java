package com.nobodyhub.leetcode;

import java.util.*;

/**
 * @author Ryan
 * @since 07/12/2017
 */
public class AllOne {
    protected Map<String, Integer> keyMap = new HashMap<String, Integer>();
    protected Map<Integer, List<String>> valueMap = new TreeMap<Integer, List<String>>();
    protected Integer maxValue = null;
    protected Integer minValue = null;

    /**
     * Initialize your data structure here.
     */
    public AllOne() {

    }

    /**
     * Inserts a new key <Key> with value 1. Or increments an existing key by 1.
     */
    public void inc(String key) {
        Integer value = keyMap.get(key);
        if (value == null) {
            keyMap.put(key, 1);
            List<String> keyList = valueMap.get(1);
            if (keyList == null) {
                keyList = new ArrayList<String>();
                valueMap.put(1, keyList);
            }
            keyList.add(key);
            handleMaxMinValue(1, 0);
        } else {
            valueMap.get(value).remove(key);
            if (valueMap.get(value).isEmpty()) {
                valueMap.remove(value);
            }
            keyMap.put(key, value + 1);
            List<String> keyList = valueMap.get(value + 1);
            if (keyList == null) {
                keyList = new ArrayList<String>();
                valueMap.put(value + 1, keyList);
            }
            keyList.add(key);
            handleMaxMinValue(value + 1, value);
        }
    }

    /**
     * Decrements an existing key by 1. If Key's value is 1, remove it from the data structure.
     */
    public void dec(String key) {
        Integer value = keyMap.get(key);
        if (value == null) {
            //do nothing
        } else {
            if (value == 1) {
                keyMap.remove(key);
                valueMap.get(1).remove(key);
                if (valueMap.get(1).isEmpty()) {
                    valueMap.remove(1);
                }
                handleMaxMinValue(0, 1);
            } else {
                valueMap.get(value).remove(key);
                if (valueMap.get(value).isEmpty()) {
                    valueMap.remove(value);
                }

                keyMap.put(key, value - 1);
                List<String> keyList = valueMap.get(value - 1);
                if (keyList == null) {
                    keyList = new ArrayList<String>();
                    valueMap.put(value - 1, keyList);
                }
                keyList.add(key);
            }
            handleMaxMinValue(value - 1, value);
        }
    }

    protected void handleMaxMinValue(int newValue, int oldValue) {
        // handle null value
        if (maxValue == null) {
            maxValue = newValue;
        }

        if (minValue == null) {
            minValue = newValue;
        }

        // handle minValue
        List<String> minList = valueMap.get(minValue);
        if (newValue < minValue) {
            if (newValue == 0) {
                if (minList == null || minList.isEmpty()) {
                    if (valueMap.isEmpty()) {
                        minValue = null;
                    } else {
                        for (Integer key : valueMap.keySet()) {
                            if (key > minValue) {
                                minValue = key;
                                break;
                            }
                        }
                    }

                }
            } else {
                minValue = newValue;
            }
        } else if (oldValue == minValue) {
            List<String> keys = valueMap.get(minValue);
            if (keys == null || keys.isEmpty()) {
                minValue = newValue;
            }
        }

        // handle maxValue
        if (newValue > maxValue) {
            maxValue = newValue;
        } else if (oldValue == maxValue) {
            if (valueMap.isEmpty()) {
                maxValue = null;
            } else {
                List<String> keys = valueMap.get(maxValue);
                if (keys == null || keys.isEmpty()) {
                    maxValue = newValue;
                }
            }
        }
    }

    /**
     * Returns one of the keys with maximal value.
     */
    public String getMaxKey() {
        if (maxValue == null) {
            return "";
        }
        List<String> keyList = valueMap.get(maxValue);
        if (keyList == null || keyList.isEmpty()) {
            return "";
        } else {
            return keyList.get(0);
        }
    }

    /**
     * Returns one of the keys with Minimal value.
     */
    public String getMinKey() {
        if (minValue == null) {
            return "";
        }
        List<String> keyList = valueMap.get(minValue);
        if (keyList == null || keyList.isEmpty()) {
            return "";
        } else {
            return keyList.get(0);
        }
    }
}
