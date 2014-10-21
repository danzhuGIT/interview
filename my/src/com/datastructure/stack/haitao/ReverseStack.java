package com.datastructure.stack.haitao;

import java.util.Stack;

/**
 * Created by danzhu on 9/12/14.
 * 题目：用递归颠倒一个栈。例如输入栈{1, 2, 3, 4, 5}，1在栈顶。
 * 颠倒之后的栈为{5, 4, 3, 2, 1}，5处在栈顶。
 *
 * 我们把栈{1, 2, 3, 4, 5}看成由两部分组成：栈顶元素1和剩下的部分{2, 3, 4, 5}。
 * 如果我们能把{2, 3, 4, 5}颠倒过来，变成{5, 4, 3, 2}，
 * 然后在把原来的栈顶元素1放到底部，那么就整个栈就颠倒过来了，变成{5, 4, 3, 2, 1}。
 * then recursively reverse {2,3,4,5}
 */
public class ReverseStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        reverseStack(stack);
        System.out.println();
    }
    public static void reverseStack(Stack<Integer> stack){
        if(!stack.empty()){
            int top = stack.pop();
            reverseStack(stack);
            addToBottom(top, stack);
        }
    }
    public static void addToBottom(int bottom, Stack<Integer> stack){
        if(stack.empty()){
            stack.push(bottom);
        }else{
            int top = stack.pop();
            addToBottom(bottom, stack);
            stack.push(top);

        }
    }
}
