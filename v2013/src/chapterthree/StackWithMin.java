package chapterthree;

import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin>{
	public int min(){
		if(isEmpty()){
			return Integer.MAX_VALUE;
		}
		else{
			return peek().min;
		}
	}
	
	public void push(int data){
		int newMin=Math.min(data, min());
		super.push(new NodeWithMin(data,newMin));
	}
}
