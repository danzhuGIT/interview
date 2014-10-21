package haitaoblog;

public class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode(int d, ListNode n){
		data=d;
		next=n;
	}
	public void print(){
		ListNode temp=this;
		while(temp!=null){
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
}
