package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 01/01/2018
 */
public class RestoreIPAddressesTest {
    @Test
    public void tes1() {
        RestoreIPAddresses solution = new RestoreIPAddresses();
        assertEquals(1, solution.restoreIpAddresses("0000").size());
    }

}