package chapterthree;

public class StackTwoMain {
	public static void main(String[] args){
		StackWithMin stackMin=new StackWithMin();
		System.out.print(stackMin.min()+" ");
		stackMin.push(3);
		stackMin.push(5);
		System.out.print(stackMin.min()+" ");
		stackMin.push(1);
		System.out.print(stackMin.min()+" ");
		stackMin.pop();
		System.out.print(stackMin.min()+" ");
		
		StackWithMin2 stackMin2=new StackWithMin2();
		System.out.print(stackMin2.min()+" ");
		stackMin2.push(3);
		stackMin2.push(5);
		System.out.print(stackMin2.min()+" ");
		stackMin2.push(1);
		System.out.print(stackMin2.min()+" ");
		stackMin2.pop();
		System.out.print(stackMin2.min()+" ");
			
	}
}
