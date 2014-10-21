package leetCode;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	
	public TreeNode(int d){
		val=d;
	}
	
	public void printInorder()
	{
		if(left!=null)
			left.printInorder();
		System.out.print(val+" ");
		if(right!=null)
			right.printInorder();
		
	}
	
	public void printPreorder()
	{
		System.out.print(val+" ");
		if(left!=null)
			left.printPreorder();
		if(right!=null)
			right.printPreorder();
		
	}
	public void printPostorder()
	{
		if(left!=null)
			left.printPostorder();
		if(right!=null)
			right.printPostorder();
		System.out.print(val+" ");
		
	}
	
}
