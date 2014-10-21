package chapterthree;

import java.util.Stack;

public class StackSix {
	public static void main(String[] arg){
		Stack<Integer> s=new Stack<Integer>();
		Stack<Integer> r=new Stack<Integer>();
		
		s.push(1);
		s.push(3);
		s.push(2);
		s.push(4);
		System.out.print(s);
			
		while(!s.isEmpty()){		
			int temp=s.pop();
			while(!r.isEmpty()&&r.peek()>temp)
				s.push(r.pop());
			r.push(temp);
		}
		System.out.print(r);
	}
}
