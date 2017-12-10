package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class ReconstructOriginalDigitsFromEnglishTest {
    @Test
    public void test1() {
        ReconstructOriginalDigitsFromEnglish solution = new ReconstructOriginalDigitsFromEnglish();
        assertEquals("012",
                solution.originalDigits("owoztneoer"));
    }

    @Test
    public void test2() {
        ReconstructOriginalDigitsFromEnglish solution = new ReconstructOriginalDigitsFromEnglish();
        assertEquals("45",
                solution.originalDigits("fviefuro"));
    }

    @Test
    public void test3() {
        ReconstructOriginalDigitsFromEnglish solution = new ReconstructOriginalDigitsFromEnglish();
        assertEquals("0123456789",
                solution.originalDigits("zeroonetwothreefourfivesixseveneightnine"));
    }

}