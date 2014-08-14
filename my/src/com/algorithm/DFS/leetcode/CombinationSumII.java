package com.algorithm.DFS.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danzhu on 7/12/14.
 *
 * Given a collection of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 Each number in C may only be used once in the combination.

 Note:
 All numbers (including target) will be positive integers.
 Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 The solution set must not contain duplicate combinations.
 For example, given candidate set 10,1,2,7,6,1,5 and target 8,
 A solution set is:
 [1, 7]
 [1, 2, 5]
 [2, 6]
 [1, 1, 6]
 *
 *
 */
public class CombinationSumII {
    public List<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
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
            if(!result.contains(copyList))
                result.add(copyList);
            return;
        }
        for(int i = index; i < candidates.length && target-candidates[i] >= 0; i++){
            list.add(candidates[i]);
            recursion(candidates, target-candidates[i], result, list, i+1);
            list.remove(list.size()-1);
        }
        return;
    }
}
