package com.datastructure.array.leetcode;

import java.util.HashSet;

/**
 * Created by danzhu on 7/4/14.
 *
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 *
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 *
 * Your algorithm should run in O(n) complexity.
 *
 */


public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] num) {

        if (num == null || num.length == 0) return 0;

        HashSet<Integer> set = new HashSet<Integer>();
        int max = 1;

        for(int n : num){
            set.add(n);
        }

        for(int n : num){
            int left = n - 1;
            int right = n + 1;
            int count = 1;
            while(set.contains(left)){
                count++;
                set.remove(left);
                left--;
            }
            while(set.contains(right)){
                count++;
                set.remove(right);
                right++;
            }
            max = max > count ? max : count;
        }
        return max;
    }
}
