package com.datastructure.string.leetcode;

/**
 * Created by danzhu on 7/5/14.
 *
 * Given a string, find the length of the longest substring without repeating characters.
 * For example, the longest substring without repeating letters for "abcabcbb" is "abc",
 * which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.
 *
 */

//copy
public class LongestSubstringWORepeat {
    public int lengthOfLongestSubstring(String str) {
        boolean[] exist=new boolean[256];
        int max=0;
        int i=0,j=0;
        char[] strChar=str.toCharArray();
        while(j<strChar.length){
            if(exist[strChar[j]]==true){
                max=Math.max(j-i,max);
                while(strChar[i] != strChar[j]){
                    exist[strChar[i]]=false;
                    i++;
                }
                i++;
                j++;
            }
            else{
                exist[strChar[j]]=true;
                j++;
            }
        }
        max=Math.max(strChar.length-i,max);
        return max;
    }
}
