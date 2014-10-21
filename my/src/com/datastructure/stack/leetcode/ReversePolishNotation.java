package com.datastructure.stack.leetcode;

import java.util.Stack;

/**
 * Created by danzhu on 2/27/14.
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.

 Valid operators are +, -, *, /. Each operand may be an integer or another expression.

 Some examples:
 ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */

public class ReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();

        for(int i=0; i < tokens.length;i++){
            if(tokens[i].matches("[\\d]+") ||
                    tokens[i].charAt(0) == '-' && tokens[i].substring(1).matches("[\\d]+")){
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                int result = 0;
                int op1 = stack.pop();
                int op2 = stack.pop();
                switch ( tokens[i].charAt(0) ){
                    case '+':
                        result = op2 + op1 ;
                        break;
                    case '-':
                        result = op2 - op1 ;
                        break;
                    case '*':
                        result = op2 * op1;
                        break;
                    case '/':
                        result = op2 / op1;
                        break;
                }
                stack.push(result);
            }
        }

        return stack.pop();
    }
}
