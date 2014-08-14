package com.algorithm.DFS.leetcode;

import java.util.ArrayList;

/**
 * Created by danzhu on 7/4/14.
 *
 * Given a string s, partition s such that every substring of the partition is a palindrome.

 Return all possible palindrome partitioning of s.

 For example, given s = "aab",
 Return

 [
 ["aa","b"],
 ["a","a","b"]
 ]
 *
 */

public class PalindromePartition {
    public ArrayList<ArrayList<String>> partition(String s) {
        if(s == null || s.length() == 0) return null;

        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        ArrayList<String> partition = new ArrayList<String>();
        addPartition(s, partition, result);
        return result;
    }

    public void addPartition(String str, ArrayList<String> partition, ArrayList<ArrayList<String>> result){
        if(str.length() == 0){
            ArrayList<String> temp = new ArrayList<String>(partition);
            result.add(temp);
            return;
        }

        for(int i = 0; i < str.length(); i++){
            if(isPalindrome(str.substring(0,i+1))){
                partition.add(str.substring(0,i+1));
                addPartition(str.substring(i+1), partition, result);
                partition.remove(partition.size()-1);
            }
        }
    }

    private boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while (i < j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
