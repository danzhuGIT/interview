package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/1/14.
 */
public class StockBuySell {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if(n == 0) return 0;

        int maxProfit = 0;
        int maxPrice = prices[n-1];

        for(int i = n-1; i >= 0; i--){
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrice - prices[i]);
        }
        return maxProfit;
    }
}
