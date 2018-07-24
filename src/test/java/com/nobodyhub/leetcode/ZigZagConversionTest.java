package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author yan_h
 * @since 2018/7/24
 */
public class ZigZagConversionTest {
    @Test
    public void test() {
        ZigZagConversion solution =
                new ZigZagConversion();
        assertEquals("PAHNAPLSIIGYIR",
                solution.convert("PAYPALISHIRING", 3));
        assertEquals("PINALSIGYAHRPI",
                solution.convert("PAYPALISHIRING", 4));
        assertEquals("AB",
                solution.convert("AB", 1));
        assertEquals("ABC",
                solution.convert("ABC", 1));
    }
}