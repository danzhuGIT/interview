package chapterten;

import java.util.LinkedList;
import java.util.Queue;

public class GetKthMagicNumber {
	public static void main(String[] args){
		int k=10;
		int value=1;
		Queue<Integer> q3=new LinkedList<Integer>();
		Queue<Integer> q5=new LinkedList<Integer>();
		Queue<Integer> q7=new LinkedList<Integer>();
		q3.add(3);
		q5.add(5);
		q7.add(7);
		for(int i=1;i<=k;i++)
		{
			value=Math.min(q3.peek(), Math.min(q5.peek(), q7.peek()));
			if(value==q7.peek()){
				q7.remove();
			}
			else {
				if(value==q5.peek())
					q5.remove();		
				else{
					if(value==q3.peek()){
						q3.remove();
						q3.add(value*3);
						}
				}
				q5.add(value*5);
			}
			q7.add(value*7);
		}
		System.out.print("The "+k+"th Magic Number is "+value);
	}
}
