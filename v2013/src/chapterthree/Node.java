package chapterthree;

public class Node<T> {
	public T data;
	public Node next;
	public Node(T d, Node n){
		data=d;
		next=n;
	}
}
