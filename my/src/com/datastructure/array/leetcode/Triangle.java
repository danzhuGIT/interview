package com.datastructure.array.leetcode;

import java.util.List;

/**
 * Created by danzhu on 7/11/14.
 * Given a triangle, find the minimum path sum from top to bottom. Each step you may move to adjacent numbers on the row below.

 For example, given the following triangle
 [
 [2],
 [3,4],
 [6,5,7],
 [4,1,8,3]
 ]
 The minimum path sum from top to bottom is 11 (i.e., 2 + 3 + 5 + 1 = 11).

 Note:
 Bonus point if you are able to do this using only O(n) extra space, where n is the total number of rows in the triangle.

 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle.size()==0)
            return 0;

        int[] f=new int[triangle.size()];
        for(int i=0;i<triangle.size();i++)
            for(int j=triangle.get(i).size()-1;j>=0;j--){
                if(j==0)
                    f[j]+=triangle.get(i).get(j);
                else if(j==triangle.get(i).size()-1)
                    f[j]=f[j-1]+triangle.get(i).get(j);
                else
                    f[j]=Math.min(f[j-1],f[j])+triangle.get(i).get(j);
            }

        int sum=Integer.MAX_VALUE;
        for(int i=0;i<f.length;i++)
            sum=Math.min(sum,f[i]);
        return sum;
    }
}
