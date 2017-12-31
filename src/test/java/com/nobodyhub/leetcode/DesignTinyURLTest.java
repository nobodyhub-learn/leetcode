package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 31/12/2017
 */
public class DesignTinyURLTest {
    @Test
    public void test() {
        DesignTinyURL solution = new DesignTinyURL();
        assertEquals("QDKjc2", solution.service("/problems/design-tinyurl"));
    }
}