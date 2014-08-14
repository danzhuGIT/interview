package com.algorithm.DFS.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danzhu on 7/12/14.
 *
 * Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 The solution set must not contain duplicate combinations.
 For example, given candidate set 2,3,6,7 and target 7,
 A solution set is:
 [7]
 [2, 2, 3]
 *
 */
public class CombinationSum {
    public List<ArrayList<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        recursion(candidates, target, result, list, 0);
        return result;
    }

    public void recursion(int[] candidates, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int index){
        if(target < 0)  return;
        if(target == 0){
            ArrayList<Integer> copyList = new ArrayList<Integer>(list);
            result.add(copyList);
            return;
        }
        for(int i = index; i < candidates.length && target-candidates[i] >= 0; i++){
            list.add(candidates[i]);
            recursion(candidates, target-candidates[i], result, list, i);
            list.remove(list.size()-1);
        }
        return;
    }
}
