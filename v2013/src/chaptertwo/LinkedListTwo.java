package chaptertwo;

import java.util.*;

public class LinkedListTwo {
	public static void main(String[] arg){
		LinkedList<String> letter=new LinkedList<String>();
		String result=new String();
		int n=2;
		letter.add("A");
		letter.add("s");
		letter.add("d");
		letter.add("C");
		letter.add("o");
		
		result=findNth(letter,n);
		System.out.print(letter);
		System.out.print(result);
	}

public static String findNth(LinkedList<String> lst, int n)
	{
		String x=new String();
		ListIterator<String> iterone=lst.listIterator();
		ListIterator<String> itertwo=lst.listIterator();	

		for(int i=1;i<n;i++)
		{
			if(!itertwo.hasNext())
				break;
			itertwo.next();			
		}
		while(itertwo.hasNext())
		{
			itertwo.next();
			x=iterone.next();
			
		}
		
		return x;
		
	}
}
