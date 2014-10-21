package leetCode;

public class TreeSymmetic {
	public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null)
            return true;
            
        return recursion(root.left, root.right);
        
    }
    
    public boolean recursion(TreeNode p, TreeNode q){
        if(p==null||q==null)
            return p==null? q==null : p==null;
        
        if(p.val!=q.val)
            return false;
            
        return recursion(p.left,q.right) && recursion(p.right,q.left);
    }
}
