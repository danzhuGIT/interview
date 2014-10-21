package leetCode;

import java.util.Stack;

public class ParenthesesValid {
	public static void main(String[] args){
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("([)]"));
		
	}
	
	static boolean isValid(String str){
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
	
	static boolean match(char a, char b){
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
