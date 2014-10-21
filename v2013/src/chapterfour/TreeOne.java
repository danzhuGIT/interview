package chapterfour;

public class TreeOne {
	public static void main(String[] arg){
		TreeNode root=new TreeNode(14);
		root.addNode(7);
		root.addNode(16);
		root.addNode(8);
		
		root.printSubtree();
	
		if(checkBalance(root))
			System.out.print("The tree is balanced!");
		else
			System.out.print("The tree is not balanced!");		
	}
	public static int maxDepth(TreeNode root)
	{
		if(root==null)
			return 0;
		else
			return 1+Math.max(maxDepth(root.left),maxDepth(root.right));	
	}
	public static int minDepth(TreeNode root)
	{
		if(root==null)
			return 0;
		else
			return 1+Math.min(minDepth(root.left),minDepth(root.right));	
	}
	
	public static boolean checkBalance(TreeNode root)
	{
		return maxDepth(root)-minDepth(root)<=1;
	}

}