package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 13/12/2017
 */
public class SentenceSimilarityIITest {

    @Test
    public void test1() {
        String[] words1 = new String[]{"great", "acting", "skills"};
        String[] words2 = new String[]{"fine", "drama", "talent"};
        String[][] paris = new String[][]{
                {"great", "good"},
                {"fine", "good"},
                {"acting", "drama"},
                {"skills", "talent"}
        };

        SentenceSimilarityII solution = new SentenceSimilarityII();
        assertEquals(true, solution.areSentencesSimilarTwo(words1, words2, paris));
    }

    @Test
    public void test2() {
        String[] words1 = new String[]{"great"};
        String[] words2 = new String[]{"great"};
        String[][] paris = new String[][]{};

        SentenceSimilarityII solution = new SentenceSimilarityII();
        assertEquals(true, solution.areSentencesSimilarTwo(words1, words2, paris));
    }
}