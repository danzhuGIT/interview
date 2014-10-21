package leetCode;

public class PopulateNextRight {
	public void connect(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root==null)
            return;
        
        TreeLinkNode cur=root;
        TreeLinkNode curNext;
        if(root.left!=null){
            while(cur!=null){
                curNext=cur.next;
                cur.left.next=cur.right;
                if(curNext!=null){
                    cur.right.next=curNext.left;
                }
                cur=cur.next;
            }
        }
        connect(root.left);
    }
	
	public void connectII(TreeLinkNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if (root==null)
            return;
        
        TreeLinkNode p=root;
        TreeLinkNode q=null;
        TreeLinkNode nextLevel=null;
        
        while(p!=null){
            if(p.left!=null){
                if(q!=null)
                    q.next=p.left;
                q=p.left;             
                if(nextLevel==null)
                    nextLevel=q;
            }
            if(p.right!=null){
                if(q!=null)
                    q.next=p.right;
                q=p.right;
                if(nextLevel==null)
                    nextLevel=q;
            }
            p=p.next;
        }
        connect(nextLevel);
    }
}
