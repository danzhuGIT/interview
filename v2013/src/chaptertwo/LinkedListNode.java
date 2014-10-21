package chaptertwo;

public class LinkedListNode {
	public int data;
	public LinkedListNode next;
	
	public LinkedListNode(int d){
		data=d;
		next=null;
	}
	
	public LinkedListNode addNext(int d){	
		LinkedListNode newNode=new LinkedListNode(d);
		LinkedListNode temp=next;
		next=newNode;
		newNode.next=temp;
		return newNode;
	}
	
	public void print(){
		LinkedListNode t=this;
		while(t!=null){
			System.out.print(t.data+" ");
			t=t.next;
		}
	}
}
