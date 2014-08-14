package com.datastructure.array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danzhu on 7/12/14.
 *
 * Given a set of distinct integers, S, return all possible subsets.

 Note:
 Elements in a subset must be in non-descending order.
 The solution set must not contain duplicate subsets.
 For example,
 If S = [1,2,3], a solution is:

 [
 [3],
 [1],
 [2],
 [1,2,3],
 [1,3],
 [2,3],
 [1,2],
 []
 ]
 *
 */
public class Subsets {
    public static void main(String[] args){
        int[] S = {1,0};
        List<ArrayList<Integer>> result = subsets(S);
        System.out.print(subsets(S));
    }
    public static List<ArrayList<Integer>> subsets(int[] S) {
        ArrayList<Integer> subset = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(S == null || S.length == 0)  return result;
        result.add(subset);
        Arrays.sort(S);
        recursion(S, result, subset, 0);
        return result;
    }

    private static void recursion(int[] S, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> subset, int index){
        for(int i = index; i < S.length; i++){
            subset.add(S[i]);
            ArrayList<Integer> copySubset = new ArrayList<Integer>(subset);
            result.add(copySubset);
            recursion(S, result, subset, i+1);
            subset.remove(subset.size()-1);
        }
    }
}
