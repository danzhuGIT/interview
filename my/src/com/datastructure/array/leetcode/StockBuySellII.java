package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/1/14.
 */
public class StockBuySellII {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if(n == 0) return 0;

        int maxProfit = 0;
        int start = 0;

        for(int i = 1; i < n; i++){
            if(prices[i] >= prices[i-1])
                continue;
            maxProfit += prices[i-1] - prices[start];
            start = i;
        }

        maxProfit += prices[n-1] - prices[start];
        return maxProfit;
    }
}
