package chapterthree;

public class StackMy<T> {
	Node top;
	int size=0;
	
	public T pop(){
		if(top==null)
			return null;
		size--;
		return (T) top.data;
	}
	
	public void push(T d){
		Node newNode=new Node<T>(d,top);
		top=newNode;
		size++;
	}
	
	public int getSize(){
		return size;
	}
	
}
