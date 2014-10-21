package leetCode;

public class TreeSame {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(p==null||q==null)
            return p==null? q==null : p==null;
        
        if(p.val!=q.val)
            return false;
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
