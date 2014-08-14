package com.datastructure.array.leetcode;

import java.util.Stack;

/**
 * Created by danzhu on 7/31/14.
 * Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.


 Above is a histogram where width of each bar is 1, given height = [2,1,5,6,2,3].


 The largest rectangle is shown in the shaded area, which has area = 10 unit.

 For example,
 Given height = [2,1,5,6,2,3],
 return 10.
 */
public class LargestRectangle {
    public int largestRectangleArea(int[] height) {
        int max = 0;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0; i < height.length; i++){
            if(stack.isEmpty() || height[i] >= stack.peek()){
                stack.push(height[i]);
            }else{
                int count = 0;
                while(!stack.isEmpty() && stack.peek()>height[i]){
                    count++;
                    max=Math.max(stack.pop()*count,max);
                }
                while(count>=0){
                    count--;
                    stack.push(height[i]);
                }
            }
        }
        int count = 0;
        while(!stack.isEmpty()){
            count++;
            max=Math.max(stack.pop()*count,max);
        }
        return max;
    }
}
