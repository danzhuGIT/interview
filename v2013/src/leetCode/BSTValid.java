package leetCode;

public class BSTValid {
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        return recursion(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    boolean recursion(TreeNode root, int low, int high){
        if(root==null)
            return true;
        
        if(root.val>low&&root.val<high)
            return recursion(root.left,low,root.val)&&recursion(root.right,root.val,high);
        else
            return false;
    }
}
