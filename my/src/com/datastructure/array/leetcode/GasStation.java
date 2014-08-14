package com.datastructure.array.leetcode;

/**
 * Created by danzhu on 7/1/14.
 */
public class GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int left = 0;
        int start = -1;
        int total = 0;

        int n = gas.length;
        for(int i = 0; i < n; i++){
            total += gas[i] - cost[i];
            left += gas[i] - cost[i];

            if(left < 0){
                left = 0;
                start = i;
            }
        }

        if(total < 0) {
            return -1;
        } else {
            return start + 1;
        }
    }
}
