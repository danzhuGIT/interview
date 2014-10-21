package leetCode;

public class DeleteDuplicateInList {
	public ListNode deleteDuplicates(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null)
            return head;
        
        ListNode start=head;
        ListNode runner=head.next;
        while(runner!=null){
            if(runner.val==start.val)
                start.next=runner.next;
            else
                start=start.next;
            runner=runner.next;            
            
        }
        return head;
    }
	public ListNode deleteDuplicates2(ListNode head) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(head==null||head.next==null)
            return head;
            
        ListNode first=null;
        
        ListNode prePrev=null;
        ListNode pre=head;
        ListNode cur=head.next;
        int key=pre.val;
        
        while(pre!=null && cur!=null){
            if(first==null&&prePrev!=null)
                first=prePrev;
                
            if(cur.val!=key){
                prePrev=pre;
                pre=cur;
                cur=cur.next;
                key=pre.val;
            }
            else{
                while(cur!=null&&cur.val==key)
                    cur=cur.next;
                if(prePrev!=null)
                    prePrev.next=cur;
                pre=cur;
                
                if(pre!=null){
                    cur=pre.next;
                    key=pre.val;
                }
            }
        }
        if(first==null){
            if(prePrev!=null)
                first=prePrev;
            else if(pre!=null)
                first=pre;
        }

            
        return first;
        
    }
}
