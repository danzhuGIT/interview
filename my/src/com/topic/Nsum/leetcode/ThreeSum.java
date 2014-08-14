package com.topic.Nsum.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danzhu on 7/27/14.
 *
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

 Note:
 Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 The solution set must not contain duplicate triplets.
 For example, given array S = {-1 0 1 2 -1 -4},

 A solution set is:
 (-1, 0, 1)
 (-1, -1, 2)
 *
 */
public class ThreeSum {
    public List<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(num);
        for(int i=0; i < num.length; i++){
            if(i == 0 || num[i] != num[i-1]){
                int target = 0-num[i];
                int l = i+1;
                int r = num.length-1;
                while(l<r){
                    if(num[l]+num[r]<target){
                        l++;
                    }else if(num[l]+num[r]>target){
                        r--;
                    }else{
                        ArrayList<Integer> sol = new ArrayList<Integer>();
                        sol.add(num[i]);
                        sol.add(num[l]);
                        sol.add(num[r]);
                        result.add(sol);
                        l++;
                        r--;
                        while(l < r && num[l-1] == num[l])
                            l++;
                        while(r > l && num[r] == num[r+1])
                            r--;
                    }
                }
            }
        }
        return result;
    }
}
