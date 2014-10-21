package haitaoblog;

import java.util.LinkedList;
import java.util.ListIterator;

public class LastRemaining {
	public static void main(String[] args){
		lastRemaining(5,3);		
	}
	
	public static void lastRemaining(int n, int m){
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=0;i<n;i++)
			list.add(i);
		ListIterator<Integer> iter=list.listIterator();
		while(list.size()>1){
			for(int i=0;i<m;i++){
				if(!iter.hasNext())
					iter=list.listIterator();
				iter.next();				
			}
			iter.remove();
		}
		System.out.print(list.getFirst()+" "+list.getLast());
	}
}
