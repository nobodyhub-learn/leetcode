package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 10/12/2017
 */
public class AddBinaryTest {
    @Test
    public void test1() {
        AddBinary solution = new AddBinary();
        assertEquals("100", solution.addBinary("11", "1"));
    }

    @Test
    public void test2() {
        AddBinary solution = new AddBinary();
        assertEquals("10101",
                solution.addBinary(
                        "1010",
                        "1011"));
    }
}