package leetCode;

public class ListPartition {
    public ListNode partition(ListNode head, int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ListNode cur=head;
        ListNode left=new ListNode(0);
        ListNode result=left;
        ListNode right=new ListNode(0);
        ListNode pivot=right;
        while(cur!=null){
            if(cur.val<x){
                left.next=new ListNode(cur.val);
                left=left.next;    
            }
            else{
                right.next=new ListNode(cur.val);
                right=right.next;              
            } 
            cur=cur.next;
        }
        left.next=pivot.next;
        return result.next;
    }
}
