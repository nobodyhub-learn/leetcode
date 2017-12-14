package com.nobodyhub.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Ryan
 * @since 13/12/2017
 */
public class SentenceSimilarityII {
    public boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
        if (words1.length != words2.length) {
            return false;
        }
        Map<String, Set<String>> similarMap = new HashMap<String, Set<String>>();
        for (String word : words1) {
            Set<String> wordSmilarity = new HashSet<String>();
            wordSmilarity.add(word);
            similarMap.put(word, wordSmilarity);
        }


        for (String[] pair : pairs) {
            Set<String> totalSet = new HashSet<String>();
            totalSet.add(pair[0]);
            totalSet.add(pair[1]);
            Set<String> set0 = similarMap.get(pair[0]);
            Set<String> set1 = similarMap.get(pair[1]);
            if (set0 != null) {
                totalSet.addAll(set0);
            }
            if (set1 != null) {
                totalSet.addAll(set1);
            }
            for (String word : totalSet) {
                similarMap.put(word, totalSet);
            }
        }


        for (int idx = 0; idx < words1.length; idx++) {
            Set<String> simSet = similarMap.get(words1[idx]);
            if (!simSet.contains(words2[idx])) {
                return false;
            }
        }
        return true;
    }
}
