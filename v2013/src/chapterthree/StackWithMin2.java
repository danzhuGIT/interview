package chapterthree;

import java.util.Stack;

public class StackWithMin2 extends Stack<Integer>{
	Stack<Integer> sMin;
	public StackWithMin2(){
		sMin=new Stack<Integer>();
	}
	public void push(int data){
		super.push(data);
		if(data<=min()){
			sMin.push(data);
		}
	}
	public int min(){
		if(sMin.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else
			return sMin.peek();
	}
	public Integer pop(){
		int p=super.pop();
		if(p==min()){
			sMin.pop();
		}
		return p;
	}
}
