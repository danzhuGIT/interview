package leetCode;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversalIterative {
	public ArrayList<Integer> inorderTraversal(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        Stack<TreeNode> stack=new Stack<TreeNode>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        
        TreeNode current=root;
        while(!stack.isEmpty()||current!=null){
            if(current!=null){
                stack.push(current);
                current=current.left;
            }
            else{
                TreeNode top=stack.pop();
                result.add(top.val);
                current=top.right;
            }
        }
        
        return result;
	}
}
