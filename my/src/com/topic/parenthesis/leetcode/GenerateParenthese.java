package com.topic.parenthesis.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danzhu on 7/7/14.
 *
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 For example, given n = 3, a solution set is:

 "((()))", "(()())", "(())()", "()(())", "()()()"
 *
 *
 */
public class GenerateParenthese {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        recursion(n, 0, 0, 0, "", result);

        return result;
    }

    private void recursion(int n, int pair, int leftOpen, int leftTotal, String str, ArrayList<String> result){
        if(pair == n)  {
            result.add(str);
            return;
        }
        //if(leftTotal > n)   return;

        if(leftTotal < n)   recursion(n, pair, leftOpen+1, leftTotal+1, str+"(", result);

        if(leftOpen > 0) recursion(n, pair+1, --leftOpen, leftTotal, str+")", result);
    }
}
