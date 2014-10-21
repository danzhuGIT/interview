package chapterfour;

import java.util.Stack;

public class InorderTraversal{
	public static void main(String[] args){
		TreeNode root=new TreeNode(4);
		root.addNode(3);
		root.addNode(2);
		root.addNode(1);
		//root.addNode(5);
		//root.addNode(6);
		//root.printSubtree(); 
		inOrder(root);
		inOrderWithoutStack(root);
	}
	
	public static void inOrder(TreeNode root){
		if(root==null)
			return;
		
		Stack<TreeNode> s=new Stack<TreeNode>();
		visit(s,root);
		TreeNode prev=null;

		while(!s.isEmpty()){
			TreeNode cur=s.pop();
			if((cur.left==null&&cur.right==null)||isVisited(s,cur,prev)){
				System.out.print(cur.value);
				prev=cur;
			}
			else{
				visit(s,cur);			
			}
		}
	}
	
	public static void visit(Stack<TreeNode> s, TreeNode node){
		if(node.right!=null)
			s.push(node.right);
		s.push(node);
		if(node.left!=null)
			s.push(node.left);
	}
	
	public static boolean isVisited(Stack<TreeNode> s, TreeNode cur, TreeNode prev){		
		if(prev==cur.left)
			return true;
		if(!s.isEmpty()&&cur.right==s.peek())
			return true;		
		return false;
	}
	
	public static void inOrderWithoutStack(TreeNode root){
		if(root==null)
			return;
		
		TreeNode cur=root;
		TreeNode prev=null;
		
		while(cur!=null){
			if(cur.left==null){
				System.out.print(cur.value);
				cur=cur.right;
			}
			else{
				prev=cur.left;
				while(prev.right!=null&&prev.right!=cur)
					prev=prev.right;
				if(prev.right==null){
					prev.right=cur;
					cur=cur.left;
				}
				else{
					prev.right=null;
					System.out.print(cur.value);
					cur=cur.right;
				}
			}
		}
	}
}
