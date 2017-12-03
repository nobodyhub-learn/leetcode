package com.nobodyhub.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Ryan
 * @since 03/12/2017
 */
public class BestTimeToBuyAndSellStockTest {
    @Test
    public void test1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expect = 5;
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int actual = solution.maxProfit(prices);
        assertEquals(expect, actual);
    }

    @Test
    public void test2() {
        int[] prices = {7, 6, 4, 3, 1};
        int expect = 0;
        BestTimeToBuyAndSellStock solution = new BestTimeToBuyAndSellStock();
        int actual = solution.maxProfit(prices);
        assertEquals(expect, actual);
    }
}