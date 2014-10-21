package leetCode;

public class ReversePartialLinkedList {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(m==n)
            return head;
        
        int index=0;
        ListNode beforeNode=new ListNode(0);
        beforeNode.next=head;
        while(index+1<m){
            beforeNode=beforeNode.next;
            index++;
        }
        index+=2;
        ListNode prev=beforeNode.next;
        ListNode cur=prev.next;
        while(index<=n){
            prev.next=cur.next;
            cur.next=beforeNode.next;
            beforeNode.next=cur;
            
            cur=prev.next;
            index++;
        }
        if(m==1)
            return beforeNode.next;
        else 
        	return head;
       
    }
}
