package haitaoblog;

public class MirrorTree {
	public static void main(String[] args){
		TreeNode head=new TreeNode(8);
		head.insert(6);
		head.insert(10);
		head.insert(5);
		head.insert(7);
		mirrorTree(head);
		head.print();
	}
	
	public static void mirrorTree(TreeNode head){
		if(head==null)
			return;
		TreeNode temp=head.left;
		head.left=head.right;
		head.right=temp;
		
		if(head.left!=null)
			mirrorTree(head.left);
		if(head.right!=null)
			mirrorTree(head.right);		
	}
}
