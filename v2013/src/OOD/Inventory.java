package OOD;

import java.util.LinkedList;
import java.util.ListIterator;

public class Inventory {
	private LinkedList<Guitar> list=new LinkedList<Guitar>();
	
	public Inventory(){		
	};
	
	public void addGuitar(String serialNum, Type type){
		Guitar g=new Guitar(serialNum,type);
		list.add(g);
	}
	
	public LinkedList<Guitar> search(Guitar g){
		LinkedList<Guitar> matchings=new LinkedList<Guitar>();
		ListIterator<Guitar> iter=list.listIterator();		
		while(iter.hasNext()){
			Guitar guitar=iter.next();
			if(guitar.getType()!=g.getType())
				continue;
			matchings.add(guitar);
		}
		return matchings;
	}	
}
