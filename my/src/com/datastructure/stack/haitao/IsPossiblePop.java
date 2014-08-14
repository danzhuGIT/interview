package com.datastructure.stack.haitao;

import java.util.Stack;

/**
 * Created by danzhu on 8/12/14.
 */
public class IsPossiblePop {
    public static void main(String[] args){
        int[] pushOrder={1,2,3,4,5};
        int[] popOrder={4,5,3,1,2};
        System.out.print(isPossiblePop(pushOrder,popOrder));
    }
    public static boolean isPossiblePop(int[] push, int[] pop){
        int iPop = 0;
        int iPush = 0;
        Stack<Integer> stack = new Stack<Integer>();
        while(iPop < pop.length){
            if(!stack.isEmpty() && stack.peek() == pop[iPop]){
                stack.pop();
            } else {
                while(iPush < push.length && push[iPush]!=pop[iPop]) {
                    stack.push(push[iPush]);
                    iPush++;
                }
                if(iPush == push.length)
                    return false;
                else
                    iPush++;
            }
            iPop++;
        }

        if(stack.isEmpty())
            return true;
        else
            return false;

    }
}
