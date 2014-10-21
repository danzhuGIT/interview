
import java.util.LinkedList;


public class RandomPickinList {
	public static Integer getRandomElement(LinkedList<Integer> list) {
	if(list.size()==0)
	{
		System.out.println("linkedlist size is zero. error.");
		return null;
	}
	else{
		int index = (int) Math.ceil(Math.random()*(list.size()-1));
		return list.get(index);
	}
}
}
