package chapterthree;

public class StackFive {
	public static void main(String[] arg){
		MyQueue q=new MyQueue();
		q.add("a");
		q.add("b");
		q.add("c");
		q.add("d");
		
		q.remove();
		String head=q.peek();
		System.out.println(head);
		System.out.println(q.queueSize());
		q.remove();
		head=q.peek();
		System.out.println(head);
		System.out.println(q.queueSize());
		q.remove();
		head=q.peek();
		System.out.println(head);
		System.out.println(q.queueSize());
	}
}
