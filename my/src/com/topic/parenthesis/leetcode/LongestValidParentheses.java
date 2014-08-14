package com.topic.parenthesis.leetcode;

import java.util.Stack;

/**
 * Created by danzhu on 7/7/14.
 *
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.
 *
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int max = 0;
        int start = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push(i);
            } else {
                if(stack.empty()){
                    start = i + 1;
                } else {
                    stack.pop();
                    if(stack.empty()){
                        max = Math.max(max, i - start + 1);
                    } else {
                        max = Math.max(max, i - stack.peek());
                    }
                }

            }
        }
        return max;
    }
/*  copy
    public int longestValidParentheses(String s) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<Integer> leftStack=new Stack<Integer>();
        Stack<Integer> rightStack=new Stack<Integer>();
        int max=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')
                leftStack.push(i);
            else{
                if(!leftStack.isEmpty())
                    leftStack.pop();
                else
                    rightStack.push(i);
            }
        }
        if(leftStack.isEmpty() && rightStack.isEmpty())
            return s.length();
        int cur=s.length();
        int prev;
        while(!leftStack.isEmpty()){
            prev=leftStack.pop();
            max=Math.max(cur-prev-1,max);
            cur=prev;
        }
        while(!rightStack.isEmpty()){
            prev=rightStack.pop();
            max=Math.max(cur-prev-1,max);
            cur=prev;
        }
        max=Math.max(max,cur);
        return max;
    }
    */

}
