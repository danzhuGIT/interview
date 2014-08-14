package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/1/14.
 */
public class StockBuySellIII {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if(n == 0) return 0;

        int[] p1 = new int[n];
        int[] p2 = new int[n];

        int min = prices[0];
        p1[0]=0;
        for(int i = 1; i < n; i++){
            min = Math.min(min,prices[i]);
            p1[i] = Math.max(p1[i-1],prices[i]-min);
        }

        int max = prices[n-1];
        p2[n-1]=0;
        for(int i = n-2; i >= 0; i--){
            max = Math.max(max,prices[i]);
            p2[i] = Math.max(p2[i+1],max-prices[i]);
        }

        int maxProfit = 0;
        for(int i = 0; i < n; i++){
            maxProfit = Math.max(maxProfit, p1[i]+p2[i]);
        }

        return maxProfit;
    }
}
