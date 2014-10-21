package chaptertwo;

import java.util.*;

public class LinkedListFour {
	public static void main(String[] agr){
		LinkedList<Integer> listone=new LinkedList<Integer>();
		LinkedList<Integer> listtwo=new LinkedList<Integer>();
		listone.addFirst(5);
		listone.addFirst(1);
		listone.addFirst(3);
		listtwo.addFirst(5);
		listtwo.addFirst(9);
		listtwo.addFirst(7);		

		LinkedList<Integer> resultList=new LinkedList<Integer>();
		ListIterator<Integer> iterA=listone.listIterator();
		ListIterator<Integer> iterB=listtwo.listIterator();
		int carry=0;
		int value;
		
		while(iterA.hasNext()||iterB.hasNext()||carry!=0)
		{
			value=carry;
			if(iterA.hasNext())
			{
				value=value+iterA.next();
			}
			if(iterB.hasNext())
			{
				value=value+iterB.next();
			}
			if(value>=10)
				carry=1;
			else
				carry=0;
			value=value%10;
			resultList.add(value);
		}
		
		System.out.print(resultList);
		
	}		
}
