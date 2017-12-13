package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 13/12/2017
 */
public class Base7Test {

    @Test
    public void test1() {
        Base7 solution = new Base7();
        assertEquals("202",
                solution.convertToBase7(100));
    }

    @Test
    public void test2() {
        Base7 solution = new Base7();
        assertEquals("-10",
                solution.convertToBase7(-7));
    }

}