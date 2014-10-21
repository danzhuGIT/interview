package leetCode;

public class ListNodeSwap {
	public static void main(String[] args){
		ListNode head=new ListNode(1);
		head.add(2);
		head.add(3);
		head.add(4);
		head.add(5);
		head.add(6);
		head.add(7);
		head.print();
		kSwap(head,4).print();
		//pairSwap(head).print();
		
	}
	public static ListNode pairSwap(ListNode node1){
		if(node1==null||node1.next==null)
			return node1;
		ListNode node2=node1.next;
		node1.next=pairSwap(node2.next);
		node2.next=node1;
		return node2;
			
	}
	
	static ListNode kSwap(ListNode head,int k){
		ListNode cur=head;
		for(int i=0;i<k;i++){
			if(cur==null)
				return head;
			cur=cur.next;
		}
		cur=head;
		ListNode prev=head.next;
		for(int i=0;i<k-1;i++){
			ListNode next=prev.next;
			prev.next=cur;
			cur=prev;
			prev=next;			
		}
		head.next=kSwap(prev,k);
		return cur;
	}
	

}
