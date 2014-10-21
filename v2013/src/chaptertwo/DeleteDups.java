package chaptertwo;

import java.util.Iterator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;


public class DeleteDups {
	public static void main(String[] args){
		LinkedList<Integer> list=new LinkedList<Integer>();
		HashSet<Integer> set=new HashSet<Integer>();
		HashSet<Integer> indexSet=new HashSet<Integer>();
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(4);
		
		ListIterator<Integer> iter=list.listIterator();
		int index=0;
		while(iter.hasNext()){
			int key=iter.next();
			if(!set.contains(key)){
				set.add(key);
			}
			else {
				indexSet.add(index);
			}
			index++;
		}
		Iterator<Integer> iterIndex=indexSet.iterator();
		while(iterIndex.hasNext()){
			list.remove(iterIndex.next());
		}
		System.out.print(list);

	}
}
