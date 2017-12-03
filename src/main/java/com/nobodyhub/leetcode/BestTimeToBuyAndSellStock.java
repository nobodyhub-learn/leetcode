package com.nobodyhub.leetcode;

/**
 * @author Ryan
 * @since 03/12/2017
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                if (price - minPrice > maxProfit) {
                    maxProfit = price - minPrice;
                }
            }

        }
        return maxProfit;
    }
}
