package com.datastructure.array.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danzhu on 7/17/14.
 *
 * Given a collection of numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 *
 */
public class Permutations {
    public List<ArrayList<Integer>> permute(int[] num) {
        boolean[] visited = new boolean[num.length];
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> list = new ArrayList<Integer>();

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
                visited[i] = true;
                list.add(num[i]);
                generatePerm(num, visited, list, result);
                list.remove(list.size()-1);
                visited[i] = false;
            }
        }
    }
}
