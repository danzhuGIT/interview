package chapterthree;

import java.util.Stack;

public class MyQueue {
	Stack<String> s1,s2;
	public MyQueue(){
		s1=new Stack<String>();
		s2=new Stack<String>();		
	}
	
	public int queueSize(){
		return s1.size()+s2.size();
	}
	
	public void add(String data){
		s1.push(data);
	}
	
	public String remove(){
		if (s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		return s2.pop();			
	}
	
	public String peek(){
		if (s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		return s2.peek();
	}	
}
