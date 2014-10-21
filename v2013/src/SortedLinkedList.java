import java.util.LinkedList;
import java.util.ListIterator;


public class SortedLinkedList extends LinkedList<Integer>{
	public void add(int a){
		int i=0;
		ListIterator<Integer> iter=super.listIterator();
		while(iter.hasNext()){
			if(iter.next()>a){
				break;
			}
			else
				i++;
		}
		super.add(i,a);
	}
}
