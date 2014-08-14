package com.datastructure.array.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danzhu on 6/30/14.
 */
public class PascalTriangleII {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        int[] rev = new int[rowIndex+1];
        rev[0] = 1;

        for(int i = 1; i <= rowIndex; i++){
            for(int j = i; j >= 1; j--) {
                if (j == i) {
                    rev[j] = 1;
                } else {
                    rev[j] +=rev[j-1];
                }
            }
        }

        for(int i = 0; i < rev.length; i++){
            result.add(rev[i]);
        }
        return result;
    }
}
