package chaptertwo;

public class LinkedListFive {
	public static void main(String[] args){
		LinkedListNode head=new LinkedListNode(1);
		LinkedListNode node2=new LinkedListNode(2);
		LinkedListNode node3=new LinkedListNode(3);
		LinkedListNode node4=new LinkedListNode(4);
		LinkedListNode node5=new LinkedListNode(5);
		LinkedListNode node6=new LinkedListNode(6);
		head.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node6;
		node6.next=node3;
		
		if(deleteNode(node2))
			head.print();
		
		System.out.print(findCircleBegin(head).data);	
	}
	
	public static LinkedListNode findCircleBegin(LinkedListNode head){
		LinkedListNode slow=head;
		LinkedListNode fast=head;
		
		while(fast.next!=null){
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
				break;
		}
		
		if(fast.next==null)
			return null;
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
	
	public static boolean deleteNode(LinkedListNode n){
		if(n==null||n.next==null)
			return false;
		LinkedListNode next=n.next;
		n.data=next.data;
		n.next=next.next;
		return true;
	}
}
