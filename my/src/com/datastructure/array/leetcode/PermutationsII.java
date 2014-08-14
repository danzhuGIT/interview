package com.datastructure.array.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danzhu on 7/17/14.
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.

 For example,
 [1,1,2] have the following unique permutations:
 [1,1,2], [1,2,1], and [2,1,1].
 */
public class PermutationsII {
    public List<ArrayList<Integer>> permuteUnique(int[] num) {
        boolean[] visited = new boolean[num.length];
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(num);
        generatePerm(num, visited, list, result);
        return result;
    }

    private void generatePerm(int[] num, boolean[] visited, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result){
        if(list.size() == num.length){
            ArrayList<Integer> copyList = new ArrayList<Integer>(list);
            result.add(copyList);
            return;
        }

        for(int i = 0; i < num.length; i++){
            if(!visited[i]){
                if(i > 0 && num[i] == num[i-1] && !visited[i-1])
                    continue;
                visited[i] = true;
                list.add(num[i]);
                generatePerm(num, visited, list, result);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }
}
