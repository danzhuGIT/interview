package chapterthree;

public class StackOneMain {
	public static void main(String[] agr){
		StackOne stacktest=new StackOne(5);
		//stacktest.push(0, 10);
		//stacktest.push(0, 11);
		//stacktest.push(0, 12);
		stacktest.push(1, 21);
		stacktest.push(1, 22);
		stacktest.push(1, 31);
		
		if(!stacktest.isEmpty(0)){
			System.out.print(stacktest.peek(0));
			stacktest.pop(0);
			System.out.print(stacktest.peek(0));
			}
		else
			System.out.print("stack is empty.");
		
	}
}
