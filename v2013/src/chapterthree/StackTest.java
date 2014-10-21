package chapterthree;

import java.util.*;

public class StackTest {
	public static void main(String[] arg){
		Stack<Integer> s=new Stack<Integer>();
		s.push(3);
		s.push(2);
		s.push(1);
		int size=s.size();
		System.out.println("stack's size is "+size);
		for(int i=s.size()-1;i>=0;i--)
			System.out.println(s.get(i));		
	}
}
