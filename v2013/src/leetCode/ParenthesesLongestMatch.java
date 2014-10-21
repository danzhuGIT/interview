package leetCode;

import java.util.Stack;

public class ParenthesesLongestMatch {
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
}
