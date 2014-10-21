package haitaoblog;

import java.util.LinkedList;
import java.util.Queue;

public class PrintTreeTopToBottom {
	public static void main(String[] args){
		TreeNode head=new TreeNode(8);
		head.insert(6);
		head.insert(10);
		head.insert(5);
		head.insert(7);
		printTreeTopToBottom(head);
	}
	public static void printTreeTopToBottom(TreeNode head){
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(head);
		TreeNode curNode;
		while(q.size()!=0){
			curNode=q.remove();
			System.out.print(curNode.data+" ");
			if(curNode.left!=null)
				q.add(curNode.left);
			if(curNode.right!=null)
				q.add(curNode.right);			
		}
	}
}
