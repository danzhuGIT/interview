package leetCode;

public class ListNode {
	public int val;
	public ListNode next;
	
	public ListNode(int v){
		val=v;
		next=null;
	}
	
	public void add(int data){
		ListNode cur=this;
		ListNode newNode=new ListNode(data);
		while(cur.next!=null)
			cur=cur.next;
		cur.next=newNode;
	}
	
	public void print(){
		ListNode cur=this;
		while(cur!=null){
			System.out.print(cur.val+" ");
			cur=cur.next;
		}
	}
}
