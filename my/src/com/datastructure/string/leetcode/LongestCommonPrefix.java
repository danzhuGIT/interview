package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 7/5/14.
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 */

//copy
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if(strs == null || strs.length == 0)  return "";

        int i=0;
        for(;i<strs[0].length();i++){
            int j=1;
            while(j<strs.length && i<strs[j].length() && strs[j].charAt(i)==strs[0].charAt(i))
                j++;
            if(j!=strs.length)
                break;
        }
        return strs[0].substring(0,i);
    }
}
