package leetCode;

import java.util.ArrayList;

public class ListMerge {
	public static void main(String[] args){
		
	}
	public static ListNode listMerge(ArrayList<ListNode> lists){
		ListNode head=null;
		for(ListNode list:lists){
			head=merge(head,list);
		}
		return head;
	}
	static ListNode merge(ListNode head1,ListNode head2){
		if (head1==null||head2==null){
			return head1==null? head2:head1;
		}
		if(head1.val<head2.val){
			head1.next=merge(head1.next,head2);
			return head1;
		}
		else{
			head2.next=merge(head1,head2.next);
			return head2;
		}
		
	}
}
