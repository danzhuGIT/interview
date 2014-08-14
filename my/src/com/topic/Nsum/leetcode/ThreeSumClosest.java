package com.topic.Nsum.leetcode;

import java.util.Arrays;

/**
 * Created by danzhu on 7/27/14.
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. Return the sum of the three integers. You may assume that each input would have exactly one solution.

 For example, given array S = {-1 2 1 -4}, and target = 1.

 The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] num, int target) {
        Arrays.sort(num);
        int closest = Integer.MAX_VALUE;
        int delta = Integer.MAX_VALUE;

        for(int i=0; i<num.length-2; i++){
            int l = i+1;
            int r = num.length-1;
            while(l < r){
                int sum = num[i]+num[l]+num[r];
                if(sum == target)
                    return target;
                else if(sum < target){
                    if(target-sum < delta){
                        delta = target-sum;
                        closest = sum;
                    }
                    l++;
                } else {
                    if(sum-target < delta){
                        delta = sum-target;
                        closest = sum;
                    }
                    r--;
                }
            }
            while(i < num.length-1 && num[i]==num[i+1])
                i++;
        }
        return closest;
    }
}
