package com.algorithm.DFS.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danzhu on 7/12/14.
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 For example,
 If n = 4 and k = 2, a solution is:

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 */
public class Combinations {
    public List<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        recursion(n, k, result, list, 1);
        return result;
    }

    public void recursion(int n, int k, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int start){
        if(list.size() > k) return;
        if(list.size() == k){
            ArrayList<Integer> copyList = new ArrayList<Integer>(list);
            result.add(copyList);
        }
        for(int i = start; i <=n; i++){
            list.add(i);
            recursion(n, k, result, list, i+1);
            list.remove(list.size()-1);
        }
    }
}
