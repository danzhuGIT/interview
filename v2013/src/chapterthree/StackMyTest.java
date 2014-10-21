package chapterthree;

public class StackMyTest {
	public static void main(){
		StackMy<Integer> s=new StackMy<Integer>();
		s.push(1);
		s.push(2);
		System.out.print(s.pop());
		System.out.print(s.pop());
		
	}
}
