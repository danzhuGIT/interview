package com.datastructure.array.leetcode;

import java.util.ArrayList;

/**
 * Created by danzhu on 6/30/14.
 */
public class PascalTriangle {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i < numRows; i++){
            ArrayList<Integer> curr = new ArrayList<Integer>();
            if(i == 0){
                curr.add(1);
            } else {
                for(int j = 0; j <= i; j++){
                    if(j == 0 || j == i){
                        curr.add(1);
                    } else {
                        curr.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                    }

                }
            }
            result.add(curr);
        }
        return result;
    }
}
