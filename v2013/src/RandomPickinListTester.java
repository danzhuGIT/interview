import java.util.LinkedList;

public class RandomPickinListTester {
	public static void main(String[] args){
		LinkedList<Integer> list=new LinkedList<Integer>();
		RandomPickinList.getRandomElement(list);
		list.add(3);
		list.add(7);
		list.add(15);
		System.out.print(RandomPickinList.getRandomElement(list));
	}
}
