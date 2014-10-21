package leetCode;

import java.util.ArrayList;

public class TreePathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root==null) 
            return false;
            
        if(root.left==null&&root.right==null){
            if(sum==root.val)
                return true;
            else
                return false;
        }

        return hasPathSum(root.left,sum-root.val) || hasPathSum(root.right,sum-root.val);
    }
    public ArrayList<ArrayList<Integer>> pathSumII(TreeNode root, int sum) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> candidate=new ArrayList<Integer>();
        recursion(root,sum,candidate,result);
        return result;
    }
    
    public void recursion(TreeNode root, int sum, ArrayList<Integer> candidate, ArrayList<ArrayList<Integer>> result){
        if(root==null) 
            return ;
            
        if(root.left==null&&root.right==null){
            if(sum==root.val){
                candidate.add(root.val);
                result.add(candidate);
                
            }
            else
                return;
        }
        else{
            candidate.add(root.val);
        }
        ArrayList<Integer> candidateB=(ArrayList<Integer>) candidate.clone();
        recursion(root.left,sum-root.val,candidate,result);

        recursion(root.right,sum-root.val,candidateB,result);
        
    }
}
