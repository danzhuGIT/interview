package com.topic.parenthesis.leetcode;

import java.util.Stack;

/**
 * Created by danzhu on 7/7/14.
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 */

//copy
public class ValidParentheses {
    public boolean isValid(String str){
        Stack<Character> stack=new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('||str.charAt(i)=='['||str.charAt(i)=='{'){
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()||!match(stack.pop(),str.charAt(i)))
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        else
            return false;
    }

    private boolean match(char a, char b){
        switch(a){
            case '(':
                if(b==')')
                    return true;
                break;
            case '[':
                if(b==']')
                    return true;
                break;
            case '{':
                if(b=='}')
                    return true;
                break;
        }
        return false;
    }
}
